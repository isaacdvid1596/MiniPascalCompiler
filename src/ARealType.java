public class ARealType extends ATypeNode{
    @Override
    public String toString() {
        return "real";
    }

    @Override
    public <T> T accept(AVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
