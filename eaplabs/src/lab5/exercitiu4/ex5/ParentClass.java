package lab5.exercitiu4.ex5;

public class ParentClass implements Interface{

    @Override
    public String defaultMethodThatWasOverrideInParentClass() {
        return Interface.super.defaultMethodThatWasOverrideInParentClass() +
                ". Now I have implementation from ParentClass";
    }

    @Override
    public String abstractMethodToBeOverrideInParen() {
        return "I am not abstract anymore because I was implemented in ParentClass";
    }
}
