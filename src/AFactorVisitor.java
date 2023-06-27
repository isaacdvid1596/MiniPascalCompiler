public class AFactorVisitor extends MiniPascalBaseVisitor<AFactorNode>{
    @Override
    public AFactorNode visitFactor(MiniPascalParser.FactorContext ctx) {
       if(ctx.identifier_terminal()!=null){
           AIdentifierTerminalVisitor identifierTerminalVisitor = new AIdentifierTerminalVisitor();
           AIdentifierTerminalNode identifierTerminalNode = identifierTerminalVisitor.visit(ctx.identifier_terminal());
       }else if(ctx.NUMBER()!=null){
           String number =  ctx.NUMBER().getText();
           ANumberTerminalNode numberTerminalNode = new ANumberTerminalNode(number);
           numberTerminalNode.setStartToken(ctx.getStart());
           return numberTerminalNode;
       }else if(ctx.STRINGLITERAL()!=null){
           String string = ctx.STRINGLITERAL().getText();
           AStringLiteralNode stringLiteralNode = new AStringLiteralNode(string);
           stringLiteralNode.setStartToken(ctx.getStart());
           return stringLiteralNode;
       }else if(ctx.CHARACTER()!=null){
           char character = ctx.CHARACTER().getText().charAt(0);
           ACharacterTerminalNode characterTerminalNode = new ACharacterTerminalNode(character);
           characterTerminalNode.setStartToken(ctx.getStart());
           return characterTerminalNode;
       }else if(ctx.LPAREN()!=null && ctx.expression()!=null && ctx.RPAREN()!=null){
           String leftParenthesis = ctx.LPAREN().getText();
           AExpressionVisitor expressionVisitor = new AExpressionVisitor();
           AExpressionNode expressionNode = expressionVisitor.visit(ctx.expression());
           String rightParenthesis = ctx.RPAREN().getText();
           return new ABetweenParenthesisExpressionNode(leftParenthesis,expressionNode,rightParenthesis);
       }else if(ctx.NOT()!=null && ctx.factor()!=null){
            String notKeyword = ctx.NOT().getText();
            AFactorNode factorNode = this.visit(ctx.factor());
            return new ANotFactorNode(notKeyword,factorNode);
       }else if (ctx.TRUE()!=null){
           String trueKeyword = ctx.TRUE().getText();
           return new ATrueNode(trueKeyword);
       }else if(ctx.FALSE()!=null){
           String falseKeyword = ctx.FALSE().getText();
           return new AFalseNode(falseKeyword);
       }
       return null;
    }
}
