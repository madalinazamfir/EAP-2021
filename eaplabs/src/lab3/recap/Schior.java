package lab3.recap;

import java.util.Random;

public class Schior extends Sportiv {

    protected int nivel;

    protected String nume = "Schior nume";

    protected int olimpiadeCastigate;

    public Schior(String nume, int nivel) {
        super(nume, nivel);
        this.nivel = nivel;
    }

    public void inregistrare() {
        System.out.println(this.senioritate);
        System.out.println(super.nume + " este numele din clasa Persoana");
        System.out.println(this.nume + " este numele din clasa Schior");
    }

    public void participareOlimpiada() {
        Random random = new Random();
        if (random.nextBoolean()) {
            olimpiadeCastigate++;
        }
    }

    @Override
    public void antrenament() {
        super.antrenament();
        this.nivel = this.nivel +10;
    }

    public int getNivelParinte() {
        return super.nivel;
    }

    public int getNivelSchior() {
        return this.nivel;
    }

    public int getOlimpiadeCastigate() {
        return olimpiadeCastigate;
    }

    public void setOlimpiadeCastigate(int olimpiadeCastigate) {
        this.olimpiadeCastigate = olimpiadeCastigate;
    }
}
