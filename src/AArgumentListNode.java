import java.util.ArrayList;

public class AArgumentListNode {
    private AExpressionNode firstExpression;
    private ArrayList<String> delimiters;
    private ArrayList<AExpressionNode> aExpressionNodes;

    public AArgumentListNode(AExpressionNode firstExpression) {
        this.firstExpression = firstExpression;
    }

    public AArgumentListNode(AExpressionNode firstExpression, ArrayList<String> delimiters, ArrayList<AExpressionNode> aExpressionNodes) {
        this.firstExpression = firstExpression;
        this.delimiters = delimiters;
        this.aExpressionNodes = aExpressionNodes;
    }

    public AExpressionNode getFirstExpression() {
        return firstExpression;
    }

    public ArrayList<AExpressionNode> getExpressionNodes() {
        return aExpressionNodes;
    }
}
