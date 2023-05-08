public class AVariableDeclarationNode {
    private String identifier;
    private String colon;
    private ATypeNode type;
    private AArraySpecifierNode arraySpecifierNode;

    public AVariableDeclarationNode(String identifier, String colon, ATypeNode type, AArraySpecifierNode arraySpecifierNode) {
        this.identifier = identifier;
        this.colon = colon;
        this.type = type;
        this.arraySpecifierNode = arraySpecifierNode;
    }

    public AVariableDeclarationNode(String identifier, String colon, ATypeNode type) {
        this.identifier = identifier;
        this.colon = colon;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getColon() {
        return colon;
    }

    public ATypeNode getType() {
        return type;
    }

    public AArraySpecifierNode getArraySpecifierNode() {
        return arraySpecifierNode;
    }
}
