package lab2.classes.exercitiu;

public class PlayStation extends Produs{

    public PlayStation(int id, int pret, String descriere, String nume) {
        super(id, pret);
        super.nume = nume;
        super.descriere = descriere;
    }
}
