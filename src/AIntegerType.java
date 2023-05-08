public class AIntegerType extends ATypeNode{

    @Override
    public <T> T accept(AVisitor<T> visitor) {
        return visitor.visit(this);
    }
    @Override
    public String toString() {
        return "integer";
    }
}
