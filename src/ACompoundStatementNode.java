public class ACompoundStatementNode extends AStatementNode{
    private String beginKeyword;
    private AStatementListNode statementList;
    private String endKeyword;

    public ACompoundStatementNode(String beginKeyword, AStatementListNode statementList, String endKeyword) {
        this.beginKeyword = beginKeyword;
        this.statementList = statementList;
        this.endKeyword = endKeyword;
    }

    public ACompoundStatementNode(String beginKeyword, AStatementListNode statementList) {
        this.beginKeyword = beginKeyword;
        this.statementList = statementList;
    }

    public AStatementListNode getStatementListNode() {
        return statementList;
    }
}
