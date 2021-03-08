package lab2.classes.exercitiu;

public class Main {

    public static void main(String[] args) {
        /* Creare magazin online:

        Cart trebuie sa permita adaugarea de un produs sau un produs + nr.
        Cart va avea o metoda "order" prin care se va alege metoda de plata "online" sau "cash" - validari
        Metoda de plata va fi o clasa separata care contine numai variabile globale
        Cart va avea o metoda "showDetails" care va afisa cate produse sunt in cos, descriere pentru fiecare, total pentru fiecare produs(nr*pret), total general, metoda de plata daca a fost setata.

        Fiecare produs va avea id, descriere, nume, pret - pretul si id unui produs nu se pot schimba pe parcurs
         */


        Cart cart = Cart.getInstance();
        Produs xbox = new XBox(1, 10000, "Xbox", "Xbox 3");
        Produs playStation = new PlayStation(2, 2000, "PlayStation", "PlayStation 5");
        Produs toaster = new Toaster(3,"Toaster", "descriere toaster", 200);

        cart.add(xbox);
        cart.add(playStation, 2);
        cart.add(toaster, 3);
        cart.order("online");
        System.out.println(cart.showDetails());
    }
}
