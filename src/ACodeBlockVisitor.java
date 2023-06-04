import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class ACodeBlockVisitor extends MiniPascalBaseVisitor<ACodeBlockNode>{
    private List<AVarDeclarationNode> varDeclarations = new ArrayList<>();
    private List<AFunctionDeclarationNode> functionDeclarations = new ArrayList<>();
    private List<ACompoundStatementNode> compoundStatements = new ArrayList<>();

    private SymbolTable symbolTable = new SymbolTable();

    ArrayList<SemanticException> semanticExceptions = new ArrayList<>();

    @Override
    public ACodeBlockNode visitCode_Block(MiniPascalParser.Code_BlockContext ctx) {

        symbolTable.enterScope();

        if(ctx.var_declaration()!=null){
            for(MiniPascalParser.Var_declarationContext varDeclarationContext : ctx.var_declaration()){
                AVarDeclarationVisitor varDeclarationVisitor = new AVarDeclarationVisitor();
                AVarDeclarationNode varDeclarationNode = varDeclarationVisitor.visit(varDeclarationContext);
                varDeclarations.add(varDeclarationNode);
            }
        }
        if(ctx.function_declaration()!=null){
            for(MiniPascalParser.Function_declarationContext functionDeclarationContext: ctx.function_declaration()){
                AFunctionDeclarationVisitor aFunctionDeclarationVisit = new AFunctionDeclarationVisitor();
                AFunctionDeclarationNode functionDeclarationNode = aFunctionDeclarationVisit.visit(functionDeclarationContext);
                functionDeclarations.add(functionDeclarationNode);
            }
        }
        if(ctx.compound_statement()!=null){
            for(MiniPascalParser.Compound_statementContext compoundStatementContext: ctx.compound_statement()){
                ACompoundStatementVisitor compoundStatementVisitor = new ACompoundStatementVisitor();
                ACompoundStatementNode compoundStatementNode = compoundStatementVisitor.visit(compoundStatementContext);
                compoundStatements.add(compoundStatementNode);
            }
        }
        String programEndMarker = ctx.PROGRAM_END().getText();

        symbolTable.exitScope();

        ACodeBlockNode codeBlockNode = new ACodeBlockNode(varDeclarations,functionDeclarations,compoundStatements,programEndMarker);
        validateCodeBlock(codeBlockNode);
        return codeBlockNode;
    }

    private void validateCodeBlock(ACodeBlockNode codeBlockNode) {
       
        //validate var_declaration*
        for(AVarDeclarationNode varDeclarationNode: codeBlockNode.getVarDeclarations()){
            for(AVariableDeclarationNode variable: varDeclarationNode.getVariableDeclarations()){
                String varName = variable.getIdentifier();
                if(symbolTable.containsVariable(varName)){
                    Token token = variable.getStartToken();
                    int line = token.getLine();
                    int column = token.getCharPositionInLine();
//                    SemanticException exception =  new SemanticException("Duplicate identifier "+token.getText()+" in ("+line+","+column+") ");
//                    semanticExceptions.add(exception);
                    semanticExceptions.add(new SemanticException("Duplicate identifier "+token.getText()+" in ("+line+","+column+") "));
                }else{
                    VariableType variableType = variable.getVariableType();
                    symbolTable.addVariable(varName,variableType);
                }
            }
        }
        //validate function_declaration*
        //still need to validate that the return type of the function equals the actual returned value type
        for(AFunctionDeclarationNode functionDeclarationNode: codeBlockNode.getFunctionDeclarations()){
            String functionIdentifier = functionDeclarationNode.getIdentifier();
            if(symbolTable.containsVariable(functionIdentifier)){
                Token token = functionDeclarationNode.getStartToken();
                int line = token.getLine();
                int column = token.getCharPositionInLine();
                semanticExceptions.add(new SemanticException("Duplicate function identifier "+functionIdentifier+" in ("+line+","+column+") "));
            }else{
                VariableType functionType = functionDeclarationNode.getVariableType();
                symbolTable.addVariable(functionIdentifier,functionType);
            }
            AParameterListNode parameterListNode = functionDeclarationNode.getParameterListNode();
            ArrayList<AParameterDeclarationNode> parameters = new ArrayList<>();
            AParameterDeclarationNode parameterDeclarationNode = parameterListNode.getaParameterDeclaration();
            if(parameterDeclarationNode!=null){
                parameters.add(parameterDeclarationNode);
            }
            ArrayList<AParameterDeclarationNode> parametersList = parameterListNode.getParameterDeclarations();
            if(parametersList!=null){
                for (AParameterDeclarationNode aParameterDeclarationNode : parametersList) {
                    parameters.add(aParameterDeclarationNode);
                }
            }
            for (AParameterDeclarationNode parameter : parameters) {
                String parameterId = parameter.getIdentifier();
                if(symbolTable.containsVariable(parameterId)){
                    Token token =  parameter.getStartToken();
                    int line = token.getLine();
                    int column = token.getCharPositionInLine();
                    semanticExceptions.add(new SemanticException("Duplicate parameter name "+parameterId+" in function at ("+line+","+column+")"));
                }else{
                    symbolTable.addVariable(parameterId,parameter.getVariableType());
                }
            }
        }
        // Handle semantic exceptions
        if (!semanticExceptions.isEmpty()) {
            System.out.println("Errors found during compilation process: ");
            for (SemanticException semanticException : semanticExceptions) {
                System.out.println(semanticException.getMessage());
            }
            throw new SemanticException("Please fix the errors above to properly compile code");
        }

    }
}
