package lab2.classes.exercitiu;

public class Exercise {

    public static void main(String[] args) {
        /* Creare magazin online:

        Cart trebuie sa permita adaugarea de un produs sau un produs + nr.
        Cart va avea o metoda "order" prin care se va alege metoda de plata "online" sau "cash" - validari
        Metoda de plata va fi o clasa separata care contine numai variabile globale
        Cart va avea o metoda "showDetails" care va afisa cate produse sunt in cos, descriere pentru fiecare, total pentru fiecare produs(nr*pret), total general, metoda de plata daca a fost setata.

        Fiecare produs va avea id, descriere, nume, pret - pretul si id unui produs nu se pot schimba pe parcurs
         */

        Produs produs = new Produs(1, 20);
        produs.descriere = "ala bala";
        Cart cart = Cart.getInstance();
//        cart.add(new Produs(10, 20), new Produs(10, 50));
    }
}
