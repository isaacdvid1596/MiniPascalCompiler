import org.antlr.v4.runtime.Token;

public class AVariableDeclarationNode {
    private String identifier;
    private String colon;
    private ATypeNode type;
    private AArraySpecifierNode arraySpecifierNode;

    public AVariableDeclarationNode(String identifier, String colon, ATypeNode type, AArraySpecifierNode arraySpecifierNode) {
        this.identifier = identifier;
        this.colon = colon;
        this.type = type;
        this.arraySpecifierNode = arraySpecifierNode;
    }

    public AVariableDeclarationNode(String identifier, String colon, ATypeNode type) {
        this.identifier = identifier;
        this.colon = colon;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getColon() {
        return colon;
    }

    public ATypeNode getType() {
        return type;
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

    public AArraySpecifierNode getArraySpecifierNode() {
        return arraySpecifierNode;
    }
}
