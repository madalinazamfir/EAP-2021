package lab5.exercitiu4.ex1;

public interface SuperInterface {

    default String defaultMethod() {
        return "SuperInterface default method";
    }

    String abstractMethod();

    default String defaultMethodWithNoMatchingInSubInterface() {
        return "I am default and I will be till the day I die";
    }
}
