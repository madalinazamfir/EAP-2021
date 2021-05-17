package lab6.fisiere.stream_reader_writer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
    public static void copyCat() throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(RESOURCES_FOLDER + "\\cat.jpeg"));
        FileInputStream inputStream = new FileInputStream(RESOURCES_FOLDER + "\\cat.jpeg");
        FileOutputStream outputStream = new FileOutputStream(COPY_FOLDER + "\\cat_copy.jpeg");
//        outputStream.write(bytes);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // cand nu avem nevoie sa cream fisierul - ci doar sa mutam dintr o parte in alta bytes
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.writeTo(outputStream);
        inputStream.close();
        byteArrayOutputStream.close();
        outputStream.close();
    }

    // sa se copieze lorem_insum.txt in copy folosind bufferedInputStream si bufferedOutputStream
    public static void copyTextWithBuffer() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(RESOURCES_FOLDER + "\\lorem_ipsum.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(COPY_FOLDER + "\\copy_lorem.txt"));
//        bufferedOutputStream.write(bufferedInputStream.readAllBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        bufferedInputStream.close();

//        int c;
//        while ((c = bufferedInputStream.read()) > -1) {
//            bufferedOutputStream.write(c);
//        }

    }

    // sa se afiseze continutul lui lorem_ipsum.txt in consola cu DataInputStream
    public static void showContentWithData() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(RESOURCES_FOLDER + "\\lorem_ipsum.txt"));
        StringBuilder builder = new StringBuilder();
        while (dataInputStream.available() > 0) {
            builder.append((char) dataInputStream.read());
        }
        System.out.println(builder);
    }

    public static void main(String[] args) {
        try {
            showContentWithData();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }


}
