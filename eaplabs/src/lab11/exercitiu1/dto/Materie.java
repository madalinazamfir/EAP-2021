package lab11.exercitiu1.dto;

import lab11.exercitiu1.util.MaterieNumeEnum;

public class Materie {
    private MaterieNumeEnum nume;
    private float medie;

    public MaterieNumeEnum getNume() {
        return nume;
    }

    public void setNume(MaterieNumeEnum nume) {
        this.nume = nume;
    }

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }
}
