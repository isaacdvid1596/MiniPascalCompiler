public class ALLVMTypeVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitType(MiniPascalParser.TypeContext ctx) {
        StringBuilder llvmCode = new StringBuilder();

        if(ctx.INTEGER()!=null){
            String integerKeyword = ctx.INTEGER().getText();
            return "i32";
        }else if(ctx.REAL()!=null){
            return "float";
        }else if(ctx.BOOLEAN()!=null){
            return "i1";
        }else if(ctx.CHAR()!=null){
            return "i8";
        }else if(ctx.STRING()!=null){
            return "i8";
        }
//        else if(ctx.array_specifier()!=null){
//            AArraySpecifierVisitor arraySpecifierVisitor = new AArraySpecifierVisitor();
//            AArraySpecifierNode specifierNode = arraySpecifierVisitor.visit(ctx.array_specifier());
//            return specifierNode;
//        }
        return null;
    }
}
