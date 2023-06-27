public class AMulOpVisitor extends MiniPascalBaseVisitor<AMulOpNode>{
    @Override
    public AMulOpNode visitMulop(MiniPascalParser.MulopContext ctx) {
        String operator = ctx.getText();
        return new AMulOpNode(operator);
    }
}