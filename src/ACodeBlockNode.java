import org.antlr.v4.runtime.Token;

import java.util.List;

public class ACodeBlockNode {
    private List<AVarDeclarationNode> varDeclarations;
    private List<AFunctionDeclarationNode> functionDeclarations;
    private List<ACompoundStatementNode> compoundStatements;
    private String programEndKeyword;
    private Token startToken;

    public ACodeBlockNode(List<AVarDeclarationNode> varDeclarations, List<AFunctionDeclarationNode> functionDeclarations, List<ACompoundStatementNode> compoundStatements, String programEndKeyword) {
            this.varDeclarations = varDeclarations;
            this.functionDeclarations = functionDeclarations;
            this.compoundStatements = compoundStatements;
            this.programEndKeyword = programEndKeyword;
    }

    public List<AVarDeclarationNode> getVarDeclarations() {
        return varDeclarations;
    }
    public List<AFunctionDeclarationNode> getFunctionDeclarations() {
        return functionDeclarations;
    }

    public List<ACompoundStatementNode> getCompoundStatements() {
        return compoundStatements;
    }

    public void setStartToken(Token token){
        this.startToken = token;
    }

    public Token getStartToken() {
        return this.startToken;
    }

    public boolean programEndExists(){
        if(!programEndKeyword.equals(".")){
            return false;
        }
        return true;
    }
}
