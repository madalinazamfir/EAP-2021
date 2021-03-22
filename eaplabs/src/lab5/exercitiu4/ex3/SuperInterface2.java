package lab5.exercitiu4.ex3;

public interface SuperInterface2 {

    default String sameNameButDifferentReturnType() {
        return "This one returns string";
    }

    String abstractAndWithTheSameNameButDifferentReturnType();

}
