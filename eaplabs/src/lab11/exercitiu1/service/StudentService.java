package lab11.exercitiu1.service;

import lab11.exercitiu1.dto.Absolvent;
import lab11.exercitiu1.dto.Materie;
import lab11.exercitiu1.dto.Student;
import lab11.exercitiu1.util.MaterieNumeEnum;
import lab3.membrii_statici.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    // absolvire - doar studentii care au trecut la toate materiile
    //  Sa intoarca o lista de absolventi cu .map
    public List <Absolvent> graduate () {
        return students.stream()
                .filter(s -> s.getMaterii().stream()
                        .anyMatch(m -> m.getMedie() < 5))
                .map(s -> {
                    Absolvent a = new Absolvent();
                    a.setNume(s.getNume());
                    a.setAnAbsolvire(2021);
                    return a;
                })

                .collect(Collectors.toList());
    }

    //media generala pentru un student cu numele x

    public float medie (String student) {
        Optional<Student> found =
        students.stream()
                .filter(s -> s.getNume() == student)
                .findAny();

        int nrMAterii =
                found
                    .map(s -> s.getMaterii().size()).orElseThrow(() -> new RuntimeException("Nu s-a gasit studentul"));

        float suma =
                found
                    .map(s -> s.getMaterii().stream().map(m -> m.getMedie()).count()).orElseThrow(() -> new RuntimeException("Nu s-a gasit studentul"));
        return suma/nrMAterii;
    }

    //lista studentilor ordonata in functie de medie pentru o anumita materie

    private void initData() {
        Student studentPopescu = new Student();
        studentPopescu.setNume("Popescu Anghel");
        studentPopescu.addMaterie(buildMaterie(MaterieNumeEnum.MATEMATICA, 4.2f));
        studentPopescu.addMaterie(buildMaterie(MaterieNumeEnum.INFORMATICA, 7f));
        studentPopescu.addMaterie(buildMaterie(MaterieNumeEnum.ENGLEZA, 9.8f));
        this.students.add(studentPopescu);

        Student studentMatei = new Student();
        studentMatei.setNume("Matei Ana");
        studentMatei.addMaterie(buildMaterie(MaterieNumeEnum.MATEMATICA, 7f));
        studentMatei.addMaterie(buildMaterie(MaterieNumeEnum.INFORMATICA, 10f));
        studentMatei.addMaterie(buildMaterie(MaterieNumeEnum.ENGLEZA, 7.8f));
        this.students.add(studentMatei);

        Student studentCiobotea = new Student();
        studentCiobotea.setNume("Ciobotea Cristina");
        studentCiobotea.addMaterie(buildMaterie(MaterieNumeEnum.MATEMATICA, 10f));
        studentCiobotea.addMaterie(buildMaterie(MaterieNumeEnum.INFORMATICA, 10f));
        studentCiobotea.addMaterie(buildMaterie(MaterieNumeEnum.ENGLEZA, 10f));
        this.students.add(studentCiobotea);

        Student studentMaftei = new Student();
        studentMaftei.setNume("Maftei Alin");
        studentMaftei.addMaterie(buildMaterie(MaterieNumeEnum.MATEMATICA, 8f));
        studentMaftei.addMaterie(buildMaterie(MaterieNumeEnum.INFORMATICA, 8.5f));
        studentMaftei.addMaterie(buildMaterie(MaterieNumeEnum.ENGLEZA, 3f));
        this.students.add(studentMaftei);
    }

    private Materie buildMaterie(MaterieNumeEnum numeMaterie, float medie) {
        Materie materie = new Materie();
        materie.setMedie(medie);
        materie.setNume(numeMaterie);
        return materie;
    }

}
