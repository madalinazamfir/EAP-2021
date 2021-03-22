package lab5.exercitiu4.ex4;

import lab5.exercitiu4.ex4.SuperInterface1;

public class SomeClass implements SuperInterface2, SuperInterface1 {

    @Override
    public String methodWithTheSameName() {
        return "the method must be implemented in the class";
    }
}
