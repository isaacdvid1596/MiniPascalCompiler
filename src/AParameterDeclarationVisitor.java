public class AParameterDeclarationVisitor extends MiniPascalBaseVisitor<AParameterDeclarationNode>{
    @Override
    public AParameterDeclarationNode visitParameterDeclaration(MiniPascalParser.ParameterDeclarationContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String colon = ctx.COLON().getText();
        ATypeVisitor aTypeVisitor = new ATypeVisitor();
        ATypeNode aTypeNode = aTypeVisitor.visit(ctx.type());
        AParameterDeclarationNode parameterDeclarationNode = new AParameterDeclarationNode(identifier,colon,aTypeNode);
        parameterDeclarationNode.setStartToken(ctx.getStart());
        return parameterDeclarationNode;
    }
}
