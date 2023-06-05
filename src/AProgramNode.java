import org.antlr.v4.runtime.Token;

public class AProgramNode {
    private String programKeyword;
    private String identifier;
    private String semicolon;
    private ACodeBlockNode codeblock;
    private Token startToken;

    public AProgramNode(String programKeyword, String identifier, String semicolon, ACodeBlockNode codeblock) {
        this.programKeyword = programKeyword;
        this.identifier = identifier;
        this.codeblock = codeblock;
        this.semicolon = semicolon;
    }

    public boolean programExists(){
        if(!programKeyword.equals("program")){
            return false;
        }
        return true;
    }

    public void setStartToken(Token token){
        this.startToken = token;
    }

    public Token getStartToken() {
        return this.startToken;
    }


    @Override
    public String toString() {
        return this.programKeyword+this.identifier+this.semicolon+this.codeblock;
    }
}
