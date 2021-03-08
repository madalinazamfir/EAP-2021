package lab2.classes.exercitiu;

import java.util.Arrays;

public class Cart {

    private static Cart cart;
    private CartItem[] produse = new CartItem[10];
    private int total;
    private String payment;

    private Cart() {
    }

    public static Cart getInstance() {
        if (cart == null) {
            cart = new Cart();
            return cart;
        } else {
            return cart;
        }
    }

    private int calculeazaTotalGenerat() {
        int total = 0;
        for (CartItem item : produse) {
            total = total + item.getNr();
        }
        return total;
    }

    public void add(Produs produs) {
        this.add(produs, 1);
    }

    public void add(Produs produs, int nr) {
        for (CartItem item : produse) {
            if (item != null && item.getProdus().id == produs.id) {
                item.setNr(item.getNr() + nr);
            }
        }
        for (int i = 0; i < produse.length; i++) {
            if (produse[i] == null) {
                produse[i] = new CartItem(produs, nr);
            }
        }
    }

    public void order(String metoda) {
        switch (metoda) {
            case Payment.online: payment = Payment.cash;
            break;
            case Payment.cash: payment = Payment.cash;
            break;
            default: throw new IllegalArgumentException("metoda de plata nerecunoscuta");
        }
    }

    //varargs
    public void add(Produs... produse) {

    }

//    public void add(int nr, Produs ...produse) {
//
//    }

    public String showDetails() {
        String[] detalii = new String[12];
        for(int i=0; i < produse.length; i++) {
            Produs pr = produse[i].getProdus();
            String descriere = "";

            descriere = descriere.concat("Nume: " + pr.nume)
                    .concat("Descriere: " + pr.descriere)
                    .concat("Nr: " + produse[i].getNr() * pr.pret);
            detalii[i] = descriere;
        }
        detalii[10] = "Total general: " + this.calculeazaTotalGenerat();
        detalii[11] = payment.toString();
        return Arrays.deepToString(detalii);
    }
}
