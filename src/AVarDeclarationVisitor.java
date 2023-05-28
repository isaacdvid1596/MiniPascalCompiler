import org.antlr.runtime.Token;

import java.util.ArrayList;


public class AVarDeclarationVisitor extends MiniPascalBaseVisitor<AVarDeclarationNode>{
    private ArrayList<AVariableDeclarationNode> variableDeclarations = new ArrayList<>();
    private ArrayList<String> semicolons = new ArrayList<>();

    @Override
    public AVarDeclarationNode visitVarDeclaration(MiniPascalParser.VarDeclarationContext ctx) {
        String var = ctx.VAR().getText();
        for(MiniPascalParser.Variable_declarationContext variableDeclarationContext:ctx.variable_declaration()){
            variableDeclarations.add(variableDeclarationContext.accept(new AVariableDeclarationVisitor()));
            String semicolon = ctx.children.get(ctx.children.size()-1).getText();
            semicolons.add(semicolon);
        }
        //try this or try tuple
        return new AVarDeclarationNode(var,variableDeclarations,semicolons);
    }
}
