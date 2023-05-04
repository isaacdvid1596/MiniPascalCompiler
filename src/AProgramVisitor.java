public class AProgramVisitor extends MiniPascalBaseVisitor<AProgramNode>{

    AProgramNode programNode;

    @Override
    public AProgramNode visitProgram(MiniPascalParser.ProgramContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        ACodeBlockNode codeBlock = visitCodeBlockHelper(ctx.code_block());
        return new AProgramNode(name,codeBlock);
    }
    public ACodeBlockNode visitCodeBlockHelper(MiniPascalParser.Code_blockContext ctx) {
        CodeBlockVisitor blockVisitor = new CodeBlockVisitor();
        return blockVisitor.visit(ctx);
    }
}
