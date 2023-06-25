import org.antlr.v4.runtime.Token;

public class AFunctionCallNode extends AStatementNode{
    private String identifier;
    private String leftParenthesis;
    private AArgumentListNode argumentListNode;
    private String rightParenthesis;
    private Token startToken;

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

    public AArgumentListNode getArgumentListNode() {
        return argumentListNode;
    }
    public String getIdentifier() {
        return identifier;
    }

    public void setStartToken(Token token){
        this.startToken = token;
    }

    public Token getStartToken() {
        return this.startToken;
    }
}
