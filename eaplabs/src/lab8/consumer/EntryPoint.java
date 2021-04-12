package lab8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EntryPoint {

    // Consumer<T> - o functie care accepta un singur argument si nu returneaza nimic (void)
    /*
    Java 8 also provides convenient interfaces for the primitive data types:
IntConsumer, LongConsumer, DoubleConsumer, BiConsumer, ObjIntConsumer,
ObjLongConsumer, and ObjDoubleConsumer.
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Maria", "Alexandru", "Vladut", "Ana");
        Consumer<String> helloConsumer = param -> System.out.println("Hello " + param);

        Consumer<String> saySomethingNice = param -> System.out.println("Nice to meet you");
        Consumer<String> presentationConsumer = helloConsumer.andThen(saySomethingNice);
        names.forEach(presentationConsumer);


        BiConsumer<String, Character> transformConsumer = (String text, Character type) -> {
            switch (type) {
                case 'l':
                    System.out.println(text.toLowerCase());
                    break;
                case 'u':
                    System.out.println(text.toUpperCase());
                    break;
                default:
                    System.out.println(text);
            }
        };
        String text = "A journey of a thousand miles begins with a single step";
        transformConsumer.accept(text, 'l');
        transformConsumer.accept(text, 'u');
        transformConsumer.accept(text, 'm');
    }
}
