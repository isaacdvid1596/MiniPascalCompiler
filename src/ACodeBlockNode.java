import java.util.List;

public class ACodeBlockNode {
    private List<VarDeclarationNode> varDeclarations;
    private List<FunctionDeclarationNode> functionDeclarations;
    private List<CompoundStatementNode> compoundStatements;

    public ACodeBlockNode(List<VarDeclarationNode> varDeclarations, List<FunctionDeclarationNode> functionDeclarations, List<CompoundStatementNode> compoundStatements) {
            this.varDeclarations = varDeclarations;
            this.functionDeclarations = functionDeclarations;
            this.compoundStatements = compoundStatements;
    }

    public List<VarDeclarationNode> getVarDeclarations() {
        return varDeclarations;
    }
    public List<FunctionDeclarationNode> getFunctionDeclarations() {
        return functionDeclarations;
    }

    public List<CompoundStatementNode> getCompoundStatements() {
        return compoundStatements;
    }
}
