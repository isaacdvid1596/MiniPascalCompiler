import java.util.ArrayList;

public class AParameterListNode {
    private AParameterDeclaration aParameterDeclaration;
    private ArrayList<String> delimiterList;
    private ArrayList<AParameterDeclaration> parameterDeclarations;

    public AParameterListNode() {
    }

    public AParameterListNode(AParameterDeclaration aParameterDeclaration) {
        this.aParameterDeclaration = aParameterDeclaration;
    }

    public AParameterListNode(AParameterDeclaration aParameterDeclaration, ArrayList<String> delimiterList, ArrayList<AParameterDeclaration> parameterDeclarations) {
        this.aParameterDeclaration = aParameterDeclaration;
        this.delimiterList = delimiterList;
        this.parameterDeclarations = parameterDeclarations;
    }
}
