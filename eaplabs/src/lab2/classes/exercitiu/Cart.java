package lab2.classes.exercitiu;

public class Cart {

    private static Cart cart;
    Produs[] produse = new Produs[10];

    private Cart() {
    }

    public static Cart getInstance() {
        if(cart == null) {
            cart = new Cart();
            return cart;
        } else {
            return cart;
        }
    }

    public void add(Produs produs) {

    }
    //varargs
    public void add(Produs ...produse) {

    }

//    public void add(int nr, Produs ...produse) {
//
//    }

    public void add(Produs produs, int nr) {

    }
}
