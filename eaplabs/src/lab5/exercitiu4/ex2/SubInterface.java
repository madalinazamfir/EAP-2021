package lab5.exercitiu4.ex2;

// o interfata poate sa extinda mai multe interfete spre deosebire de clase care extind o singura clasa
public interface SubInterface extends SuperInterface1, SuperInterfata2{

    // pentru ca este prezenta in ambele interfete metoda trebuie rescrisa (abstracta sau oferind alta implementare)
//    @Override
//    String defaultMethodPresentIn2Interfaces();


    @Override
    default String defaultMethodPresentIn2Interfaces() {
        return SuperInterface1.super.defaultMethodPresentIn2Interfaces() +
                SuperInterfata2.super.defaultMethodPresentIn2Interfaces() +
                "I was reimplemented in the SubInterface";
    }
}
