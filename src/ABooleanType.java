public class ABooleanType extends ATypeNode{
    @Override
    public String toString() {
        return "boolean";
    }

    @Override
    public <T> T accept(AVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
