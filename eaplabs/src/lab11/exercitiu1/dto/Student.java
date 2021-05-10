package lab11.exercitiu1.dto;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nume;
    private List<Materie> materii = new ArrayList<>();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    public List<Materie> getMaterii() {
        return materii;
    }

    public void addMaterie(Materie materie) {
        if(materie != null) {
            this.materii.add(materie);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", materii=" + materii +
                '}';
    }
}
