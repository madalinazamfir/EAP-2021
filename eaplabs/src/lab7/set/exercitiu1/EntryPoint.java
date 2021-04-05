package lab7.set.exercitiu1;

import lab7.set.exercitiu1.dto.Bug;
import lab7.set.exercitiu1.serviciu.BugService;

public class EntryPoint {

    /*
    Sa se realizeze folosind un Set un sistem de stocare a bug-urilor
    Reguli:
        - un bug nu trebuie sa se repete (de asta folosim Set)
        - trebuie stocate in ordinea severitatii (severitate 1 -> severitate 3)
        - sa se afiseze lista la final

        Bug contine: title & severity
     */

    public static void main(String[] args) {
        Bug bug1 = new Bug("bug critic", 1);
        Bug bug2 = new Bug("bug moderate", 2);
        Bug bug3 = new Bug("bug mic", 3);

        BugService bugService = new BugService();
        bugService.add(bug1, bug2, bug3);

        System.out.println(bugService.getAll());
    }
}
