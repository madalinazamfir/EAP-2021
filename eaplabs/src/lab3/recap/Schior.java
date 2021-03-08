package lab3.recap;

import java.util.Random;

public class Schior extends Sportiv {

    protected int nivel;

    protected int olimpiadeCastigate;

    public Schior(String nume, int nivel) {
        super(nume, nivel);
        this.nivel = nivel;
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
