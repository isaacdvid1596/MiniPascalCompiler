import java.util.ArrayList;

public class AAssignmentStatementVisitor extends MiniPascalBaseVisitor<AAssignmentStatementNode>{
    //validar si el tipo de izquierda igual a la derecha.

    private SymbolTable symbolTable = new SymbolTable();
    ArrayList<SemanticException> semanticExceptions = new ArrayList<>();
    @Override
    public AAssignmentStatementNode visitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx) {

        symbolTable.enterScope();

        AVariableVisitor aVariableVisitor = new AVariableVisitor();
        AVariableNode variableNode = aVariableVisitor.visit(ctx.variable());
        String assignKeyword = ctx.ASSIGN().getText();
        //ver si es expression o function
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        AFunctionCallVisitor functionCallVisitor = new AFunctionCallVisitor();
        AFunctionCallNode functionCallNode = functionCallVisitor.visit(ctx.function_call());
        if(expressionNode != null){
            symbolTable.exitScope();
            AAssignmentStatementNode assignmentStatementNode = new AAssignmentStatementNode(variableNode,assignKeyword,expressionNode);
            assignmentStatementNode.setStartToken(ctx.getStart());
            return assignmentStatementNode;
        }
        symbolTable.exitScope();
        AAssignmentStatementNode assignmentStatementNode = new AAssignmentStatementNode(variableNode,assignKeyword,functionCallNode);
        assignmentStatementNode.setStartToken(ctx.getStart());
        return assignmentStatementNode;
    }
}
