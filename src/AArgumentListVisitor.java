import org.antlr.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class AArgumentListVisitor extends MiniPascalBaseVisitor<AArgumentListNode>{
    ArrayList<String> delimiters = new ArrayList<>();
    ArrayList<AExpressionNode> expressionNodes = new ArrayList<>();
    @Override
    public AArgumentListNode visitArgumentList(MiniPascalParser.ArgumentListContext ctx) {
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression(0));
        if(ctx.DELIMITER()!=null && ctx.expression(1)!=null){
            for(TerminalNode delimiterNode: ctx.DELIMITER()){
                String delimiter = delimiterNode.getText();
                delimiters.add(delimiter);
            }
            for(MiniPascalParser.ExpressionContext expressionContext: ctx.expression().subList(1,ctx.expression().size())){
                AExpressionNode aExpressionNode = expressionVisitor.visit(expressionContext );
                expressionNodes.add(aExpressionNode);
            }
            return new AArgumentListNode(expressionNode,delimiters,expressionNodes);
        }
        return new AArgumentListNode(expressionNode);
    }
}
