public class AIndexRangeNode {
    private int numberOne;
    private String dotdot;
    private int numberTwo;
    public AIndexRangeNode(int numberOne, String dotdot, int numberTwo) {
        this.numberOne = numberOne;
        this.dotdot = dotdot;
        this.numberTwo = numberTwo;
    }

    @Override
    public String toString() {
        return numberOne + dotdot + numberTwo;
    }
}
