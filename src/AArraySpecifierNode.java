public class AArraySpecifierNode extends ATypeNode{
    private String arrayKeyword;
    private String leftBracket;
    private AIndexRangeNode indexRange;
    private String rightBracket;
    private ATypeNode type;

    public AArraySpecifierNode(String arrayKeyword, String leftBracket, AIndexRangeNode indexRange, String rightBracket, ATypeNode type){
        this.arrayKeyword = arrayKeyword;
        this.leftBracket = leftBracket;
        this.indexRange = indexRange;
        this.rightBracket = rightBracket;
        this.type = type;
    }

    public VariableType getVariableType(){
        if(type instanceof AIntegerType){
            return VariableType.INTEGER;
        }else if(type instanceof ARealType){
            return VariableType.REAL;
        }else if(type instanceof ABooleanType){
            return VariableType.BOOLEAN;
        }else if(type instanceof AStringType){
            return VariableType.STRING;
        }else if(type instanceof ACharType){
            return VariableType.CHAR;
        }else if(type instanceof AArraySpecifierNode){
            return VariableType.ARRAY;
        }
        return null;
    }

    @Override
    public String toString() {
        return this.arrayKeyword+this.leftBracket+this.indexRange.toString()+rightBracket+type.toString();
    }
}
