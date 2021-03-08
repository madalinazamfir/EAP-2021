package lab3.exercitiu;

public class Lite extends Abonament{


    public Lite(int pret) {
        super(pret);
    }

    @Override
    public String generareFactura() {
        return "Abonament Lite -> total: " + super.pret;
    }
}
