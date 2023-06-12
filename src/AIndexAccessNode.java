import java.util.ArrayList;

public class AIndexAccessNode {
    private String leftBracket;
    private AExpressionNode expressionNode;
    private ArrayList<String> delimiters;
    private ArrayList<AExpressionNode> expressions;
    private String rightBracket;

    public AIndexAccessNode(String leftBracket, AExpressionNode expressionNode, String rightBracket) {
        this.leftBracket = leftBracket;
        this.expressionNode = expressionNode;
        this.rightBracket = rightBracket;
    }

    public AIndexAccessNode(String leftBracket, AExpressionNode expressionNode, ArrayList<String> delimiters, ArrayList<AExpressionNode> expressions, String rightBracket) {
        this.leftBracket = leftBracket;
        this.expressionNode = expressionNode;
        this.delimiters = delimiters;
        this.expressions = expressions;
        this.rightBracket = rightBracket;
    }

    public AExpressionNode getExpressionNode() {
        return expressionNode;
    }
}
