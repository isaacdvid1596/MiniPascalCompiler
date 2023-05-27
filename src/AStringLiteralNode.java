public class AStringLiteralNode extends AFactorNode{
    private String string;

    public AStringLiteralNode(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return this.string;
    }
}
