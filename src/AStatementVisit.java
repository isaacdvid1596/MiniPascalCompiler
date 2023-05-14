public class AStatementVisit extends MiniPascalBaseVisitor<AStatementNode>{

    @Override
    public AStatementNode visitCompountStatement(MiniPascalParser.CompountStatementContext ctx) {
        String beginKeyword = ctx.BEGIN().getText();
        AStatementListVisitor aStatementListVisitor = new AStatementListVisitor();
        AStatementListNode statementListNode = aStatementListVisitor.visit(ctx.statement_list());
        String endKeyword = ctx.END().toString();
        if(endKeyword.equals("")){
            return new ACompoundStatementNode(beginKeyword,statementListNode);
        }
        return new ACompoundStatementNode(beginKeyword, statementListNode, endKeyword);
    }

    @Override
    public AStatementNode visitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx) {
        AVariableVisitor aVariableVisitor = new AVariableVisitor();
        AVariableNode variableNode = aVariableVisitor.visit(ctx.variable());
        String assignKeyword = ctx.ASSIGN().getText();
        //ver si es expression o function
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        AFunctionCallVisitor functionCallVisitor = new AFunctionCallVisitor();
        AFunctionCallNode functionCallNode = functionCallVisitor.visit(ctx.function_call());
        if(expressionNode != null){
            return new AAssignmentStatementNode(variableNode,assignKeyword,expressionNode);
        }
        return new AAssignmentStatementNode(variableNode,assignKeyword,functionCallNode);
    }

    @Override
    public AStatementNode visitIfStatement(MiniPascalParser.IfStatementContext ctx) {
        String ifKeyword = ctx.IF().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        String thenKeyword = ctx.THEN().getText();
        AStatementNode statementNode = this.visit(ctx.statement(0));
        if(ctx.ELSE()!=null){
            String elseKeyword = ctx.ELSE().getText();
            AStatementNode elseStatementNode = visit(ctx.statement(1));
            return new AIfStatementNode(ifKeyword,expressionNode,thenKeyword,statementNode,elseKeyword,elseStatementNode);
        }
        return new AIfStatementNode(ifKeyword,expressionNode,thenKeyword,statementNode);
    }

    @Override
    public AStatementNode visitWhileStatement(MiniPascalParser.WhileStatementContext ctx) {
        String whileKeyword = ctx.WHILE().getText();
        AExpressionVisitor expressionVisitor = new AExpressionVisitor();
        AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
        String doKeyword = ctx.DO().getText();
        AStatementVisit statementVisitor = new AStatementVisit();
        AStatementNode statementNode = statementVisitor.visit(ctx.statement());
        return new AWhileStatementNode(whileKeyword,expressionNode,doKeyword,statementNode);
    }

    @Override
    public AStatementNode visitForStatement(MiniPascalParser.ForStatementContext ctx) {
        return super.visitForStatement(ctx);
    }

    @Override
    public AStatementNode visitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx) {
        return super.visitRepeatStatement(ctx);
    }

    @Override
    public AStatementNode visitWriteStatement(MiniPascalParser.WriteStatementContext ctx) {
        return super.visitWriteStatement(ctx);
    }

    @Override
    public AStatementNode visitReadStatement(MiniPascalParser.ReadStatementContext ctx) {
        return super.visitReadStatement(ctx);
    }

    @Override
    public AStatementNode visitFunctionCall(MiniPascalParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }
}
