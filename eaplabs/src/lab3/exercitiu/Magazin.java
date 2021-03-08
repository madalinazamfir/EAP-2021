package lab3.exercitiu;

public class Magazin {

    // design pattern factory
    public Abonament creareAbonament(String tip) {
        switch (tip){
            case "full": return new Full(10);
            case "lite": return new Lite(5);
            case "plus": return new Plus(15);
            default: throw new IllegalArgumentException("nu exista");
        }
    }
}
