package lab3.recap;

public class Sportiv extends Persoana{

    protected int nivel;
    protected int senioritate;

    public Sportiv(String nume, int nivel) {
        super(nume);
        this.nivel = nivel;
    }

    public Sportiv(int senioritate) {
        super("Maria");
        this.senioritate = senioritate;
    }

    @Override
    public String prezentare() {
        return super.prezentare() + " si sunt sportiv";
    }

    public void antrenament() {
        nivel++;
    }
}
