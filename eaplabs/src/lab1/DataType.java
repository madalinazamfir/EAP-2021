/*
 - un pachet reprezinta un grup de clase comune
 - declaratia package trebuie sa fie prima instructiune necomentata din fisier
 - toate clasele care nu au declarat un pachet, fac parte dintr-un pachet "default"

 De ce avem nevoie de pachete:
    - organizarea codului
    - rezolvarea conflictelor de nume
    - crearea unor relatii mai stranse intre anumite clase (ex: un membru al unei clase cu nivel de acces default este accesibil doar pentru celelalte clase din acelasi pachet)
 */
package lab1;

/*
 * class = keyword (cuvant cheie), cuvant din vocabularul limbajului java
 *
 * DataType = identificator, trebuie sa respecte următoarele reguli:
 *
 * - Nu poate începe cu cifra, dar poate contine cifre
 * - Nu poate contine spații și operatori (sau caractere speciale: #)
 * - Nu pot fi folosite cuvinte cheie
 *
 * main = metoda principala - entry point al programului
 */


public class DataType {
    int camp;

    public static void main(String[] args) {
        // o variabila reprezinta o zona de memorie in care programatorul poate stoca informatii
        // Java este un limbaj de programare strongly type - fiecare variabila are un tip de date stabilit inca de la compilare si nu se poate schimba pe parcursul executiei
        // fiecare variabila trebuie declarata inainte de folosire
        // variabilele pot fi: variabile locale (variabile declarate in interiorul unei metode) sau campuri ale clasei
        // variabilele campuri ale clasei, de tip primitiva, daca nu au fost initializate au ca default 0 sau false (boolean)
        // o variabila locala trebuie initializata inainte de folosire

        //ex: declarare varibila
        int i1;
        int i2, i3;


        // ex: initializare variabila
        i1 = 10;



//        Tipuri de date:
//            - primitive: byte, short, int, long, float, double, char, boolean;
//            - compuse sau referinte: tablouri (Array), clase, interfete
        /*
        / tip de data / natura      / nr biti / valori posibile                                     /
        / byte       / nr. intreg   / 8 biti  / 2^8 -> -128...+127                                  /
        / short      / nr. intreg   / 16 biti / 2^16 -> -32768...+32767                             /
        / int        / nr. intreg   / 32 biti / 2^32 -> -2147483648...+2147483647                   /
        / long       / nr. intreg   / 64 biti / 2^64 -> -9223372036854775808...+9223372036854775807 /
        / float      / nr. rational / 32 biti /                                                     /
        / double     / nr rational  / 64 biti /                                                     /
        / char       / Unicode      / 16 biti /                                                     /
        / boolean    / v. de adevar /         / true, false                                         /
        */

        // !!! tipul de date char este perceput de compilator si JVM ca un intreg fara semn si chiar poate fi folosit ca atare. valori posibile: 0...65535

        int i7= 10;
        int i4= 054; // baza 8
        int i5= 0XFF; // baza 16
        int i6 = 0b11010;
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);

        long l1 = 123_456_789;
        System.out.println(l1);

        double d1 = 1.123456789;
        float f1 = 1.12345689F;

        System.out.println(d1);
        System.out.println(f1);

        double d2 = 1.5224558844567889;
        System.out.println(d2);

        char c1 = 'B';
        char c2 = '\u0041';
        char c3 = 12;

        System.out.println(c2);

        // tipuri de date compuse (referinta): String

        String text = "test";
        System.out.println(text.length());
        System.out.println("JavaCourse".substring(0, 4));


        System.out.println( "text".indexOf('t'));
        System.out.println( "text".lastIndexOf('t'));
        System.out.println( "text".indexOf('g'));

        char[] charArray = "text".toCharArray();
        System.out.println(charArray);

    }
}
