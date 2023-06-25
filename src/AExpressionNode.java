import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class AExpressionNode {
    private ASimpleExpressionNode aSimpleExpressionNode;
    private ArrayList<ARelOpNode> relOp;
    //deals with erasure issues
    private AAndKeywordWrapper andKeyword;
    private AOrKeywordWrapper orKeyword;
    private ArrayList<ASimpleExpressionNode> aSimpleExpressionNodes;
    private ArrayList<String> semicolons;
    private String semicolon;
    private Token startToken;

    public AExpressionNode(ASimpleExpressionNode aSimpleExpressionNode) {
        this.aSimpleExpressionNode = aSimpleExpressionNode;
    }
    public AExpressionNode(ASimpleExpressionNode aSimpleExpressionNode, String semicolon) {
        this.aSimpleExpressionNode = aSimpleExpressionNode;
        this.semicolon = semicolon;
    }

    public AExpressionNode(ASimpleExpressionNode aSimpleExpressionNode, ArrayList<ARelOpNode> relOp, ArrayList<ASimpleExpressionNode> aSimpleExpressionNodes, ArrayList<String> semicolon) {
        this.aSimpleExpressionNode = aSimpleExpressionNode;
        this.relOp = relOp;
        this.aSimpleExpressionNodes = aSimpleExpressionNodes;
        this.semicolons = semicolon;
    }

    public AExpressionNode(ASimpleExpressionNode aSimpleExpressionNode, AAndKeywordWrapper andKeyword, ArrayList<ASimpleExpressionNode> aSimpleExpressionNodes, ArrayList<String> semicolon) {
        this.aSimpleExpressionNode = aSimpleExpressionNode;
        this.andKeyword = andKeyword;
        this.aSimpleExpressionNodes = aSimpleExpressionNodes;
        this.semicolons = semicolon;
    }

    public AExpressionNode(ASimpleExpressionNode aSimpleExpressionNode, AOrKeywordWrapper orKeyword, ArrayList<ASimpleExpressionNode> aSimpleExpressionNodes, ArrayList<String> semicolon) {
        this.aSimpleExpressionNode = aSimpleExpressionNode;
        this.orKeyword = orKeyword;
        this.aSimpleExpressionNodes = aSimpleExpressionNodes;
        this.semicolons = semicolon;
    }

    public ASimpleExpressionNode getaSimpleExpressionNode() {
        return aSimpleExpressionNode;
    }

    public ArrayList<ASimpleExpressionNode> getaSimpleExpressionNodes() {
        return aSimpleExpressionNodes;
    }

    public void setStartToken(Token token){
        this.startToken = token;
    }

    public Token getStartToken() {
        return this.startToken;
    }
}
