import java.util.ArrayList;

public class AFunctionBlockNode {
    private ArrayList<AVarDeclarationNode> variableDeclarations;
    private ACompoundStatementNode compoundStatementNode;
    private String functionEndKeyword;

    public AFunctionBlockNode(ArrayList<AVarDeclarationNode> variableDeclarations, ACompoundStatementNode compoundStatementNode, String functionEndKeyword) {
        this.variableDeclarations = variableDeclarations;
        this.compoundStatementNode = compoundStatementNode;
        this.functionEndKeyword = functionEndKeyword;
    }

    public AFunctionBlockNode(ACompoundStatementNode compoundStatementNode, String functionEndKeyword) {
        this.compoundStatementNode = compoundStatementNode;
        this.functionEndKeyword = functionEndKeyword;
    }
}
