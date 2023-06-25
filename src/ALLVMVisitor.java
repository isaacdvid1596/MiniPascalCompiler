public class ALLVMVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitProgram(MiniPascalParser.ProgramContext ctx) {
        StringBuilder llvmCode = new StringBuilder();
        String programName = "main";
        llvmCode.append("define i32 @"+programName+"() {\n");
        LLVMCodeBlockVisitor codeBlockVisitor = new LLVMCodeBlockVisitor();
        llvmCode.append(codeBlockVisitor.visit(ctx.code_block()));
        llvmCode.append(" ret i32 0\n");
        llvmCode.append("}\n");
        return llvmCode.toString();
    }
}
