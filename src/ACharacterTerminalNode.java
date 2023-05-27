public class ACharacterTerminalNode extends AFactorNode{
    private String character;

    public ACharacterTerminalNode(String character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return this.character;
    }
}
