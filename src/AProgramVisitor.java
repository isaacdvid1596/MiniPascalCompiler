public class AProgramVisitor extends MiniPascalBaseVisitor<AProgramNode>{

    AProgramNode programNode;

    @Override
    public AProgramNode visitProgram(MiniPascalParser.ProgramContext ctx) {
        String programKeyword = ctx.PROGRAM().getText();
        String name = ctx.IDENTIFIER().getText();
//        ACodeBlockNode codeBlock = visitCodeBlockHelper(ctx.code_block());
        ACodeBlockVisitor blockVisitor = new ACodeBlockVisitor();
        ACodeBlockNode codeBlock = blockVisitor.visit(ctx.code_block());
        return new AProgramNode(programKeyword, name,codeBlock);
    }
//    public ACodeBlockNode visitCodeBlockHelper(MiniPascalParser.Code_blockContext ctx) {
//        CodeBlockVisitor blockVisitor = new CodeBlockVisitor();
//        return blockVisitor.visit(ctx);
//    }
}
