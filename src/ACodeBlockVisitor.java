import org.antlr.v4.runtime.Token;
import org.stringtemplate.v4.ST;

import java.lang.reflect.Type;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ACodeBlockVisitor extends MiniPascalBaseVisitor<ACodeBlockNode> {
    private List<AVarDeclarationNode> varDeclarations = new ArrayList<>();
    private List<AFunctionDeclarationNode> functionDeclarations = new ArrayList<>();
    private List<ACompoundStatementNode> compoundStatements = new ArrayList<>();

    private SymbolTable symbolTable = SymbolTable.getInstance();

    ArrayList<SemanticException> semanticExceptions = new ArrayList<>();

    @Override
    public ACodeBlockNode visitCode_Block(MiniPascalParser.Code_BlockContext ctx) {

        symbolTable.enterScope();

        if (ctx.var_declaration() != null) {
            for (MiniPascalParser.Var_declarationContext varDeclarationContext : ctx.var_declaration()) {
                AVarDeclarationVisitor varDeclarationVisitor = new AVarDeclarationVisitor();
                AVarDeclarationNode varDeclarationNode = varDeclarationVisitor.visit(varDeclarationContext);
                varDeclarations.add(varDeclarationNode);
            }
        }
        if (ctx.function_declaration() != null) {
            for (MiniPascalParser.Function_declarationContext functionDeclarationContext : ctx.function_declaration()) {
                AFunctionDeclarationVisitor aFunctionDeclarationVisit = new AFunctionDeclarationVisitor();
                AFunctionDeclarationNode functionDeclarationNode = aFunctionDeclarationVisit.visit(functionDeclarationContext);
                functionDeclarations.add(functionDeclarationNode);
            }
        }
        if (ctx.compound_statement() != null) {
            for (MiniPascalParser.Compound_statementContext compoundStatementContext : ctx.compound_statement()) {
                ACompoundStatementVisitor compoundStatementVisitor = new ACompoundStatementVisitor();
                ACompoundStatementNode compoundStatementNode = compoundStatementVisitor.visit(compoundStatementContext);
                compoundStatements.add(compoundStatementNode);
            }
        }
        String programEndMarker = ctx.PROGRAM_END().getText();

        symbolTable.exitScope();

        ACodeBlockNode codeBlockNode = new ACodeBlockNode(varDeclarations, functionDeclarations, compoundStatements, programEndMarker);
        codeBlockNode.setStartToken(ctx.getStop());
        validateCodeBlock(codeBlockNode, ctx);
        return codeBlockNode;
    }

    private void validateCodeBlock(ACodeBlockNode codeBlockNode, MiniPascalParser.Code_BlockContext ctx) {
        //validate var_declaration*
        for (AVarDeclarationNode varDeclarationNode : codeBlockNode.getVarDeclarations()) {
            for (AVariableDeclarationNode variable : varDeclarationNode.getVariableDeclarations()) {
                String varName = variable.getIdentifier();
                ATypeNode typeNode = variable.getType();
                if (symbolTable.containsVariable(varName)) {
                    Token token = variable.getStartToken();
                    int line = token.getLine();
                    int column = token.getCharPositionInLine();
                    semanticExceptions.add(new SemanticException("Duplicate identifier " + token.getText() + " in (" + line + "," + column + ")"));
                } else {
                    if(typeNode instanceof AArraySpecifierNode){
                        AArraySpecifierNode arraySpecifierNode = (AArraySpecifierNode) typeNode;
                        if(arraySpecifierNode!=null){
                            VariableType variableType = arraySpecifierNode.getVariableType();
                            if(variableType == VariableType.INTEGER){
                                symbolTable.addVariable(varName, VariableType.INTEGER);
                            }else if(variableType == VariableType.BOOLEAN){
                                symbolTable.addVariable(varName, VariableType.BOOLEAN);
                            }else if(variableType == VariableType.CHAR){
                                symbolTable.addVariable(varName,VariableType.CHAR);
                            }else if(variableType == VariableType.REAL){
                                symbolTable.addVariable(varName,VariableType.REAL);
                            }
                        }
                    } else {
                        VariableType variableType = variable.getVariableType();
                        symbolTable.addVariable(varName, variableType);
                    }
                }
            }
        }


    //validate function_declaration*

        for(AFunctionDeclarationNode functionDeclarationNode: codeBlockNode.getFunctionDeclarations()){
            ArrayList<VariableType> variableTypes = new ArrayList<>();
            String functionIdentifier = functionDeclarationNode.getIdentifier();
//            System.out.println(functionIdentifier);
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
                parameters.add(0,parameterDeclarationNode);
            }
            ArrayList<AParameterDeclarationNode> parametersList = parameterListNode.getParameterDeclarations();
            if(parametersList!=null){
                for (AParameterDeclarationNode aParameterDeclarationNode : parametersList) {
                    parameters.add(aParameterDeclarationNode);
                }
            }
            for (AParameterDeclarationNode parameter : parameters) {
                String parameterId = parameter.getIdentifier();
                variableTypes.add(parameter.getVariableType());
                if(symbolTable.containsVariable(parameterId)){
                    Token token =  parameter.getStartToken();
                    int line = token.getLine();
                    int column = token.getCharPositionInLine();
                    semanticExceptions.add(new SemanticException("Error: overloaded functions have the same parameter list ("+line+","+column+")"));
                }else{
                    symbolTable.addVariable(parameterId,parameter.getVariableType());
                }
            }
//            symbolTable.addFunction(functionIdentifier,null,variableTypes);


            //validar el type de func = return type, recorrer profundidad hasta encontrar el assignment
            ATypeNode typeNode = functionDeclarationNode.getType();
            String type = "";
            if(typeNode instanceof AIntegerType){
                AIntegerType integer = (AIntegerType) typeNode;
                     VariableType variableType = VariableType.INTEGER;
                     symbolTable.addFunction(functionIdentifier,variableType,variableTypes);

            }else if(typeNode instanceof AStringType){
                AStringType string = (AStringType) typeNode;
                type = string.toString().toUpperCase();
            }

            //recorrer el function para ver si hay variables sin declarar usadas. falta al lado derecha de la asignacion para funciones y demas.

            AFunctionBlockNode functionBlockNode = functionDeclarationNode.getFunctionBlockNode();
            ACompoundStatementNode compoundStatementNode = functionBlockNode.getCompoundStatementNode();
            AStatementListNode statementListNode = compoundStatementNode.getStatementListNode();
            AStatementNode statementNode = statementListNode.getStatementNode();
            ArrayList<AStatementNode> statementNodes = statementListNode.getStatementNodes();

            //validate assignment if variable is declared in var_declarations and in symbol table
            AAssignmentStatementNode assignmentStatementNode = (AAssignmentStatementNode) statementNode;
            String variableName = assignmentStatementNode.getVariableNode().getIdentifier();
            if (!symbolTable.containsVariable(variableName)){
                Token token = assignmentStatementNode.getStartToken();
                int line = token.getLine();
                int column = token.getCharPositionInLine();
                semanticExceptions.add(new SemanticException("Undeclared variable "+variableName+" used in assignment at ("+line+","+column+")"));
            }
        }


//        validate compound_statement*
        //need to validate whether list or only one compound or none!!
        for(ACompoundStatementNode compoundStatementNode :  codeBlockNode.getCompoundStatements()){
            AStatementListNode statementListNode = compoundStatementNode.getStatementListNode();
            AStatementNode statementNode = statementListNode.getStatementNode();
            ArrayList<AStatementNode> statementNodes = statementListNode.getStatementNodes();
            statementNodes.add(0,statementNode);
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
                if (statementNodes != null && !statementNodes.isEmpty()) {
                    for (AStatementNode stmtNode : statementNodes) {
                        if(stmtNode instanceof AWriteStatementNode){
//                            System.out.println("print if write statement");
                        }
                        if(stmtNode instanceof  AFunctionCallNode){
                            //asegurarse lista de argumentos son igual en cantidad y tipo de parametros en declaracion
                            AFunctionCallNode functionCallNode = (AFunctionCallNode) stmtNode;
                            String functionName = functionCallNode.getIdentifier();
                            if(symbolTable.containsFunction(functionName)){
                                int expectedParameterCount = symbolTable.getFunctionParameterCount(functionName);
//                                System.out.println(expectedParameterCount);
                                ArrayList<VariableType> expectedParameterTypes = symbolTable.getFunctionParameterTypes(functionName);
                                AArgumentListNode argumentListNode = functionCallNode.getArgumentListNode();
                                AExpressionNode expressionNode = argumentListNode.getFirstExpression();
                                List<AExpressionNode> expressionNodes = argumentListNode.getExpressionNodes();
                                expressionNodes.add(0,expressionNode);
                                //check if number of args incorrect
                                if(expressionNodes.size()!=expectedParameterCount){
                                    Token token = functionCallNode.getStartToken();
                                    int line = token.getLine();
                                    int column = token.getCharPositionInLine();
                                    semanticExceptions.add(new SemanticException("Incorrect number of arguments for function " + functionName + " at (" + line + "," + column + ")"));
                                }
                                //check if type of arguments are correct
//                                else{
//                                    for(int i = 0; i < expressionNodes.size() ; i++){
//                                        AExpressionNode argument = expressionNodes.get(i);
//                                        VariableType expectedType = expectedParameterTypes.get(i);
//                                        VariableType argumentType = val
//                                    }
//                                }
                            }
                        }
                        if (stmtNode instanceof AAssignmentStatementNode) {
                            AAssignmentStatementNode assignmentStatementNode = (AAssignmentStatementNode) stmtNode;
                            //CHECK WETHER VARIABLE IS JUST IDENTIFIER OR INDEX ACCESS
                            AVariableNode variableNode = assignmentStatementNode.getVariableNode();
                            //get expression type // RIGHT SIDE
                            //check whether is expression of function call
                            if (assignmentStatementNode.hasFunctionCall()) {
                                //asegurarse lista de argumentos son igual en cantidad y tipo de parametros en declaracion
                                AFunctionCallNode functionCallNode = assignmentStatementNode.getFunctionCallNode();
                                String functionName = functionCallNode.getIdentifier();
                                if(symbolTable.containsFunction(functionName)){
                                    int expectedParameterCount = symbolTable.getFunctionParameterCount(functionName);
                                    ArrayList<VariableType> expectedParameterTypes = symbolTable.getFunctionParameterTypes(functionName);
                                    AArgumentListNode argumentListNode = functionCallNode.getArgumentListNode();
                                    AExpressionNode expressionNode = argumentListNode.getFirstExpression();
                                    List<AExpressionNode> expressionNodes = argumentListNode.getExpressionNodes();
                                    expressionNodes.add(0,expressionNode);
                                    //check if number of args incorrect
                                    if(expressionNodes.size()!=expectedParameterCount){
                                        Token token = functionCallNode.getStartToken();
                                        int line = token.getLine();
                                        int column = token.getCharPositionInLine();
                                        semanticExceptions.add(new SemanticException("Incorrect number of arguments for function " + functionName + " at (" + line + "," + column + ")"));
                                    }
                                else{
                                    for(int i = 0; i < expressionNodes.size() ; i++){
                                        AExpressionNode argument = expressionNodes.get(i);
                                        VariableType expectedType = expectedParameterTypes.get(i);
                                        ASimpleExpressionNode simpleExpressionNode = argument.getaSimpleExpressionNode();
                                        ATermNode termNode = simpleExpressionNode.getTermNode();
                                        AFactorNode factorNode = termNode.getFactorNode();
                                        if(factorNode instanceof AIdentifierTerminalNode){
                                            AIdentifierTerminalNode id = (AIdentifierTerminalNode) factorNode;
                                            VariableType argumentType = symbolTable.getVariableType(id.getIdentifier());
                                            if(argumentType!=expectedType){
                                                Token token = argument.getStartToken();
                                                int line = token.getLine();
                                                int column = token.getCharPositionInLine();
                                                semanticExceptions.add(new SemanticException("Incompatible type for argument " + (i+1) + " in function " + functionName + " at (" + line + "," + column + ")"));
                                            }
                                        }
                                    }
                                }
                                }
                            } else {
                                AExpressionNode expressionNode = assignmentStatementNode.getExpressionNode();
                                ASimpleExpressionNode simpleExpressionNode = expressionNode.getaSimpleExpressionNode();
                                ATermNode termNode = simpleExpressionNode.getTermNode();
                                AFactorNode factorNode = termNode.getFactorNode();
                                VariableType typeOfFactor = null;
                                Token tokenTypeFactor = null;
                                int factorLine = 0;
                                int factorColumn = 0;
                                if (factorNode instanceof AStringLiteralNode) {
//                                System.out.println("I AM STRING");
                                    AStringLiteralNode stringLiteralNode = (AStringLiteralNode) factorNode;
                                    String value = stringLiteralNode.getString();
                                    if (value.length() > 3) {
                                        typeOfFactor = VariableType.STRING;
                                    } else {
                                        typeOfFactor = VariableType.CHAR;
                                    }
                                    tokenTypeFactor = stringLiteralNode.getStartToken();
                                    factorLine = tokenTypeFactor.getLine();
                                    factorColumn = tokenTypeFactor.getCharPositionInLine();
                                }
                                if (factorNode instanceof ANumberTerminalNode) {
//                                System.out.println("I AM INT");
                                    ANumberTerminalNode numberTerminalNode = (ANumberTerminalNode) factorNode;
                                    String value = numberTerminalNode.getNumber();
                                    if (value.contains(".")) {
                                        tokenTypeFactor = numberTerminalNode.getStartToken();
                                        factorLine = tokenTypeFactor.getLine();
                                        factorColumn = tokenTypeFactor.getCharPositionInLine();
                                        typeOfFactor = VariableType.REAL;
                                    } else {
                                        typeOfFactor = VariableType.INTEGER;
                                    }
                                    tokenTypeFactor = numberTerminalNode.getStartToken();
                                    factorLine = tokenTypeFactor.getLine();
                                    factorColumn = tokenTypeFactor.getCharPositionInLine();
                                }
                                if (factorNode instanceof ACharacterTerminalNode) {
                                    System.out.println("I AM CHAR");
                                    typeOfFactor = VariableType.CHAR;
                                    ACharacterTerminalNode characterTerminalNode = (ACharacterTerminalNode) factorNode;
                                    tokenTypeFactor = characterTerminalNode.getStartToken();
                                    factorLine = tokenTypeFactor.getLine();
                                    factorColumn = tokenTypeFactor.getCharPositionInLine();
                                }
                                if (variableNode != null) {
                                    if (variableNode.hasIndexAccess()) {
                                        String id = variableNode.getIdentifier();

                                        VariableType variableType = symbolTable.getVariableType(id);

                                        if (!symbolTable.containsVariable(id)) {
                                            Token token = assignmentStatementNode.getStartToken();
                                            int line = token.getLine();
                                            int column = token.getCharPositionInLine();
                                            semanticExceptions.add(new SemanticException("Undeclared variable " + id + " used in assignment at (" + line + "," + column + ")"));
                                        }
                                        if (variableType != null && typeOfFactor != null && !variableType.equals(typeOfFactor)) {
                                            semanticExceptions.add(new SemanticException("Incompatible types, got " + typeOfFactor + " expected " + variableType + " at (" + factorLine + "," + factorColumn + ")"));
                                        }
                                    } else {
                                        String variableName = variableNode.getIdentifier();
                                        VariableType variableType = symbolTable.getVariableType(variableName);
                                        if (!symbolTable.containsVariable(variableName)) {
                                            Token token = assignmentStatementNode.getStartToken();
                                            int line = token.getLine();
                                            int column = token.getCharPositionInLine();
                                            semanticExceptions.add(new SemanticException("Undeclared variable " + variableName + " used in assignment at (" + line + "," + column + ")"));
                                        }
                                        if (variableType != null && typeOfFactor != null && !variableType.equals(typeOfFactor)) {
                                            semanticExceptions.add(new SemanticException("Incompatible types, got " + typeOfFactor + " expected " + variableType + " at (" + factorLine + "," + factorColumn + ")"));
                                        }
                                    }
                                }
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
            throw new SemanticException(" Fatal: There were "+semanticExceptions.size()+" errors compiling module, stopping");
        }
    }

}

//**still need to validate that the return type of the function equals the actual returned value type
