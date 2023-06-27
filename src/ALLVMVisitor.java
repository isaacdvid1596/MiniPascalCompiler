public class ALLVMVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitProgram(MiniPascalParser.ProgramContext ctx) {
        StringBuilder llvmCode = new StringBuilder();
        String programName = "main";
        llvmCode.append("declare i32 @printf(i8*, ...)\n");
        llvmCode.append("@str0 = private unnamed_addr constant [13 x i8] c\"hello world!\\00\", align 1\n");
        llvmCode.append("define i32 @"+programName+"() {\n");
        LLVMCodeBlockVisitor codeBlockVisitor = new LLVMCodeBlockVisitor();
        llvmCode.append(codeBlockVisitor.visit(ctx.code_block()));
        llvmCode.append(" ret i32 0\n");
        llvmCode.append("}\n");
        return llvmCode.toString();
    }
}
