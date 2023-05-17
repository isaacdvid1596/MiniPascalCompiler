import java.util.List;

public class AFunctionBlockNode {
    private List<AVarDeclarationNode> variableDeclarations;
    private List<ACompoundStatementNode> compoundStatementNode;
    private String functionEndKeyword;

    public AFunctionBlockNode(List<AVarDeclarationNode> variableDeclarations,List<ACompoundStatementNode> compoundStatementNode, String functionEndKeyword) {
        this.variableDeclarations = variableDeclarations;
        this.compoundStatementNode = compoundStatementNode;
        this.functionEndKeyword = functionEndKeyword;
    }

    public AFunctionBlockNode(List<ACompoundStatementNode> compoundStatementNode, String functionEndKeyword) {
        this.compoundStatementNode = compoundStatementNode;
        this.functionEndKeyword = functionEndKeyword;
    }
}
