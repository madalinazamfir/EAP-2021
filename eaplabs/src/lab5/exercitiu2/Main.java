package lab5.exercitiu2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        /*
            Sa se implementeze un serviciu care sa sorteze studentii:
                    - sortare implicita - dupa id
                    - sortare dupa nume
                    - sortare dupa nume si an
            De fiecare data cand se genereaza un student trebuie sa se genereze cu id.
         */
        StudentServiceImpl service = new StudentServiceImpl();
        System.out.println(Arrays.toString(service.getStudents()));
        System.out.println(Arrays.toString(service.getStudentsOrderedByName()));
        System.out.println(Arrays.toString(service.getStudentsOrderedByNameAndYear()));
    }
}
