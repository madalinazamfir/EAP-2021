package lab5.exercitiu3.teorie;

// este o interfata care are o singura metoda abstracta
// poate sa aiba metode default, statice, private - adica tot ce necesita implementare
public interface FunctionalInterface {

    void execute();

    default void sayHello() {
        System.out.println("Hello");
    }
/*
    private void sayHelloButLikeAnIntrovert() {
        System.out.println("hi");
    }
*/
    public static void sayHelloLikeYouDontCare() {
        System.out.println("HELLO WORLD");
    }
}
