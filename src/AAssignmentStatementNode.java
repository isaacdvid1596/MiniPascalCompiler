public class AAssignmentStatementNode {
    private AVariableNode variableNode;
    private String assignOperator;
    private AExpressionNode expressionNode;
    private AFunctionCallNode functionCallNode;

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
}
