package lab11.exercitiu1.dto;


public class Absolvent {

    private String nume;
    private int anAbsolvire;

    public Absolvent() {
    }

    public int getAnAbsolvire() {
        return anAbsolvire;
    }

    public void setAnAbsolvire(int anAbsolvire) {
        this.anAbsolvire = anAbsolvire;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Absolvent{" +
                "nume='" + nume + '\'' +
                ", anAbsolvire=" + anAbsolvire +
                '}';
    }
}
