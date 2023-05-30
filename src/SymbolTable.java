import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    private Stack<Map<String,VariableType>> scopeStack;
    public SymbolTable(){
        scopeStack = new Stack<>();
        enterScope();
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
    public VariableType getVariableType(String varName){
        for(int i = scopeStack.size()-1 ; i >= 0; i--){
            Map<String,VariableType> currentScope = scopeStack.get(i);
            if(currentScope.containsKey(varName)){
                return currentScope.get(varName);
            }
        }
        return null;
    }
}
