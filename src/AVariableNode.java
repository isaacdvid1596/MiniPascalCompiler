public class AVariableNode {
    private String identifier;
    private AIndexAccessNode indexAccessNode;

    public AVariableNode(String identifier) {
        this.identifier = identifier;
    }

    public AVariableNode(String identifier, AIndexAccessNode indexAccessNode) {
        this.identifier = identifier;
        this.indexAccessNode = indexAccessNode;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AIndexAccessNode getIndexAccessNode() {
        return indexAccessNode;
    }
}
