public class AIdentifierTerminalNode extends AFactorNode{
    private String identifier;
    private AIndexAccessNode indexAccessNode;
    private AFunctionCallNode functionCallNode;
    private String leftParenthesis;
    private AExpressionNode expressionNode;
    private String rightParenthesis;
    private String notKeyword;
    private AFactorNode factor;

    public AIdentifierTerminalNode(String identifier) {
        this.identifier = identifier;
    }

    public AIdentifierTerminalNode(String identifier, AIndexAccessNode indexAccessNode) {
        this.identifier = identifier;
        this.indexAccessNode = indexAccessNode;
    }

    public AIdentifierTerminalNode(String identifier, AFunctionCallNode functionCallNode) {
        this.identifier = identifier;
        this.functionCallNode = functionCallNode;
    }

    public AIdentifierTerminalNode(String identifier, String leftParenthesis, AExpressionNode expressionNode, String rightParenthesis) {
        this.identifier = identifier;
        this.leftParenthesis = leftParenthesis;
        this.expressionNode = expressionNode;
        this.rightParenthesis = rightParenthesis;
    }

    public AIdentifierTerminalNode(String identifier, String notKeyword, AFactorNode factor) {
        this.identifier = identifier;
        this.notKeyword = notKeyword;
        this.factor = factor;
    }
}
