public class AAddOperatorVisitor extends MiniPascalBaseVisitor<AAddOperatorNode>{
    @Override
    public AAddOperatorNode visitAddop(MiniPascalParser.AddopContext ctx) {
        String operator = ctx.getText();
        return new AAddOperatorNode(operator);
    }
}
