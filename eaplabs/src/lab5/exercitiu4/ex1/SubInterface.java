package lab5.exercitiu4.ex1;

// o interfata "extinde" o alta interfata, n-o implementeaza
public interface SubInterface extends SuperInterface{

    // devine abstracta - clasa care va implementa SubInterface va trebui sa implementeze ambele metode
    String defaultMethod();

//    @Override
//    default String defaultMethodWithNoMatchingInSubInterface() {
//        return SuperInterface.super.defaultMethodWithNoMatchingInSubInterface() + ". I was reimplemented in SubInterface";
//    }
}
