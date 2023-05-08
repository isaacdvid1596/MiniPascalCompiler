public class ACharType extends ATypeNode{
    @Override
    public String toString() {
        return "char";
    }

    @Override
    public <T> T accept(AVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
