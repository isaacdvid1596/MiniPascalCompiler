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

    @Override
    public String toString() {
        return null;
    }

    @Override
    public <T> T accept(AVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
