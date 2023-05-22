import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class AIndexAccessVisitor extends MiniPascalBaseVisitor <AIndexAccessNode>{

    ArrayList<String> delimiters= new ArrayList<>();
    ArrayList<AExpressionNode> expressionNodes = new ArrayList<>();
    @Override
    public AIndexAccessNode visitIndexAccess(MiniPascalParser.IndexAccessContext ctx) {
        String lBracket  = ctx.LBRACKET().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression(0));
        if(ctx.DELIMITER() != null && ctx.expression(1) != null){
            for(TerminalNode delimiterNode: ctx.DELIMITER()){
                String delimiter = delimiterNode.getText();
                delimiters.add(delimiter);
            }
            for(MiniPascalParser.ExpressionContext expressionContext: ctx.expression().subList(1,ctx.expression().size())){
                AExpressionNode aExpressionNode = expressionVisitor.visit(expressionContext);
                expressionNodes.add(aExpressionNode);
            }
            String rBracket  = ctx.RBRACKET().getText();
            return new AIndexAccessNode(lBracket,expressionNode,delimiters,expressionNodes,rBracket);
        }
        return new AIndexAccessNode(lBracket,expressionNode,lBracket);
    }
}
