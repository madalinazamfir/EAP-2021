package lab5.exercitiu4.ex5;

public interface Interface {


    default String defaultMethodThatWasOverrideInParentClass() {
    return "I will be override in the Parent Class";
    }

    String abstractMethodToBeOverrideInParen();
}
