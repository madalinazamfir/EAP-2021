package lab5.exercitiu2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class StudentServiceImpl implements StudentService{

    Student [] students = new Student [10];

    public StudentServiceImpl() {
        initStudents();
    }

    public Student[] getStudents () {
        Student[] clone = students.clone();
        Arrays.sort(clone);
        return clone;
    }

    @Override
    public Student[] getStudentsOrderedByName() {
        Student[] clone = students.clone();
        Arrays.sort(clone, new NameComparator());
        return clone;
    }

    @Override
    public Student[] getStudentsOrderedByNameAndYear() {
        Student[] clone = students.clone();
        Arrays.sort(clone, new NameComparator());
        Arrays.sort(clone, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getYear() - student2.getYear();
            }
        });
        return clone;
    }


    private void initStudents() {
        Random random = new Random();
        for(int i = 0; i <students.length; i++) {
            Student student = new Student();
            student.setName(generateRandomString());
            student.setYear(random.nextInt(3+1));
            students[i] = student;
        }
    }
    private String generateRandomString() {
        Random random = new Random();
        return random.ints(97, 122 + 1)
                .limit(10)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
