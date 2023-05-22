public class AAddOpNode {
    private String operator;

    public AAddOpNode (String operator) { this.operator = operator; };
    public String getOperator () { return operator; };
    @Override
    public String toString () { return this.operator; };
}
