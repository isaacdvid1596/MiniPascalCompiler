public class ANotFactorNode extends AFactorNode{
    private String notKeyword;
    private AFactorNode factorNode;

    public ANotFactorNode(String notKeyword, AFactorNode factorNode) {
        this.notKeyword = notKeyword;
        this.factorNode = factorNode;
    }

    @Override
    public String toString() {
        return this.notKeyword+this.factorNode;
    }
}
