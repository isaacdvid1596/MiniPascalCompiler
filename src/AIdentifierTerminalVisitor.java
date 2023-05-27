public class AIdentifierTerminalVisitor extends MiniPascalBaseVisitor<AIdentifierTerminalNode>{
    @Override
    public AIdentifierTerminalNode visitIdentifierTerminal(MiniPascalParser.IdentifierTerminalContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if(ctx.index_access()!=null){
            AIndexAccessVisitor indexAccessVisitor = new AIndexAccessVisitor();
            AIndexAccessNode indexAccessNode =  indexAccessVisitor.visit(ctx.index_access());
            return new AIdentifierTerminalNode(identifier,indexAccessNode);
        }
        if(ctx.function_call()!=null){
            AFunctionCallVisitor functionCallVisitor = new AFunctionCallVisitor();
            AFunctionCallNode functionCallNode = functionCallVisitor.visit(ctx.function_call());
            return new AIdentifierTerminalNode(identifier,functionCallNode);
        }
        if(ctx.LPAREN()!=null && ctx.expression()!=null && ctx.RPAREN()!=null){
            String leftParenthesis = ctx.LPAREN().getText();
            AExpressionVisitor expressionVisitor = new AExpressionVisitor();
            AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
            String rightParenthesis = ctx.RPAREN().getText();
            return new AIdentifierTerminalNode(identifier,leftParenthesis,expressionNode,rightParenthesis);
        }
        if(ctx.NOT()!=null && ctx.factor()!=null){
            String notKeyword = ctx.NOT().getText();
            AFactorVisitor factorVisitor = new AFactorVisitor();
            AFactorNode aFactorNode = factorVisitor.visit(ctx.factor());
            return new AIdentifierTerminalNode(identifier,notKeyword,aFactorNode);
        }
        return new AIdentifierTerminalNode(identifier);
    }
}
