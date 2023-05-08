import java.util.ArrayList;

public abstract class AStatementListNode {
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
}
