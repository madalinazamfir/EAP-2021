package lab11.teorie;

import java.util.Arrays;
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
        List<Integer> numbers = Arrays.asList(5,6,8,1,4,3,3,1);
        System.out.println("stream filter method -> are nevoie de un Predicate");
        System.out.println("numerele mai mari sau egale cu 4");
        numbers.stream()
                .filter(number -> number >= 4)
                .forEach(System.out::println);

        System.out.println("map -> are nevoie de un Function");
        System.out.println("cast la string si concatenare");
        String numbersToString = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")); // output: 5, 6, 8, 1, 4, 3, 3, 1
        System.out.println(numbersToString);

        System.out.println("flatMap -> are nevoie de un Function");
        List<Integer> negativeNumbers = Arrays.asList(-1, -7, -5, -8);
        List<List<Integer>> allNumbers = Arrays.asList(numbers, negativeNumbers);
        String allNumbersAsString =allNumbers.stream()
                .flatMap(listOfNumbers -> listOfNumbers.stream())
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(allNumbersAsString);
    }
}
