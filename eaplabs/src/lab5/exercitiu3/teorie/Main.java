package lab5.exercitiu3.teorie;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // expresie lamda
        FunctionalInterface functionalInterface = () -> {
            System.out.println("Do something");
        };

        functionalInterface.execute();
    }

    FunctionalInterfaceWithParameters functionalInterfaceWithParameters = (String name) -> {
        System.out.println("Hello " + name);
    };
}
