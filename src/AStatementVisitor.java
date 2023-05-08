public interface AStatementVisitor<T>{
    T visit(ACompoundStatementNode compoundStatement);
    T visit(AAssignmentStatementNode assignmentStatement);
    T visit(AIfStatementNode ifStatement);
    T visit(AWhileStatementNode whileStatement);
    T visit(AForStatementNode forStatement);
    T visit(ARepeatStatementNode repeatStatement);
    T visit(AWriteStatementNode writeStatement);
    T visit(AReadStatementNode readStatement);
    T visit(AFunctionCallNode functionCall);
}
