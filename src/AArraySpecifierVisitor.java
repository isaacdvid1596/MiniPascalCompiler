public class AArraySpecifierVisitor extends MiniPascalBaseVisitor<AArraySpecifierNode>{
    @Override
    public AArraySpecifierNode visitArraySpecifier(MiniPascalParser.ArraySpecifierContext ctx) {
        String array = ctx.ARRAY().getText();
        String lbracket = ctx.LBRACKET().getText();
        AIndexRangeVisitor indexRangeVisitor = new AIndexRangeVisitor();
        AIndexRangeNode indexRange = indexRangeVisitor.visit(ctx.index_range());
        String rbracket= ctx.RBRACKET().getText();
        String of = ctx.OF().getText();
        ATypeVisitor typeVisitor = new ATypeVisitor();
        ATypeNode type = typeVisitor.visit(ctx.type());
        return new AArraySpecifierNode(array,lbracket,indexRange,rbracket,type);
    }
}
