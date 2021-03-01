package lab2.classes.inheritance;

public class Animal {

    private String nume;
    private String porecla;
    private String rasa;

    public Animal(String porecla, String rasa) {
        this.porecla = porecla;
        this.rasa = rasa;
    }

    public Animal(String nume, String porecla, String rasa) {
        this.nume = nume;
        this.porecla = porecla;
        this.rasa = rasa;
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPorecla() {
        return porecla;
    }

    public void setPorecla(String porecla) {
        this.porecla = porecla;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void mananca(String foodType) {
        System.out.println("mananca "+ foodType);
    }

    protected void merge() {
        System.out.println("merge default");
    }
}
