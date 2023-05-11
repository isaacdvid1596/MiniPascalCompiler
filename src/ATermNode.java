import java.util.ArrayList;
import java.util.List;

public class ATermNode {
    private AFactorNode factorNode;
    private List<AMulOperator> mulOperators;
    private ArrayList<AFactorNode> factorNodes;

    public ATermNode(AFactorNode factorNode) {
        this.factorNode = factorNode;
    }

    public ATermNode(AFactorNode factorNode, ArrayList<AMulOperator> mulOperators, ArrayList<AFactorNode> factorNodes) {
        this.factorNode = factorNode;
        this.mulOperators = mulOperators;
        this.factorNodes = factorNodes;
    }

    public ATermNode(AFactorNode factorNode, List<AMulOperator> mulOperators) {
        this.factorNode = factorNode;
        this.mulOperators = mulOperators;
    }

    public ATermNode(AFactorNode factorNode, ArrayList<AFactorNode> factorNodes) {
        this.factorNode = factorNode;
        this.factorNodes = factorNodes;
    }
}
