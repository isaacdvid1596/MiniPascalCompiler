public class AIfStatementNode extends AStatementNode{
    private String ifKeyword;
    private AExpressionNode expressionNode;
    private String thenKeyword;
    private AStatementNode statementNode;
    private String elseKeyword;
    private AStatementNode optionalStatementNode;

    public AIfStatementNode(String ifKeyword, AExpressionNode expressionNode, String thenKeyword, AStatementNode statementNode) {
        this.ifKeyword = ifKeyword;
        this.expressionNode = expressionNode;
        this.thenKeyword = thenKeyword;
        this.statementNode = statementNode;
    }

    public AIfStatementNode(String ifKeyword, AExpressionNode expressionNode, String thenKeyword, AStatementNode statementNode, String elseKeyword, AStatementNode optionalStatementNode) {
        this.ifKeyword = ifKeyword;
        this.expressionNode = expressionNode;
        this.thenKeyword = thenKeyword;
        this.statementNode = statementNode;
        this.elseKeyword = elseKeyword;
        this.optionalStatementNode = optionalStatementNode;
    }
}
