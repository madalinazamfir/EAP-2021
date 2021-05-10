package lab11.teorie;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class AboutStreams {

    /*
    Stream -  este un flux de date, respectiv o secvență de elemente preluate dintr-o sursă care suportă operații de procesare
           - nu modifica sursa
           - un stream inchis nu se mai poate redeschide.
     */

    // Creare stream
    public void howToCreateStreams() {
        //Collection stream method
        List<String> names = Arrays.asList("Johny", "Elisabeth", "James");
        names.stream(); // returns Stream<String>

        // Arrays stream method
        Arrays.stream(new String[]{"Johny", "Elisabeth", "James"}); // returns Stream<String>

        // Stream class
        // of() method
        Stream.of("Johny", "Elisabeth", "James");

        // generate() method
        Stream.generate(() -> {
            Random random = new Random();
            return random.nextInt(10);
        });

        // stream builder
        Stream<String> actors = Stream.<String>builder()
                .add("Robert De Niro")
                .add("Jack Nicholson")
                .build();

    }
}
