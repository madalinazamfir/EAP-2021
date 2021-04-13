package lab8.function_bifunction;

import lab8.function_bifunction.functional_interface.Add1FunctionalInterface;
import lab8.function_bifunction.functional_interface.SumFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class EntryPoint {

    public static void main(String[] args) {
        // cum am invatat
        //implementare cu clasa anonima sau implementare clasica using implements
        Add1FunctionalInterface add1FunctionalInterface = new Add1FunctionalInterface() {
            @Override
            public Integer addTo(Integer number) {
                return number + 1;
            }
        };
        Integer add1Result = add1FunctionalInterface.addTo(10);
        System.out.println(add1Result);

        // lambda expression
        Add1FunctionalInterface add1LambdaExpresion = parameter -> parameter + 1;
        System.out.println(add1LambdaExpresion.addTo(12));

        // cum am invatat
        SumFunctionalInterface sumFunctionalInterface = new SumFunctionalInterface() {
            @Override
            public Integer sum(Integer first, Integer second) {
                return first + second;
            }
        };
        System.out.println(sumFunctionalInterface.sum(10, 5));

        // lambda expression
        SumFunctionalInterface sumLambdaExpression = (Integer parameter1, Integer parameter2) -> parameter2 + parameter1;
//        SumFunctionalInterface sumLambdaExpression = (Integer parameter1, Integer parameter2) -> Integer.sum(parameter1, parameter2);
        // sau
        SumFunctionalInterface sumLambdaExpression2 = Integer::sum;
        System.out.println(sumLambdaExpression.sum(5, 8));

        //Function si BiFunction in java
        // pentru exemplu Add1FunctionalInterface
        Function<Integer, Integer> add1Function = parameter -> parameter + 1;
        Integer resultAfterFunctionIsApplied = add1Function.apply(15);

        //add1Function mai poate sa fie scris si asa
        UnaryOperator<Integer> unaryOperator = parameter -> parameter + 1;

        // pentru exemplu SumFunctionalInterface
        BiFunction<Integer, Integer, Integer> sumBiFunction = (parameter1, parameter2) -> parameter1 + parameter2;
        Integer resultAfterBiFunctionIsApplied = sumBiFunction.apply(10, 8);

        //sumBiFunction poate sa fie scrisa si asa:
        BinaryOperator<Integer> binaryOperator = (param1, param2) -> param1 + param2;

        /*
        Java 8 provides several convenient FIs for the primitive data types: IntFunction,
DoubleFunction, IntToDoubleFunction, IntToLongFunction, DoubleToIntFunction,
DoubleToLongFunction, LongToDoubleFunction, and LongToIntFunction.
         */
        IntFunction<Integer> intFunction = parameter -> parameter + 1;
        Integer result = intFunction.apply(5);

        /*
        Pure function: is a function that takes an input and returns an output. It has a single purpose
and doesn’t mutate any state; It always produces the same output for the same input.
Java 8 provides 40+ common predefined functional interfaces . All of them except the
Consumer FI are pure functions.
         */

        List<String> names = Arrays.asList("madalina", "cristina");
        names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
    }
}
