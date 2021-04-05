package lab7.set.exercitiu2;

import lab7.set.exercitiu2.dto.Book;
import lab7.set.exercitiu2.dto.Movie;
import lab7.set.exercitiu2.dto.RelaxItem;
import lab7.set.exercitiu2.dto.Series;
import lab7.set.exercitiu2.service.RelaxService;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
        thirdCombination.add("thriller");
        thirdCombination.add("mystery");

        Set<String> criteriaForStrictSearch = new HashSet<>();
        criteriaForStrictSearch.add("horror");
        criteriaForStrictSearch.add("mystery");

        Set<String> criteria = new HashSet<>();
        criteria.add("romance");
        criteria.add("horror");

        RelaxItem item1 = new Book("Herry Potter", thirdCombination);
        RelaxItem item2 = new Movie("Titanic", secondCombination);
        RelaxItem item3 = new Series("Hannibal", firstCombination);
        RelaxService service = new RelaxService();
        service.add(item1, item2, item3);
        Set<RelaxItem> resultStrict = service.strictSearch(criteriaForStrictSearch);
        Set<RelaxItem> result = service.search(criteria);

        resultStrict.forEach(item -> System.out.println(item.getTitle()));
        System.out.println(result.stream().map(item -> item.getTitle()).collect(Collectors.toList()));
    }
}
