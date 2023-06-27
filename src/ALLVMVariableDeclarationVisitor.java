public class ALLVMVariableDeclarationVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitVariable_declaration(MiniPascalParser.Variable_declarationContext ctx) {
//        StringBuilder llvmCode = new StringBuilder();
//
//        String varName = ctx.IDENTIFIER().getText();
//        ALLVMTypeVisitor typeVisitor = new ALLVMTypeVisitor();
//        String varType = typeVisitor.visit(ctx.type());
//
//        llvmCode.append("%"+varName+" = alloca "+varType+"\n");
//        return llvmCode.toString();
        String varName = ctx.IDENTIFIER().getText();
        String varType = ctx.type().getText();
        String llvmType = "";
        switch (varType) {
            case "integer":
                llvmType = "i32";
                break;
            // Other type conversions can be handled here
        }
        return "%" + varName + " = alloca " + llvmType + "\n";
    }
}
