package lab1;

import java.util.Random;
import java.util.Scanner;

public class KeyboardInput {

    // Un obiect de tip Scanner este capabil sa citeasca informatia dintr-o sursa si sa o imparta in campuri pe baza unui delimitator
    // exemple de surse de informatie: fisiere, stringuri, input de a tastatura, etc
    // implicit delimitatorul este " " .next()
    // implicit delimitatorul este \n .nextLine()

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele:");
        String nume = new String("");
//        System.out.println("Hello "+ nume);
        while (scanner.hasNext()) {
            nume = nume + scanner.next();
        }
        System.out.println("Hello" + nume);

        Random random = new Random();
        Double pi = Math.PI;

    }
}
