import java.util.ArrayList;

public class AAssignmentStatementVisitor extends MiniPascalBaseVisitor<AAssignmentStatementNode> {
    //validar si el tipo de izquierda igual a la derecha.

    private SymbolTable symbolTable = SymbolTable.getInstance();
    ArrayList<SemanticException> semanticExceptions = new ArrayList<>();
    @Override
    public AAssignmentStatementNode visitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx) {
        symbolTable.enterScope();
        AVariableVisitor aVariableVisitor = new AVariableVisitor();
        AVariableNode variableNode = aVariableVisitor.visit(ctx.variable());
        String assignKeyword = ctx.ASSIGN().getText();
        AAssignmentStatementNode assignmentStatementNode = null;

        if (ctx.expression() != null) {
            AExpressionVisitor expressionVisitor = new AExpressionVisitor();
            AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
            assignmentStatementNode = new AAssignmentStatementNode(variableNode, assignKeyword, expressionNode);
        } else if (ctx.function_call() != null) {
            AFunctionCallVisitor functionCallVisitor = new AFunctionCallVisitor();
            AFunctionCallNode functionCallNode = functionCallVisitor.visit(ctx.function_call());
            assignmentStatementNode = new AAssignmentStatementNode(variableNode, assignKeyword, functionCallNode);
        }

        symbolTable.exitScope();
        if (assignmentStatementNode != null) {
            assignmentStatementNode.setStartToken(ctx.getStart());
        }

        return assignmentStatementNode;
    }
}

