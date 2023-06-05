import org.antlr.v4.runtime.Token;

public class AAssignmentStatementNode extends AStatementNode{
    private AVariableNode variableNode;
    private String assignOperator;
    private AExpressionNode expressionNode;
    private AFunctionCallNode functionCallNode;
    private Token startToken;

    public AAssignmentStatementNode(AVariableNode variableNode, String assignOperator, AExpressionNode expressionNode) {
        this.variableNode = variableNode;
        this.assignOperator = assignOperator;
        this.expressionNode = expressionNode;
    }

    public AAssignmentStatementNode(AVariableNode variableNode, String assignOperator, AFunctionCallNode functionCallNode) {
        this.variableNode = variableNode;
        this.assignOperator = assignOperator;
        this.functionCallNode = functionCallNode;
    }

    public AExpressionNode getExpressionNode() {
        return expressionNode;
    }

    public AVariableNode getVariableNode() {
        return variableNode;
    }

    public void setStartToken(Token token){
        this.startToken = token;
    }

    public Token getStartToken() {
        return this.startToken;
    }

}
