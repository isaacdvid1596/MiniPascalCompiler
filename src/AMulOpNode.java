
public class AMulOpNode{
    private String operator;

    public AMulOpNode(String operator){
        this.operator = operator;
    }

    public String getOperator(){
        return this.operator;
    }

    @Override
    public String toString(){
        return this.operator;
    }
}