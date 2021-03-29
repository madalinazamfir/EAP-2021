package lab6.exceptii.teorie;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.AccessDeniedException;

public class AntiPattern {

    public void catchingAnExceptionAndDoingNothing() throws AccessDeniedException {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            /* e.printStackTrace() printeaza in consola
            In viata reala nu mai exista consola (plus ca un restart de aplicatie "curata" consola), iar erorile trebuie logate in fisiere speciale pentru a ajuta la debug
             */
        }
    }

    public void throwingInFinally() throws AccessDeniedException {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            throw new AccessDeniedException("there is a problem");
        }
    }

    public static boolean trickingTheCompiler() {
        try {
            FileOutputStream outputStream = new FileOutputStream("ex1.txt");
            // pacalesc compilatorul
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            // finally a fost conceput pentru clean up: inchidere conexiuni la baza, inchidere fisiere,
            return false;
        }
    }


}
