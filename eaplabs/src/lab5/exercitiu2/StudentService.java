package lab5.exercitiu2;

/*
Aceasta interfata reprezinta un "contract". Orice serviciu care implementeaza interfata StudentService va trebui sa asigure implementare pentru cele 3 metode.
De ce as vrea sa am mai multe servicii care fac acelasi lucru? De exemplu putem avea un serviciu ca StudentServiceImpl care reprezinta un "in memory" (info despre studenti sunt salvate intr un array, iar la terminarea executiei programului pierdem toate datele) si un serviciu care interogheaza baza si aduce studenti din baza de date. Astfel avem 2 implementari si putem "switch-ui" implementarea dorita doar instantiind alt serviciu:
 StudentService service = new StudentServiceImpl();
 StudentService service = new StudentServiceImplWithDataBase();
 */
public interface StudentService {

    Student[] getStudents();

    Student[] getStudentsOrderedByName();

    Student[] getStudentsOrderedByNameAndYear();
}
