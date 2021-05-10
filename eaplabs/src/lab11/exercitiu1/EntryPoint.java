package lab11.exercitiu1;

import lab11.exercitiu1.service.StudentService;

public class EntryPoint {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        System.out.println(studentService.graduate());

        System.out.println(studentService.medie("Maftei Alin"));
    }
}
