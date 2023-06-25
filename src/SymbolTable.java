import java.util.*;

public class SymbolTable {
    private static SymbolTable instance = null;
    private Stack<Map<String,VariableType>> scopeStack;
    private Map<String,FunctionInfo> functionTable;

    // Private constructor to prevent instantiation
    private SymbolTable(){
        scopeStack = new Stack<>();
        functionTable = new HashMap<>();
        enterScope();
    }

    // Method to get the Singleton instance
    public static SymbolTable getInstance() {
        if (instance == null) {
            instance = new SymbolTable();
        }
        return instance;
    }

    public void enterScope(){
        scopeStack.push(new HashMap<>());
    }

    public void exitScope(){
        scopeStack.pop();
    }

    public boolean containsVariable(String varName){
        for(int i = scopeStack.size()-1; i >= 0 ; i--){
            Map<String,VariableType> currentScope = scopeStack.get(i);
            if(currentScope.containsKey(varName)){
                return true;
            }
        }
        return false;
    }

    public void addVariable(String varName, VariableType varType){
        Map<String,VariableType> currentScope = scopeStack.peek();
        currentScope.put(varName,varType);
    }

    public void removeVariable(String varName){
        for(int i = scopeStack.size()-1 ; i >= 0; i--){
            Map<String,VariableType> currentScope = scopeStack.get(i);
            if(currentScope.containsKey(varName)){
                currentScope.remove(varName);
            }
        }
    }

    public VariableType getVariableType(String varName){
        for(int i = scopeStack.size()-1 ; i >= 0; i--){
            Map<String,VariableType> currentScope = scopeStack.get(i);
            if(currentScope.containsKey(varName)){
                return currentScope.get(varName);
            }
        }
        return null;
    }

    //manejar funciones

    public void addFunction(String functionName, VariableType returnType, ArrayList<VariableType> parameterTypes) {
        FunctionInfo functionInfo = new FunctionInfo(returnType, parameterTypes);
        functionTable.put(functionName, functionInfo);
    }

    public FunctionInfo getFunctionInfo(String functionName) {
        return functionTable.get(functionName);
    }

    public boolean containsFunction(String functionName) {
        return functionTable.containsKey(functionName);
    }

    public int getFunctionParameterCount(String functionName) {
        FunctionInfo functionInfo = functionTable.get(functionName);
        if (functionInfo != null) {
            ArrayList<VariableType> parameterTypes = functionInfo.getParameterTypes();
            return parameterTypes.size();
        }
        return 0;
    }

    public ArrayList<VariableType> getFunctionParameterTypes(String functionName) {
        FunctionInfo functionInfo = functionTable.get(functionName);
        if (functionInfo != null) {
            return functionInfo.getParameterTypes();
        }
        return null;
    }

    public static class FunctionInfo {
        private VariableType returnType;
        private ArrayList<VariableType> parameterTypes;

        public FunctionInfo(VariableType returnType, ArrayList<VariableType> parameterTypes) {
            this.returnType = returnType;
            this.parameterTypes = parameterTypes;
        }

        public VariableType getReturnType() {
            return returnType;
        }

        public ArrayList<VariableType> getParameterTypes() {
            return parameterTypes;
        }
    }
}
