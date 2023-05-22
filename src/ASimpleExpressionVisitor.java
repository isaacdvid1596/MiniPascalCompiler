import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class ASimpleExpressionVisitor extends MiniPascalBaseVisitor<ASimpleExpressionNode>{
    ArrayList<String> addOps = new ArrayList<>();
    ArrayList<String> ors = new ArrayList<>();
    ArrayList<ATermNode> terms = new ArrayList<>();
    @Override
    public ASimpleExpressionNode visitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx) {
        ATermVisitor termVisitor = new ATermVisitor();
        ATermNode termNode = termVisitor.visit(ctx.term(0));
        if(ctx.addop()!=null){
            return null;
        }else if(ctx.OR()!=null){
            return null;
        }
        return null;
    }
}
