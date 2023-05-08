public class AVariableDeclarationVisitor extends MiniPascalBaseVisitor<AVariableDeclarationNode>{
    @Override
    public AVariableDeclarationNode visitVariable_declaration(MiniPascalParser.Variable_declarationContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String colon = ctx.COLON().getText();
        ATypeVisitor typeVisitor = new ATypeVisitor();
        ATypeNode typeNode = typeVisitor.visit(ctx.type());
        AArraySpecifierNode arraySpecifierNode = null;
        AArraySpecifierVisitor aArraySpecifierVisitor = new AArraySpecifierVisitor();
        if(ctx.array_specifier()!=null){
            arraySpecifierNode = aArraySpecifierVisitor.visit(ctx.array_specifier());
            return new AVariableDeclarationNode(identifier,colon,typeNode,arraySpecifierNode);
        }
        return new AVariableDeclarationNode(identifier,colon,typeNode);
    }
}
