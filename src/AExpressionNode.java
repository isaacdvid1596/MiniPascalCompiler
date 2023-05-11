import java.util.ArrayList;

public class AExpressionNode {
    private ASimpleExpressionNode aSimpleExpressionNode;
    private ArrayList<ARelationalOperatorNode> relOp;
    private ArrayList<String> andKeyword;
    private ArrayList<String> orKeyword;
    private ArrayList<ASimpleExpressionNode> aSimpleExpressionNodes;
    private ArrayList<String> semicolon;
}
