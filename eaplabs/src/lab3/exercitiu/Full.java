package lab3.exercitiu;

public class Full extends Abonament{

    public Full(int pret) {
        super(pret);
    }

    @Override
    public String generareFactura() {
        return "Abonament Full -> total: " + super.pret;
    }
}
