import java.util.ArrayList;

public class AStatementListNode {
    private AStatementNode statementNode;
    private ArrayList<String> semicolons;
    private ArrayList<AStatementNode> statementNodes;

    public AStatementListNode(AStatementNode statementNode, ArrayList<String> semicolons, ArrayList<AStatementNode> statementNodes) {
        this.statementNode = statementNode;
        this.semicolons = semicolons;
        this.statementNodes = statementNodes;
    }

    public AStatementListNode(AStatementNode statementNode, ArrayList<String> semicolons) {
        this.statementNode = statementNode;
        this.semicolons = semicolons;
    }

    public ArrayList<AStatementNode> getStatementNodes() {
        return statementNodes;
    }

    public AStatementNode getStatementNode() {
        return statementNode;
    }
}
