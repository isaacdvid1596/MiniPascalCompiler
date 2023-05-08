public class AStringType extends ATypeNode{
    @Override
    public String toString() {
        return "string";
    }

    @Override
    public <T> T accept(AVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
