public class ARelOpNode {
    public String operator;

    public ARelOpNode(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return this.operator;
    }
}
