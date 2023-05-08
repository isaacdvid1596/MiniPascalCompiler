public class ATypeVisitor extends MiniPascalBaseVisitor<ATypeNode>{
    @Override
    public ATypeNode visitInteger(MiniPascalParser.IntegerContext ctx) {
        return new AIntegerType();
    }

    @Override
    public ATypeNode visitReal(MiniPascalParser.RealContext ctx) {
        return new ARealType();
    }

    @Override
    public ATypeNode visitBoolean(MiniPascalParser.BooleanContext ctx) {
        return new ABooleanType();
    }

    @Override
    public ATypeNode visitChar(MiniPascalParser.CharContext ctx) {
        return new ACharType();
    }

    @Override
    public ATypeNode visitString(MiniPascalParser.StringContext ctx) {
        return new AStringType();
    }

    @Override
    public ATypeNode visitArraySpecifier(MiniPascalParser.ArraySpecifierContext ctx) {
        AArraySpecifierVisitor aArraySpecifierVisitor = new AArraySpecifierVisitor();
        return aArraySpecifierVisitor.visit(ctx);
    }
}
