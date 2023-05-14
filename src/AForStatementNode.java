public class AForStatementNode extends AStatementNode {

    private String forKeyword;
    private String identifier;
    private String assignKeyword;
    private AExpressionNode expressionNode;
    private String toKeyword;
    private AExpressionNode secondExpressionNode;
    private String doKeyword;
    private AStatementNode statementNode;

    public AForStatementNode(String forKeyword, String identifier, String assignKeyword, AExpressionNode expressionNode, String toKeyword, AExpressionNode secondExpressionNode, String doKeyword, AStatementNode statementNode) {
        this.forKeyword = forKeyword;
        this.identifier = identifier;
        this.assignKeyword = assignKeyword;
        this.expressionNode = expressionNode;
        this.toKeyword = toKeyword;
        this.secondExpressionNode = secondExpressionNode;
        this.doKeyword = doKeyword;
        this.statementNode = statementNode;
    }
}
