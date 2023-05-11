public class AWriteStatementNode extends AStatementNode{

    private String writeKeyword;
    private String leftParenthesis;
    private AExpressionNode expressionNode;
    private String rightParenthesis;

    public AWriteStatementNode(String writeKeyword, String leftParenthesis, AExpressionNode expressionNode, String rightParenthesis) {
        this.writeKeyword = writeKeyword;
        this.leftParenthesis = leftParenthesis;
        this.expressionNode = expressionNode;
        this.rightParenthesis = rightParenthesis;
    }

    @Override
    public <T> T accept(AStatementVisitor visitor) {
        return null;
    }
}
