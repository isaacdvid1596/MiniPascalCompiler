public class ALLVMVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitProgram(MiniPascalParser.ProgramContext ctx) {
        StringBuilder llvmCode = new StringBuilder();
        String programName = ctx.IDENTIFIER().getText();
        llvmCode.append("define void @"+programName+"() {\n");
        ACodeBlockVisitor codeBlockVisitor = new ACodeBlockVisitor();
        llvmCode.append(codeBlockVisitor.visit(ctx.code_block()));
        llvmCode.append("}\n");
        return llvmCode.toString();
    }
}
