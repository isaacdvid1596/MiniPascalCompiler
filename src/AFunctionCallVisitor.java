public class AFunctionCallVisitor extends MiniPascalBaseVisitor<AFunctionCallNode>{

    private SymbolTable symbolTable = SymbolTable.getInstance();
    @Override
    public AFunctionCallNode visitFunctionCall(MiniPascalParser.FunctionCallContext ctx) {
        symbolTable.enterScope();
        String identifier = ctx.IDENTIFIER().getText();
        String leftParenthesis = ctx.LPAREN().getText();
        if(ctx.argument_list()!=null){
            AArgumentListVisitor argumentListVisitor = new AArgumentListVisitor();
            AArgumentListNode argumentListNode = argumentListVisitor.visit(ctx.argument_list());
            String rightParenthesis = ctx.RPAREN().getText();
            symbolTable.exitScope();
            AFunctionCallNode functionCallNode = new AFunctionCallNode(identifier,leftParenthesis,argumentListNode,rightParenthesis);
            functionCallNode.setStartToken(ctx.getStart());
            return functionCallNode;
        }
        String rightParenthesis = ctx.RPAREN().getText();
        symbolTable.exitScope();
        AFunctionCallNode functionCallNode = new AFunctionCallNode(identifier,leftParenthesis,rightParenthesis);
        functionCallNode.setStartToken(ctx.getStart());
        return functionCallNode;
    }
}
