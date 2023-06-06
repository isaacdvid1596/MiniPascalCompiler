import org.antlr.runtime.Token;

import java.util.ArrayList;


public class AVarDeclarationVisitor extends MiniPascalBaseVisitor<AVarDeclarationNode>{
    private ArrayList<AVariableDeclarationNode> variableDeclarations = new ArrayList<>();
    private ArrayList<String> semicolons = new ArrayList<>();
    private SymbolTable symbolTable = SymbolTable.getInstance();

    @Override
    public AVarDeclarationNode visitVarDeclaration(MiniPascalParser.VarDeclarationContext ctx) {
        String var = ctx.VAR().getText();

        symbolTable.enterScope();

        for(MiniPascalParser.Variable_declarationContext variableDeclarationContext:ctx.variable_declaration()){
            variableDeclarations.add(variableDeclarationContext.accept(new AVariableDeclarationVisitor()));
            String semicolon = ctx.children.get(ctx.children.size()-1).getText();
            semicolons.add(semicolon);
        }
        //try this or try tuple
        symbolTable.exitScope();
        AVarDeclarationNode varDeclarationNode = new AVarDeclarationNode(var,variableDeclarations,semicolons);
//        validateVarDeclaration(varDeclarationNode);
        return varDeclarationNode;
    }

//    public void validateVarDeclaration(AVarDeclarationNode varDeclarationNode){
//        for()
//    }
}
