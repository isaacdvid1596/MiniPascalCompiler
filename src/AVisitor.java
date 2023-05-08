public interface AVisitor<T>{
    T visit(AIntegerType type);
    T visit(ARealType type);
    T visit(ABooleanType type);
    T visit(ACharType type);
    T visit(AStringType type);
    T visit(AArraySpecifierNode type);
}
