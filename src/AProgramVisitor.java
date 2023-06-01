import org.antlr.v4.runtime.ParserRuleContext;
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

        return new AProgramNode(programKeyword, name, semicolon,codeBlock);
    }
}
