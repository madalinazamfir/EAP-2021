package lab11.teorie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    /*
        / operatii intermediare   / operatii de inchidere /
        / filter                  /forEach / forEachOrdered/
        / map                     /min                   /
        / flatMap                 /max                   /
        / distinct                /count                  /
        / sorted                  /collect                /
        / peek                    /reduce                 /
        / limit                   /anyMatch               /
        / skip                    /allMatch               /
        /                         /noneMatch              /
        /                         /findFirst              /
        /                         /findAny                /
        O operație intermediară aplicată asupra unui stream furnizează un alt stream asupra căruia se poate aplica o altă operație intermediară, obținând-se astfel un șir succesiv de prelucrări de tip pipeline.
        Operațiile intermediare nu sunt efectuate decât în momentul în care este invocată o operație de închidere!
    */
    public static void main(String[] args) {
        // #### METODE INTERMEDIARE ####
        List<Integer> numbers = Arrays.asList(5, 6, 8, 1, 4, 3, 3, 1);
//        "stream filter method -> are nevoie de un Predicate"
//        "numerele mai mari sau egale cu 4"
        numbers.stream()
                .filter(number -> number >= 4)
                .forEach(System.out::println);

//        "map -> are nevoie de un Function"
//         "cast la string si concatenare"
        String numbersToString = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")); // output: 5, 6, 8, 1, 4, 3, 3, 1

//        "peek -> are nevoie de un Counsumer"
        numbers.stream()
                .skip(2)
                .peek(System.out::println)
                .collect(Collectors.toList()); // 8, 1, 4, 3, 3, 1

        numbers.stream()
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList()); // output: 5, 6, 8, 1, 4, 3

//        "flatMap -> are nevoie de un Function"
        List<Integer> negativeNumbers = Arrays.asList(-1, -7, -5, -8);
        List<List<Integer>> allNumbers = Arrays.asList(numbers, negativeNumbers);
        String allNumbersAsString = allNumbers.stream()
                .flatMap(listOfNumbers -> listOfNumbers.stream())
                .map(Object::toString)
                .collect(Collectors.joining(", ")); // output: 5, 6, 8, 1, 4, 3, 3, 1, -1, -7, -5, -8

        // sorted
        numbers.stream()
//                .sorted((number1, number2) -> number1.compareTo(number2)) // echivalent cu sorted() sau cu sorted(Comparator.naturalOrder())
                .sorted((number1, number2) -> number2.compareTo(number1))// echivalend cu sorted(Comparator.reversedOrder())
                .peek(System.out::println) // output: 8 6 5 4 3 3 1 1
                .collect(Collectors.toList());


        // #### METODE DE INCHIDERE ####
        numbers.stream().max(Comparator.naturalOrder()).get(); // output 8

        numbers.stream().reduce(0,(accumulator, nextInt) -> accumulator + nextInt); // output: 31

        numbers.stream().anyMatch(number -> number == 3);
    }
}
