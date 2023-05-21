public class AFunctionCallNode extends AStatementNode{
    private String identifier;
    private String leftParenthesis;
    private AArgumentListNode argumentListNode;
    private String rightParenthesis;

    public AFunctionCallNode(String identifier, String leftParenthesis, AArgumentListNode argumentListNode, String rightParenthesis) {
        this.identifier = identifier;
        this.leftParenthesis = leftParenthesis;
        this.argumentListNode = argumentListNode;
        this.rightParenthesis = rightParenthesis;
    }

    public AFunctionCallNode(String identifier, String leftParenthesis, String rightParenthesis) {
        this.identifier = identifier;
        this.leftParenthesis = leftParenthesis;
        this.rightParenthesis = rightParenthesis;
    }
}
