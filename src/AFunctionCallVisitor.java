public class AFunctionCallVisitor extends MiniPascalBaseVisitor<AFunctionCallNode>{
    @Override
    public AFunctionCallNode visitFunctionCall(MiniPascalParser.FunctionCallContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String leftParenthesis = ctx.LPAREN().getText();
        if(ctx.argument_list()!=null){
            AArgumentListVisitor argumentListVisitor = new AArgumentListVisitor();
            AArgumentListNode argumentListNode = argumentListVisitor.visit(ctx.argument_list());
            String rightParenthesis = ctx.RPAREN().getText();
            return new AFunctionCallNode(identifier,leftParenthesis,argumentListNode,rightParenthesis);
        }
        String rightParenthesis = ctx.RPAREN().getText();
        return new AFunctionCallNode(identifier,leftParenthesis,rightParenthesis);
    }
}
