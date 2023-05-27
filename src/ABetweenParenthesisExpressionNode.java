public class ABetweenParenthesisExpressionNode extends AFactorNode {
    private String leftParenthesis;
    private AExpressionNode expressionNode;
    private String rightParenthesis;

    public ABetweenParenthesisExpressionNode(String leftParenthesis, AExpressionNode expressionNode, String rightParenthesis) {
        this.leftParenthesis = leftParenthesis;
        this.expressionNode = expressionNode;
        this.rightParenthesis = rightParenthesis;
    }

    @Override
    public String toString() {
        return this.leftParenthesis + this.expressionNode + this.rightParenthesis;
    }
}
