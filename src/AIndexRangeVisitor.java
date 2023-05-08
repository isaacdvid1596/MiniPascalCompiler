public class AIndexRangeVisitor extends MiniPascalBaseVisitor<AIndexRangeNode>{
    @Override
    public AIndexRangeNode visitIndexRange(MiniPascalParser.IndexRangeContext ctx) {
        int number1 = Integer.parseInt(ctx.NUMBER(0).getText());
        String dotdot = ctx.getChild(1).getText();
        int number2 = Integer.parseInt(ctx.NUMBER(1).getText());
        return new AIndexRangeNode(number1,dotdot,number2);
    }
}
