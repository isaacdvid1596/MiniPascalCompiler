import java.util.ArrayList;

public class ASimpleExpressionVisitor extends MiniPascalBaseVisitor<ASimpleExpressionNode>{
    ArrayList<String> addOps = new ArrayList<>();
    ArrayList<String> ors = new ArrayList<>();
    ArrayList<ATermNode> terms = new ArrayList<>();
    @Override
    public ASimpleExpressionNode visitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx) {
        ATermVisitor termVisitor = new ATermVisitor();
        ATermNode termNode = termVisitor.visit(ctx.term(0));

    }
}
