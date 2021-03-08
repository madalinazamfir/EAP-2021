package lab3.exercitiu;

public class Plus extends Abonament{

    public Plus(int pret) {
        super(pret);
    }

    @Override
    public String generareFactura() {
        return "Abonament Plus -> total: " + super.pret;
    }
}
