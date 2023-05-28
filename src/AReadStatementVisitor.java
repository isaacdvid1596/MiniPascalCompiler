import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class AReadStatementVisitor extends MiniPascalBaseVisitor<AReadStatementNode>{
    private ArrayList<String> delimiters = new ArrayList<>();
    private ArrayList<AVariableNode> variables = new ArrayList<>();
    @Override
    public AReadStatementNode visitReadStatement(MiniPascalParser.ReadStatementContext ctx) {
        String readKeyword = ctx.READ().getText();
        String leftParenthesis = ctx.LPAREN().getText();
        AVariableVisitor variableVisitor = new AVariableVisitor();
        AVariableNode variableNode = variableVisitor.visit(ctx.variable(0));
        if(ctx.DELIMITER() != null && ctx.variable() != null ){
            for(TerminalNode delimiterNode: ctx.DELIMITER()){
                String delimiter = delimiterNode.getText();
                delimiters.add(delimiter);
            }
            for(MiniPascalParser.VariableContext variableContext:ctx.variable()){
                AVariableNode variable = variableVisitor.visit(variableContext);
                variables.add(variable);
            }
            String rightParenthesis = ctx.RPAREN().getText();
            return new AReadStatementNode(readKeyword,leftParenthesis,variableNode,delimiters,variables,rightParenthesis);
        }
        String rightParenthesis = ctx.RPAREN().getText();
        return new AReadStatementNode(readKeyword,leftParenthesis,variableNode,rightParenthesis);
    }
}
