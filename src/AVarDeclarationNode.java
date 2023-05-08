import java.util.ArrayList;

public class AVarDeclarationNode {
    private String varKeyword;
    private ArrayList<AVariableDeclarationNode> variableDeclarations;
    private ArrayList<String> semiColon;

    public AVarDeclarationNode(String varKeyword, ArrayList<AVariableDeclarationNode> variableDeclarations, ArrayList<String> semiColon) {
        this.varKeyword = varKeyword;
        this.variableDeclarations = variableDeclarations;
        this.semiColon = semiColon;
    }
}
