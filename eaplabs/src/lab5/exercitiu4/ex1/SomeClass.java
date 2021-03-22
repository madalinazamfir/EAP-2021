package lab5.exercitiu4.ex1;

public class SomeClass implements SubInterface{

    @Override
    public String abstractMethod() {
        return null;
    }

    @Override
    public String defaultMethod() {
        return null;
    }

    @Override
    public String defaultMethodWithNoMatchingInSubInterface() {
        return SubInterface.super.defaultMethodWithNoMatchingInSubInterface() + ". I was reimplemented in SomeClass";
    }
}
