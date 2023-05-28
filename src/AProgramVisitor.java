public class AProgramVisitor extends MiniPascalBaseVisitor<AProgramNode>{

    @Override
    public AProgramNode visitProgram(MiniPascalParser.ProgramContext ctx) {
        String programKeyword = ctx.PROGRAM().getText();
        String name = ctx.IDENTIFIER().getText();
        String semicolon = ctx.SEMICOLON().getText();
        ACodeBlockVisitor blockVisitor = new ACodeBlockVisitor();
        ACodeBlockNode codeBlock = blockVisitor.visit(ctx.code_block());
        return new AProgramNode(programKeyword, name, semicolon,codeBlock);
    }
}
