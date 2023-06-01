import java.util.ArrayList;

public class AParameterListNode {
    private AParameterDeclarationNode aParameterDeclaration;
    private ArrayList<String> delimiterList;
    private ArrayList<AParameterDeclarationNode> parameterDeclarations;

    public AParameterListNode() {
    }

    public AParameterListNode(AParameterDeclarationNode aParameterDeclaration) {
        this.aParameterDeclaration = aParameterDeclaration;
    }

    public AParameterListNode(AParameterDeclarationNode aParameterDeclaration, ArrayList<String> delimiterList, ArrayList<AParameterDeclarationNode> parameterDeclarations) {
        this.aParameterDeclaration = aParameterDeclaration;
        this.delimiterList = delimiterList;
        this.parameterDeclarations = parameterDeclarations;
    }

    public AParameterDeclarationNode getaParameterDeclaration() {
        return aParameterDeclaration;
    }

    public ArrayList<AParameterDeclarationNode> getParameterDeclarations() {
        return parameterDeclarations;
    }
}
