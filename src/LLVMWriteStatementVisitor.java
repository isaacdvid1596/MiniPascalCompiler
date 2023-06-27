public class LLVMWriteStatementVisitor extends MiniPascalBaseVisitor<String>{
    private static int strCounter = 0;  // static counter for unique string identifiers

    @Override
    public String visitWriteStatement(MiniPascalParser.WriteStatementContext ctx) {
//        String llvmCode = "";
//        LLVMExpressionVisitor expressionVisitor = new LLVMExpressionVisitor();
//        String msg = expressionVisitor.visit(ctx.expression());
//        msg = msg.substring(1,msg.length()-1);
//        llvmCode += "@.str = private unnamed_addr constant [" + (msg.length() + 1) + " x i8] c\"" + msg + "\\00\", align 1\n";
//        llvmCode += "%1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + (msg.length() + 1) + " x i8], [" + (msg.length() + 1) + " x i8]* @.str, i32 0, i32 0))\n";
//        return llvmCode;
        String llvmCode = "";
        LLVMExpressionVisitor expressionVisitor = new LLVMExpressionVisitor();
        String msg = expressionVisitor.visit(ctx.expression());
        msg = msg.substring(1, msg.length() - 1);

        String strId = "@str" + strCounter++;  // create a unique identifier for the string

        // Use strId instead of "@.str" to declare the string
//        llvmCode += strId + " = private unnamed_addr constant [" + (msg.length() + 1) + " x i8] c\"" + msg + "\\00\", align 1\n";
        llvmCode += "%1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + (msg.length() + 1) + " x i8], [" + (msg.length() + 1) + " x i8]* " + strId + ", i32 0, i32 0))\n";
        return llvmCode;
    }
}
