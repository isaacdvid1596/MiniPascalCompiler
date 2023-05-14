public class ARepeatStatementNode extends AStatementNode{

    private String repeatKeyword;
    private AStatementListNode statementListNode;
    private String untilKeyword;
    private AExpressionNode expressionNode;

    public ARepeatStatementNode(String repeatKeyword, AStatementListNode statementListNode, String untilKeyword, AExpressionNode expressionNode) {
        this.repeatKeyword = repeatKeyword;
        this.statementListNode = statementListNode;
        this.untilKeyword = untilKeyword;
        this.expressionNode = expressionNode;
    }
}
