package lab6.exceptii.teorie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Structura {

    private static File filePath = new File(System.getProperty("user.dir")+ "\\eaplabs\\src\\lab6\\exceptii\\resources\\existing.txt");


    // Tipurile de obiecte care pot fi "aruncate" (throw) sunt derivate din clasa java.lang.Throwable
    /* 2 categorii:
            - Error: ex: StackOverflowError, OutOfMemoryError - sunt erori care nu au sens sa fie tratate de aplicatie (desi ele pot fi prinse si tratate, insa in general e prea tarziu)
            - Exception - clasa parinte pentru toate exceptiile
                -> descendentii directi ai clasei Exception se numesc "checked" - aceste exceptii pot aparea indiferent de calitatea codului (o conexiune se intrerupe, un fisier a fost sters si nu mai poate fi accesat)
                -> ex: IOException, SQLException
                -> trebuie tratate sau propagate mai departe in semnatura metodei
     */
    public void openFile() throws FileNotFoundException {
        File filePath = new File("/non-existing.txt");
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
    }

    public static void openFileWithTryCatch() {
        File filePath = new File("../non-existing.txt");
        try {
            RandomAccessFile file = new RandomAccessFile(filePath, "r");
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file");
            return;
        } finally {
            System.out.println("S-a aruncat exceptia si s-a facut return, dar eu tot m-am executat");
        }
    }


    /*
            - RuntimeException - erori de programare
                -> extinde clasa Exception
                -> exemple: NullPointerException, IllegalArgumentException, ArrayIndexOutOfBoundsException, etc

        Aruncare exceptii: cuvant cheie throw
        Prindere exceptii:
        try {
            cod care arunca exceptie
        } catch(tip exceptie) {
            fa ceva cu exceptia prinsa
        } finally {
            se executa indiferent daca se arunca exceptia in cauza, indiferent daca se foloseste return
        }
     */

    public static void openExistingFile(){
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(filePath, "r");
            System.out.println(file.readLine());
            return;
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file");
        } catch (IOException e) {
            System.out.println("Cannot open file");
        } finally {
            System.out.println("No exception but i was still executed");
            if(file != null) {
                // pentru ca metoda .close arunca o IOException, ori o declaram in metoda, ori o prindem
                // acesta este un anti-pattern
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("Closed file");
                }

            }

        }
    }

    // java 7+ try-with-resources
    public static void openExistingFileTheRightWay(){
        // try with resources
        try(RandomAccessFile file = new RandomAccessFile(filePath, "r")) {
            System.out.println(file.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file"); // as putea sa ma lipsesc de acest catch pentru ca FileNotFoundException extinde IOException
        } catch (IOException e) {
            System.out.println("Cannot open file");
        } finally {
            System.out.println("Now I don't need to close the file anymore, because try-with-resources will handle this");
        }
    }

    public static void main(String[] args) {
//        openFileWithTryCatch();
        openExistingFile();
    }
}
