public class AFalseNode extends AFactorNode{
    private String falseKeyword;

    public AFalseNode(String falseKeyword) {
        this.falseKeyword = falseKeyword;
    }

    @Override
    public String toString() {
        return this.falseKeyword;
    }
}
