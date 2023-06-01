import org.antlr.v4.runtime.Token;

public class AFunctionDeclarationNode extends AStatementNode{
    private String functionKeyword;
    private String identifier;
    private String leftParenthesis;
    private AParameterListNode parameterListNode;
    private String rightParenthesis;
    private String colon;
    private ATypeNode type;
    private String semicolon;
    private AFunctionBlockNode functionBlockNode;
    private Token startToken;


    public AFunctionDeclarationNode(String functionKeyword, String identifier, String leftParenthesis, AParameterListNode parameterListNode, String rightParenthesis, String colon, ATypeNode typeNode, String semicolon, AFunctionBlockNode functionBlockNode) {
        this.functionKeyword = functionKeyword;
        this.identifier = identifier;
        this.leftParenthesis = leftParenthesis;
        this.parameterListNode = parameterListNode;
        this.rightParenthesis = rightParenthesis;
        this.colon = colon;
        this.type = typeNode;
        this.semicolon = semicolon;
        this.functionBlockNode = functionBlockNode;
    }

    public VariableType getVariableType(){
        if(type instanceof AIntegerType){
            return VariableType.INTEGER;
        }else if(type instanceof ARealType){
            return VariableType.REAL;
        }else if(type instanceof ABooleanType){
            return VariableType.BOOLEAN;
        }else if(type instanceof AStringType){
            return VariableType.STRING;
        }else if(type instanceof ACharType){
            return VariableType.CHAR;
        }else if(type instanceof AArraySpecifierNode){
            return VariableType.ARRAY;
        }
        return null;
    }

    public AParameterListNode getParameterListNode() {
        return parameterListNode;
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
