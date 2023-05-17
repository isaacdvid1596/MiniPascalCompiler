public class AFunctionDeclarationNode extends AStatementNode{
    private String functionKeyword;
    private String identifier;
    private String leftParenthesis;
    private AParameterListNode parameterListNode;
    private String rightParenthesis;
    private String colon;
    private ATypeNode typeNode;
    private String semicolon;
    private AFunctionBlockNode functionBlockNode;

    public AFunctionDeclarationNode(String functionKeyword, String identifier, String leftParenthesis, AParameterListNode parameterListNode, String rightParenthesis, String colon, ATypeNode typeNode, String semicolon, AFunctionBlockNode functionBlockNode) {
        this.functionKeyword = functionKeyword;
        this.identifier = identifier;
        this.leftParenthesis = leftParenthesis;
        this.parameterListNode = parameterListNode;
        this.rightParenthesis = rightParenthesis;
        this.colon = colon;
        this.typeNode = typeNode;
        this.semicolon = semicolon;
        this.functionBlockNode = functionBlockNode;
    }
}
