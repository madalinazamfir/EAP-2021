package lab5.exercitiu4.ex3;

public interface SuperInterface1 {

    default Integer sameNameButDifferentReturnType() {
        return 100;
    }

    Integer abstractAndWithTheSameNameButDifferentReturnType();
}
