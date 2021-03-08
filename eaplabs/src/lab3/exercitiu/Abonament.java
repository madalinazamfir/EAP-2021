package lab3.exercitiu;

public abstract class Abonament {

    protected int pret;

    public Abonament(int pret) {
        this.pret = pret;
    }

    public abstract String generareFactura();
}
