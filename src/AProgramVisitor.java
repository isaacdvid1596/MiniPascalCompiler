import org.antlr.v4.runtime.Token;

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

        validateCodeBlock(codeBlock);

        return new AProgramNode(programKeyword, name, semicolon,codeBlock);
    }

    private void validateCodeBlock(ACodeBlockNode codeBlock) {
        for(AVarDeclarationNode varDeclarationNode: codeBlock.getVarDeclarations()){
            for(AVariableDeclarationNode variable: varDeclarationNode.getVariableDeclarations()){
                String varName = variable.getIdentifier();
                if(symbolTable.containsVariable(varName)){
                    throw new SemanticException(varName+" already declared in this scope");
                }else{
                    VariableType variableType = variable.getVariableType();
                    symbolTable.addVariable(varName,variableType);
                }
            }
        }
    }
}
