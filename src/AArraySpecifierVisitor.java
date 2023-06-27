public class AArraySpecifierVisitor extends MiniPascalBaseVisitor<AArraySpecifierNode>{
    private SymbolTable symbolTable = SymbolTable.getInstance();
    @Override
    public AArraySpecifierNode visitArraySpecifier(MiniPascalParser.ArraySpecifierContext ctx) {
        symbolTable.enterScope();
        String array = ctx.ARRAY().getText();
        String lbracket = ctx.LBRACKET().getText();
        AIndexRangeVisitor indexRangeVisitor = new AIndexRangeVisitor();
        AIndexRangeNode indexRange = indexRangeVisitor.visit(ctx.index_range());
        String rbracket= ctx.RBRACKET().getText();
        String of = ctx.OF().getText();
        ATypeVisitor typeVisitor = new ATypeVisitor();
        ATypeNode type = typeVisitor.visit(ctx.type());
        symbolTable.exitScope();
        return new AArraySpecifierNode(array,lbracket,indexRange,rbracket,type);
    }
}
