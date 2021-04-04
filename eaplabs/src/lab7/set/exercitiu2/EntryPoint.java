package lab7.set.exercitiu2;

import java.util.HashSet;
import java.util.Set;

public class EntryPoint {

    /*
    Vreau sa am 3 tipuri de activitati de relaxare:
        - sa citesc o carte
        - sa ma uit la un film
        - sa ma uit la un serial
    Acestea trebuie sa aiba o colectie de genuri: romance, drama, horror, thriller, mystery
    Vreau sa am un serviciu care sa-mi permita cautarea de activitati de relaxare in functie de mai multe genuri
     */
    public static void main(String[] args) {
        Set<String> firstCombination = new HashSet<>();
        firstCombination.add("horror");
        firstCombination.add("mystery");

        Set<String> secondCombination = new HashSet<>();
        secondCombination.add("romance");
        secondCombination.add("drama");

        Set<String> thirdCombination = new HashSet<>();
        secondCombination.add("thriller");
        secondCombination.add("mystery");

        Set<String> search = new HashSet<>();
        secondCombination.add("horror");
        secondCombination.add("drama");
    }
}
