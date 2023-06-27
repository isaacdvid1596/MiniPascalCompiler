public class LLVMExpressionVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitExpresion(MiniPascalParser.ExpresionContext ctx) {
        String llvmCode = "";
        llvmCode = ctx.simple_expression(0).getText();
        return llvmCode;
    }
}
