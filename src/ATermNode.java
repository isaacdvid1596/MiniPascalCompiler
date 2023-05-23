import java.util.ArrayList;
import java.util.List;

public class ATermNode {
    private AFactorNode factorNode;
    private List<AMulOpNode> mulOperators;
    private ArrayList<AFactorNode> factorNodes;

    public ATermNode(AFactorNode factorNode) {
        this.factorNode = factorNode;
    }

    public ATermNode(AFactorNode factorNode, ArrayList<AMulOpNode> mulOperators, ArrayList<AFactorNode> factorNodes) {
        this.factorNode = factorNode;
        this.mulOperators = mulOperators;
        this.factorNodes = factorNodes;
    }

    public ATermNode(AFactorNode factorNode, List<AMulOpNode> mulOperators) {
        this.factorNode = factorNode;
        this.mulOperators = mulOperators;
    }

    public ATermNode(AFactorNode factorNode, ArrayList<AFactorNode> factorNodes) {
        this.factorNode = factorNode;
        this.factorNodes = factorNodes;
    }
}
