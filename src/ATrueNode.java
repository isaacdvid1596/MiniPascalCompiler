public class ATrueNode extends AFactorNode{
    private String trueKeyword;

    public ATrueNode(String trueKeyword) {
        this.trueKeyword = trueKeyword;
    }

    @Override
    public String toString() {
        return this.trueKeyword;
    }
}
