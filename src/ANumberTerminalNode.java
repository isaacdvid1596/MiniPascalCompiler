public class ANumberTerminalNode extends AFactorNode{
    private String number;

    public ANumberTerminalNode(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.number;
    }
}
