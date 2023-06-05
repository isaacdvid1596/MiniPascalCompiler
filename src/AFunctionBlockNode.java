import java.util.List;

public class AFunctionBlockNode {
    private List<AVarDeclarationNode> variableDeclarations;
    private ACompoundStatementNode compoundStatementNode;
    private String functionEndKeyword;

    public AFunctionBlockNode(List<AVarDeclarationNode> variableDeclarations,ACompoundStatementNode compoundStatementNode, String functionEndKeyword) {
        this.variableDeclarations = variableDeclarations;
        this.compoundStatementNode = compoundStatementNode;
        this.functionEndKeyword = functionEndKeyword;
    }

    public AFunctionBlockNode(ACompoundStatementNode compoundStatementNode, String functionEndKeyword) {
        this.compoundStatementNode = compoundStatementNode;
        this.functionEndKeyword = functionEndKeyword;
    }

    public ACompoundStatementNode getCompoundStatementNode() {
        return compoundStatementNode;
    }
}
