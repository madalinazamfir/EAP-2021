package lab3.recap;

public class Sportiv extends Persoana{

    protected int nivel;

    public Sportiv(String nume, int nivel) {
        super(nume);
        this.nivel = nivel;
    }

    @Override
    public String prezentare() {
        return super.prezentare() + " si sunt sportiv";
    }

    public void antrenament() {
        nivel++;
    }
}
