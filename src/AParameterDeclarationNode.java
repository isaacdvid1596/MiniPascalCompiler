public class AParameterDeclarationNode {
    private String identifier;
    private String colon;
    private ATypeNode type;

    public AParameterDeclarationNode(String identifier, String colon, ATypeNode type) {
        this.identifier = identifier;
        this.colon = colon;
        this.type = type;
    }

}
