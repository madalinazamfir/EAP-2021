package lab4.parametrii;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int x = 10;
        modificareInt(x);
        System.out.println(x);

        Student student = new Student();
        System.out.println(student);
        student = modificareObiect(student);
        System.out.println(student);
        System.out.println(student.getNume());

        String text = "Micky mouse";
        modificareString(text);
        System.out.println(text);

        String returnValue = modificareString(text, 5);

        int[] var = {1,2,3};
        modificareArray(var);
        System.out.println(Arrays.toString(var));

    }

    public static void modificareArray(int[] array) {
        array[0] = 100;
    }

    public static void modificareInt(int value) {
        value = value + 1;
    }

    public static void modificareString(String value) {
        value.concat("modificat in metoda");
    }

    public static Student modificareObiect(Student student) {
        student.setNume("Alexandru Grigore");
        student.setVarsta(14);
        return student;
    }

    public static String modificareString(String value, int x) {
        return value.concat("modificat");
    }
}
