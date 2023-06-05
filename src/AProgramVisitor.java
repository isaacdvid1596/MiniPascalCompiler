import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class AProgramVisitor extends MiniPascalBaseVisitor<AProgramNode>{
    private SymbolTable symbolTable = new SymbolTable();
    private ArrayList<SemanticException> semanticExceptions = new ArrayList<>();

    @Override
    public AProgramNode visitProgram(MiniPascalParser.ProgramContext ctx) {
        String programKeyword = ctx.PROGRAM().getText();
        String name = ctx.IDENTIFIER().getText();
        String semicolon = ctx.SEMICOLON().getText();

        symbolTable.enterScope();

        ACodeBlockVisitor blockVisitor = new ACodeBlockVisitor();
        ACodeBlockNode codeBlock = blockVisitor.visit(ctx.code_block());

        symbolTable.exitScope();

        AProgramNode programNode = new AProgramNode(programKeyword, name, semicolon,codeBlock);

        return programNode;
    }
}
