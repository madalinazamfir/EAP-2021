package lab8.supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class EntryPoint {
    //Supplier<R> - nu primeste nimic ca parametru dar "promite" sa intoarca ceva
/*
Java 8 provides convenient interfaces for the primitive data types: IntSupplier,
DoubleSupplier, BooleanSupplier, and LongSupplier.
 */
    public static void main(String[] args) {
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println(randomIntegerSupplier.get());

        IntSupplier randomIntSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println(randomIntSupplier.getAsInt());

        List<Integer> numbers = Arrays.asList(15, 20, 81);
        Integer found = numbers.stream()
                .filter(no -> no.equals(10))
                .findAny()
                .orElseGet(() -> -1);
    }
}
