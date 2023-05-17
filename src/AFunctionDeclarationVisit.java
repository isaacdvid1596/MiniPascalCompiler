public class AFunctionDeclarationVisit extends MiniPascalBaseVisitor<AFunctionDeclarationNode>{
    @Override
    public AFunctionDeclarationNode visitFunctionDeclaration(MiniPascalParser.FunctionDeclarationContext ctx) {
        String functionKeyword = ctx.FUNCTION().getText();
        String identifierKeyword = ctx.IDENTIFIER().getText();
        String identifierLParent = ctx.LPAREN().getText();
        AParameterListVisitor parameterListVisitor = new AParameterListVisitor();
        AParameterListNode parameterListNode = parameterListVisitor.visit(ctx.parameter_list());
        String identifierRParent = ctx.RPAREN().getText();
        String identifierColon = ctx.COLON().getText();
        ATypeVisitor parameterVisitor = new ATypeVisitor();
        ATypeNode parameterTypeNode = parameterVisitor.visit(ctx.type());
        String identifierSemicolon = ctx.SEMICOLON().getText();
        AFunctionBlockVisitor functionBlockVisitor = new AFunctionBlockVisitor();
        AFunctionBlockNode functionBlockNode = functionBlockVisitor.visit(ctx.function_block());
        return new AFunctionDeclarationNode(functionKeyword,identifierKeyword,identifierLParent,parameterListNode,identifierRParent,identifierColon,parameterTypeNode,identifierSemicolon,functionBlockNode);
    }
}