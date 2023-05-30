public class ATypeVisitor extends MiniPascalBaseVisitor<ATypeNode>{
    @Override
    public ATypeNode visitType(MiniPascalParser.TypeContext ctx) {
        if(ctx.INTEGER()!=null){
            String integerKeyword = ctx.INTEGER().getText();
            return new AIntegerType(integerKeyword);
        }else if(ctx.REAL()!=null){
            String realKeyword = ctx.REAL().getText();
            return new ARealType(realKeyword);
        }else if(ctx.BOOLEAN()!=null){
            String booleanKeyword = ctx.BOOLEAN().getText();
            return new ABooleanType(booleanKeyword);
        }else if(ctx.CHAR()!=null){
            String charKeyword = ctx.CHAR().getText();
            return new ACharType(charKeyword);
        }else if(ctx.STRING()!=null){
            String stringKeyword = ctx.STRING().getText();
            return new AStringType(stringKeyword);
        }else if(ctx.array_specifier()!=null){
            AArraySpecifierVisitor arraySpecifierVisitor = new AArraySpecifierVisitor();
            AArraySpecifierNode specifierNode = arraySpecifierVisitor.visit(ctx.array_specifier());
            return specifierNode;
        }
        return null;
    }
}
