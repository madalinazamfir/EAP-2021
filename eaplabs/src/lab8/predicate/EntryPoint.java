package lab8.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EntryPoint {
    // a boolean-value-function
//    Java 8 also provides IntPredicate, LongPredicate, and DoublePredicate for the primitive data types.

    public static void main(String[] args) {
        Predicate<String> startsWithFunction = text -> text.startsWith("S");
        boolean result = startsWithFunction.test("Student");
        System.out.println(result);
        Predicate<String> negateStartsWith = startsWithFunction.negate();
        System.out.println(startsWithFunction.test("Student"));
        System.out.println(negateStartsWith.test("Student"));

        Predicate<String> endsWithFunction = text -> text.endsWith("t");
        Predicate<String> orCompose = startsWithFunction.or(endsWithFunction);
        Predicate<String> andCompose = startsWithFunction.and(endsWithFunction);
        System.out.println("## Compose ##");
        System.out.println(orCompose.test("Star"));
        System.out.println(andCompose.test("Student"));

        BiPredicate<String, String> biPredicateStartsWith = (text, substring) -> text.startsWith(substring);
        System.out.println("# BiPredicate #");
        System.out.println(biPredicateStartsWith.test("Student", "stu"));
    }
}
