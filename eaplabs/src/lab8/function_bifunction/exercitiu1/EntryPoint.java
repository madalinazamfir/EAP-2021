package lab8.function_bifunction.exercitiu1;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class EntryPoint {
    /*

     */

    public static void main(String[] args) {
        // Sa se converteasca elementele din urmatoarea colectie de la Double la String
        List<Double> doubles = Arrays.asList(10.5, 18.9, 20.0, 21.45, 40.8);
        Function<Double, String> convertToString = parametru -> String.valueOf(parametru);
        for(double d : doubles) {
            String converted = convertToString.apply(d);
            System.out.println(converted);
        }

        // Sa se converteasca elementele din urmatoarea colectie de la Double la Integer
        DoubleToIntFunction doubleToIntFunction = param -> (int) param;
        for(double d: doubles) {
            Integer convertedToInt = doubleToIntFunction.applyAsInt(d);
            System.out.println(convertedToInt);
        }
    }
}
