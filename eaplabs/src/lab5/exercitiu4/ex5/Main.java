package lab5.exercitiu4.ex5;

public class Main {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        System.out.println(someClass.defaultMethodThatWasOverrideInParentClass());
        System.out.println(someClass.abstractMethodToBeOverrideInParen());

        System.out.println(someClass instanceof Interface); //true
    }
}
