public class AVariableVisitor extends MiniPascalBaseVisitor<AVariableNode>{
    @Override
    public AVariableNode visitVariableNonTerminal(MiniPascalParser.VariableNonTerminalContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        if(ctx.index_access()!=null){
            AIndexAccessVisitor indexAccessVisitor = new AIndexAccessVisitor();
            AIndexAccessNode indexAccessNode = indexAccessVisitor.visit(ctx.index_access());
            return new AVariableNode(identifier,indexAccessNode);
        }
        return new AVariableNode(identifier);
    }
}
