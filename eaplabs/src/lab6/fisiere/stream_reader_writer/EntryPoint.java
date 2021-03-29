package lab6.fisiere.stream_reader_writer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EntryPoint {

    public final static String RESOURCES_FOLDER = System.getProperty("user.dir") + "\\eaplabs\\src\\lab6\\fisiere\\resources";
    public final static String COPY_FOLDER = System.getProperty("user.dir") + "\\eaplabs\\src\\lab6\\fisiere\\resources\\copy";

    /*
        InputStream (clasa abstracta) - citire:
            -> parintele tuturor claselor de tip flux de date de intrare orientate pe octet
            -> are used to perform input and output of 8-bit bytes
            -> din ea deriva ByteArrayInputStream, FileInputStream, FilterInputStream
        Decoratori:
            - BufferedInputStream: citeste "bucati mare" de bytes
            - DataInputStream: permite citirea de date primitive din stream
    */

    // sa se copieze imaginea cat.jpeg din resorces folosind ByteArrayInputStream si FileInputStream
    public static void copyCat() {

    }

    // sa se copieze lorem_insum.txt in copy folosind bufferedInputStream si bufferedOutputStream
    public static void copyTextWithBuffer() {

    }

    // sa se afiseze continutul lui lorem_ipsum.txt in consola cu DataInputStream
    public static void showContentWithData() {

    }

    public static void main(String[] args) {

    }
}
