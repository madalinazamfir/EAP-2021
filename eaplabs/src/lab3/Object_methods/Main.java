package lab3.Object_methods;

import lab3.agregare_compozitie.Book;
import lab3.agregare_compozitie.Gender;

public class Main {
    public static void main(String[] args) {
        Gender gender = new Gender("SF");
        Book book = new Book("carte",10,gender);
        String name = book.toString();
        System.out.println(name);

        Student student = new Student(10,"Maria","253", 2);
        Student student1 = new Student(12,"Maria","253", 2);

        System.out.println(student.equals(student1));
    }
}
