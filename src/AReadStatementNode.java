import java.lang.reflect.Array;
import java.util.ArrayList;

public class AReadStatementNode extends AStatementNode{
    private String readKeyword;
    private String leftParenthesis;
    private AVariableNode variableNode;
    private ArrayList<String> delimiters;
    private ArrayList<AVariableNode> variables;
    private String rightParenthesis;

    public AReadStatementNode(String readKeyword, String leftParenthesis, AVariableNode variableNode, String rightParenthesis) {
        this.readKeyword = readKeyword;
        this.leftParenthesis = leftParenthesis;
        this.variableNode = variableNode;
        this.rightParenthesis = rightParenthesis;
    }

    public AReadStatementNode(String readKeyword, String leftParenthesis, AVariableNode variableNode, ArrayList<String> delimiters, ArrayList<AVariableNode> variables, String rightParenthesis) {
        this.readKeyword = readKeyword;
        this.leftParenthesis = leftParenthesis;
        this.variableNode = variableNode;
        this.delimiters = delimiters;
        this.variables = variables;
        this.rightParenthesis = rightParenthesis;
    }

    @Override
    public <T> T accept(AStatementVisitor visitor) {
        return null;
    }
}
