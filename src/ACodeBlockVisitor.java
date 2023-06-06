import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class ACodeBlockVisitor extends MiniPascalBaseVisitor<ACodeBlockNode>{
    private List<AVarDeclarationNode> varDeclarations = new ArrayList<>();
    private List<AFunctionDeclarationNode> functionDeclarations = new ArrayList<>();
    private List<ACompoundStatementNode> compoundStatements = new ArrayList<>();

    private SymbolTable symbolTable = SymbolTable.getInstance();

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
        codeBlockNode.setStartToken(ctx.getStop());
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
                    semanticExceptions.add(new SemanticException("Duplicate identifier "+token.getText()+" in ("+line+","+column+")"));
                }else{
                    VariableType variableType = variable.getVariableType();
                    symbolTable.addVariable(varName,variableType);
                }
            }
        }
        //validate function_declaration*

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
                    semanticExceptions.add(new SemanticException("Error: overloaded functions have the same parameter list ("+line+","+column+")"));
                }else{
                    symbolTable.addVariable(parameterId,parameter.getVariableType());
                }
            }

            //validar el type de func = return type, recorrer profundidad hasta encontrar el assignment


        }

        //validate compound_statement*
        for(ACompoundStatementNode compoundStatementNode:  codeBlockNode.getCompoundStatements()){
            AStatementListNode statementListNode = compoundStatementNode.getStatementListNode();
            AStatementNode statementNode = statementListNode.getStatementNode();
            ArrayList<AStatementNode> statementNodes = statementListNode.getStatementNodes();
            if(statementNodes.isEmpty()){
                if(statementNode instanceof AAssignmentStatementNode){
                    //validate assignment if variable is declared in var_declarations and in system table
                    AAssignmentStatementNode assignmentStatementNode = (AAssignmentStatementNode) statementNode;
                    String variableName = assignmentStatementNode.getVariableNode().getIdentifier();
                    if(!symbolTable.containsVariable(variableName)){
                        Token token = assignmentStatementNode.getStartToken();
                        int line = token.getLine();
                        int column = token.getCharPositionInLine();
                        semanticExceptions.add(new SemanticException("Undeclared variable "+variableName+" used in assignment at ("+line+","+column+")"));
                    }
                }
            }else{
                for(AStatementNode stmtNode : statementNodes) {
                    if(stmtNode instanceof AAssignmentStatementNode){
                        AAssignmentStatementNode assignmentStatementNode = (AAssignmentStatementNode) stmtNode;
                        String variableName = assignmentStatementNode.getVariableNode().getIdentifier();
                        if(!symbolTable.containsVariable(variableName)){
                            Token token = assignmentStatementNode.getStartToken();
                            int line = token.getLine();
                            int column = token.getCharPositionInLine();
                            semanticExceptions.add(new SemanticException("Undeclared variable "+variableName+" used in assignment at ("+line+","+column+")"));
                        }
                    }
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


//**still need to validate that the return type of the function equals the actual returned value type
