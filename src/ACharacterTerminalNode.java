import org.antlr.v4.runtime.Token;

public class ACharacterTerminalNode extends AFactorNode{
    private char character;
    private Token startToken;

    public ACharacterTerminalNode(char character) {
        this.character = character;
    }

//    @Override
//    public String toString() {
//        return this.character;
//    }

    public void setStartToken(Token token){
        this.startToken = token;
    }

    public Token getStartToken() {
        return this.startToken;
    }
}
