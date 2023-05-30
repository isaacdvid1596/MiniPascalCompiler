import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class AProgramVisitor extends MiniPascalBaseVisitor<AProgramNode>{
    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public AProgramNode visitProgram(MiniPascalParser.ProgramContext ctx) {
        String programKeyword = ctx.PROGRAM().getText();
        String name = ctx.IDENTIFIER().getText();
        String semicolon = ctx.SEMICOLON().getText();

        symbolTable.enterScope();

        ACodeBlockVisitor blockVisitor = new ACodeBlockVisitor();
        ACodeBlockNode codeBlock = blockVisitor.visit(ctx.code_block());

        symbolTable.exitScope();

        validateCodeBlock(codeBlock,ctx.code_block());

        return new AProgramNode(programKeyword, name, semicolon,codeBlock);
    }

    private void validateCodeBlock(ACodeBlockNode codeBlock, ParserRuleContext context) {
        for(AVarDeclarationNode varDeclarationNode: codeBlock.getVarDeclarations()){
            for(AVariableDeclarationNode variable: varDeclarationNode.getVariableDeclarations()){
                String varName = variable.getIdentifier();

                if(symbolTable.containsVariable(varName)){
                    Token token = variable.getStartToken();
                    int line = token.getLine();
                    int column = token.getCharPositionInLine();
                    throw new SemanticException(varName+" already declared in this scope, line: "+line+" column:"+column);
                }else{
                    VariableType variableType = variable.getVariableType();
                    symbolTable.addVariable(varName,variableType);
                }
            }
        }
    }
}
