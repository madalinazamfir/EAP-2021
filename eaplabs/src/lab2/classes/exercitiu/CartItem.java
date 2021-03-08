package lab2.classes.exercitiu;

public class CartItem {

    private Produs produs;
    private int nr;

    public CartItem(Produs produs, int nr) {
        this.produs = produs;
        this.nr = nr;
    }

    public Produs getProdus() {
        return produs;
    }

    public void setProdus(Produs produs) {
        this.produs = produs;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
