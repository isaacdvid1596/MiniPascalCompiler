import java.util.ArrayList;
import java.util.List;

public class ASimpleExpressionNode {
    private ATermNode termNode;
    private ArrayList<AAddOperatorNode> addOperators;
    private List<String> orKeyword;
    private ArrayList<ATermNode> termNodes;

    public ASimpleExpressionNode(ATermNode termNode) {
        this.termNode = termNode;
    }

    public ASimpleExpressionNode(ATermNode termNode, ArrayList<AAddOperatorNode> addOperators, ArrayList<ATermNode> termNodes) {
        this.termNode = termNode;
        this.addOperators = addOperators;
        this.termNodes = termNodes;
    }

    public ASimpleExpressionNode(ATermNode termNode, List<String> orKeyword, ArrayList<ATermNode> termNodes) {
        this.termNode = termNode;
        this.orKeyword = orKeyword;
        this.termNodes = termNodes;
    }

    public ATermNode getTermNode() {
        return termNode;
    }

    public ArrayList<ATermNode> getTermNodes() {
        return termNodes;
    }
}
