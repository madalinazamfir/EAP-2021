package lab1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Wrappers {

    public static void main(String[] args) {

        // dispun de constructori multipli
        Short shortObj = new Short("12");
        Short shortObj2 = new Short((short) 12);
        Short short3 = (short) 5;
        Short short4 = Short.valueOf("05");
        System.out.println(short4);
        BigInteger x; // alt wrapper pentru int
        BigDecimal y; // wrapper pentru double
        y = new BigDecimal(12.5); // mult mai multi constructori, wrapper pentru double

        // boxing/unboxing

        if(shortObj + shortObj2 > 20) {
            System.out.println("yeey");
        }


        // constante publice

        Integer max = Integer.MAX_VALUE;
        Integer min = Integer.MIN_VALUE;

        // extragerea valorii incapsulate - nu trebuie sa corespunda neaparat cu tipul incapsulat
        Integer i5 = new Integer("20");
        long l1 = i5.longValue();

        /*
        metode de comparare:
            boolean equals(obiect_impachetat) - indica daca obiectul pentru care a fost apelat incapsuleaza aceeasi valoare cu cel primit ca argument
            int compareTo(obiect_impachetat) - indica relatia dintre cele doua obiecte:
                     0 - obiectele sunt egale
                    >0 - obiect_apel > obiect_impachetat
                    <0 - obiect_apel < obiect_impachetat
         */

        Integer i10 = new Integer(10);
        System.out.println(i10.compareTo(20));


        // metode statice parse

        int x1 = Integer.parseInt("152");
    }
}
