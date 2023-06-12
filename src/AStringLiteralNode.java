import org.antlr.v4.runtime.Token;

public class AStringLiteralNode extends AFactorNode{
    private String string;
    private Token startToken;

    public AStringLiteralNode(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return this.string;
    }

    public void setStartToken(Token token){
        this.startToken = token;
    }

    public Token getStartToken() {
        return this.startToken;
    }
}
