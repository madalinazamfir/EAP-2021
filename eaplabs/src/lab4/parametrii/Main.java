package lab4.parametrii;

public class Main {

    public static void main(String[] args) {

    }

    public static void modificareInt(int value) {
        value = value + 1;
    }

    public static void modificareString(String value) {
        value.concat("modificat in metoda");
    }

    public static void modificareObiect(Student student) {
        student.setNume("Alexandru Grigore");
        student.setVarsta(14);
    }
}
