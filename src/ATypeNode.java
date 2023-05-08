public abstract class ATypeNode{
    public abstract String toString();
    public abstract <T> T accept(AVisitor<T> visitor);
}
