import org.antlr.v4.runtime.Token;

public class ANumberTerminalNode extends AFactorNode{
    private String number;
    private Token startToken;

    public ANumberTerminalNode(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.number;
    }

    public void setStartToken(Token token){
        this.startToken = token;
    }

    public Token getStartToken() {
        return this.startToken;
    }

    public String getNumber() {
        return number;
    }

    //validation to confirm if real or integer?
}
