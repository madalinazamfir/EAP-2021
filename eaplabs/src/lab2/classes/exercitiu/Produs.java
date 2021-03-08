package lab2.classes.exercitiu;

public abstract class Produs {

    protected final int id;
    protected String nume = "name";
    protected String descriere;
    protected final int pret;

    public Produs(int id, int pret) {
        this.id = id;
        this.pret = pret;
    }

    public Produs(int id, String nume, String descriere, int pret) {
        this.id = id;
        this.nume = nume;
        this.descriere = descriere;
        this.pret = pret;
    }


}
