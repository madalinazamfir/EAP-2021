package lab5.exercitiu3.teorie;

public class Main {

    public static void main(String[] args) {
        // expresie lamda
        FunctionalInterface functionalInterface = () -> {
            System.out.println("Do something");
        };
        functionalInterface.execute();
    }
}
