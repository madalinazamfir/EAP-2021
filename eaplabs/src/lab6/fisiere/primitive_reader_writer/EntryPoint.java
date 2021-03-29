package lab6.fisiere.primitive_reader_writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EntryPoint {
    /*
    FileReader si FileWriter
        - citeste/scrie 16-bit unicode
        - intern foloseste FileInputStream/FileOutputStream

    RandomAccessFile implementeaza DataOutput si DataInput
    BufferedReader / BufferedWriter
     */

    public final static String FILE_PATH = System.getProperty("user.dir")+ "\\eaplabs\\src\\lab6\\fisiere\\resources\\story.txt";
    public final static String NEW_FILE_PATH = System.getProperty("user.dir")+ "\\eaplabs\\src\\lab6\\fisiere\\resources\\empty.txt";

    public static void main(String[] args) {
        try {
            writeWithBufferedWriter();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    public static void readFromFileWithFileReader() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        int c;
        StringBuilder builder = new StringBuilder();
        while ((c = fileReader.read()) > -1) {
            builder.append((char) c);
        }
        System.out.println(builder);
        fileReader.close();

    }

    public static void writeWithFileReader() throws IOException {
        FileWriter fileWriter = new FileWriter(NEW_FILE_PATH, true);
        fileWriter.write("Hello World");
        fileWriter.flush();
        fileWriter.close();

    }

    public static void readWithRandomAccessFile() throws IOException {
        // mode: r - citire, rw - scriere
        RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_PATH, "r");
        System.out.println(randomAccessFile.readLine());
        randomAccessFile.writeChars("Hello"); // arunca eroare pentru ca am deschis fisierul doar cu drepturi de citire
        System.out.println(randomAccessFile.length());
        randomAccessFile.close();
    }

    public static void writeWithRandomAccessFile() throws IOException {
    RandomAccessFile randomAccessFile = new RandomAccessFile(NEW_FILE_PATH, "rw");
    randomAccessFile.writeChars("Hello");
    randomAccessFile.close();
    }

    public static void readWithBufferedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        System.out.println(reader.readLine());
        reader.close();
    }

    public static void writeWithBufferedWriter() throws IOException {
        BufferedWriter reader = new BufferedWriter(new FileWriter(NEW_FILE_PATH));
        reader.write("Acesta este laboratorul nr 6");
        reader.flush();
        reader.close();
    }
}
