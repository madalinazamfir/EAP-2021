package lab2.classes.exercitiu;

import lab2.classes.Access;

public class XBox extends Produs {

    public XBox(int id, int pret, String nume, String descriere) {
        super(id, pret);
        super.nume = nume;
        super.descriere = descriere;
    }
}
