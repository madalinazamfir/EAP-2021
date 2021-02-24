package lab1;


import java.util.Random;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {

        // sa se afiseze numerele impare de la 1 la 100
        for(int i = 1; i < 100; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }

        for(int i = 1; i < 100; i +=2) {
//            if(i%2 != 0) {
                System.out.println(i);
//            }
        }

        // sa se verifice daca un numar random este prim

    Random random = new Random();
    int nr = random.nextInt(10);
    int d =0;
        System.out.println(nr);
    for(int j = 2; j < nr / 2; j++) {
        if(nr%j == 0) {
            d++;
        }
    }
    String result = d == 0? nr + " este primm": nr +" nu este prim";
        System.out.println(result);
     

        // sa se calculeze n!, unde n este input de la utilizator

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int factorial = 1;
        for (int x=1; x<=n; x++) {
            factorial *=x; // factorial = factorial * x;
        }
        System.out.println(factorial);

        // calculati aria cercului, raza random sau input de la tastatura (Math.PI)
        int raza = random.nextInt();
        double razaLaPatrat = Math.pow(raza, 2);
        System.out.println(Math.PI * razaLaPatrat);


        // sa se afiseze numele lunii in functie de un numar introdus de la tastatura


        // sa se extraga sexul si data nasterii dintr-un cnp input de la tastatura (1,5 - sex masculin, 2,6 - sex feminin, 1,2 - nascut pana in 1999 inclusiv, 5,6 - nascut dupa 2000 inclusiv)
        // AA / LL / ZZ

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduceti CNP");
        String cnp = scanner2.next();

        String gen;
        String prefixAn;
        String sufixAn;
        Integer luna;
        Integer zi;
        if(cnp.length() != 13) {
            System.out.println("CNP invalid");
        } else {
           int genInt = Integer.parseInt(cnp.substring(0,1));
           if(genInt == 1 || genInt == 2) {
               prefixAn = "19";
           } else {
               prefixAn = "20";
           }

           gen =  genInt == 1 || genInt == 5 ? "M" : "F";
           sufixAn = cnp.substring(1, 3);
            luna = new Integer(cnp.substring(3, 5));
            zi = new Integer(cnp.substring(5,7));
            String lunaM = aflaLuna(luna);
            String dataNasterii = zi.toString().concat(" ").concat(lunaM).concat(" ").concat(prefixAn).concat(sufixAn);
            System.out.println("Gen ".concat(gen).concat(" data nasterii:").concat(dataNasterii));
        }

    }

    public static String aflaLuna(int luna) {
        switch (luna) {
            case 1:
                return "Ianuarie";

            case 2:
                return "Februarie";

            case 3:
                return "Martie";

            case 4:
                return "Aprilie";

            case 5:
                return "Mai";

            case 6:
                return "Iunie";

            case 7:
                return "Iulie";

            case 8:
                return "August";

            case 9:
                return "Septembrie";

            case 10:
                return "Obtombrie";

            case 11:
                return "Noiembrie";

            case 12:
                return "Decembrie";

            default:
                return "Nu exista";
        }
    }
}
