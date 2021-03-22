package lab5.exercitiu4.ex1;

import lab5.exercitiu4.ex3.SuperInterface1;

public class Main {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        System.out.println(someClass.defaultMethodWithNoMatchingInSubInterface());

        System.out.println(someClass instanceof SubInterface); // true
        System.out.println(someClass instanceof SuperInterface1); // false
    }
}
