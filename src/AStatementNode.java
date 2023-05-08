public abstract class AStatementNode {
    public abstract <T> T accept(AStatementVisitor visitor);
}
