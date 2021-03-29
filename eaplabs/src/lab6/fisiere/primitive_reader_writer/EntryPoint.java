package lab6.fisiere.primitive_reader_writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
     */

    public final static String FILE_PATH = System.getProperty("user.dir")+ "\\eaplabs\\src\\lab6\\fisiere\\resources\\story.txt";
    public final static String NEW_FILE_PATH = System.getProperty("user.dir")+ "\\eaplabs\\src\\lab6\\fisiere\\resources\\empty.txt";

    public static void main(String[] args) {

    }

    public void readFromFileWithFileReader() {

    }

    public static void writeWithFileReader() {

    }

    public static void readWithRandomAccessFile() {

    }

    public static void writeWithRandomAccessFile() {

    }

    public static void readWithBufferedReader() {

    }

    public static void writeWithBufferedWriter() {

    }
}
