public class ARelOpVisitor extends MiniPascalBaseVisitor<ARelOpNode>{
    @Override
    public ARelOpNode visitRelop(MiniPascalParser.RelopContext ctx) {
        String operator = ctx.getText();
        return new ARelOpNode(operator);
    }
}
