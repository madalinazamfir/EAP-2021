package lab8.predicate.exercitiu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExercise {

    public static void main(String[] args) {
        // sa se afiseze orasele care incep cu litera B case insensitive (anyMatch, allMatch)
        List<String> cities = Arrays.asList("Bucuresti", "Craiova", "brasov", "Timisoara");
        Predicate<String> startsWithB = city -> city.startsWith("B");
        Predicate<String> startsWithb = city -> city.startsWith("b");
        Predicate<String> combined = startsWithB.or(startsWithb);

        List<String> filtered = new ArrayList<>();

        filtered = cities.stream()
                .filter(combined)
                .collect(Collectors.toList());
        // sau
        for(String city: cities) {
            if(combined.test(city)) {
                filtered.add(city);
            }
        }
        System.out.println(filtered);
    }
}
