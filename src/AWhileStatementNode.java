public class AWhileStatementNode extends AStatementNode{

    private String whileKeyword;
    private AExpressionNode expressionNode;
    private String doKeyword;
    private AStatementNode statementNode;

    public AWhileStatementNode(String whileKeyword, AExpressionNode expressionNode, String doKeyword, AStatementNode statementNode) {
        this.whileKeyword = whileKeyword;
        this.expressionNode = expressionNode;
        this.doKeyword = doKeyword;
        this.statementNode = statementNode;
    }

    @Override
    public <T> T accept(AStatementVisitor visitor) {
        return null;
    }
}
