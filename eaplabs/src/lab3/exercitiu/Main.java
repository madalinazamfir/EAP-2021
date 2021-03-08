package lab3.exercitiu;

public class Main {

    public static void main(String[] args) {
         /* in functie de o optiune aleasa sa se intoarca un tip de abonament: LITE, PLUS, FULL
         fiecare abonament are o metoda generareFactura() - care intoarce pretul abonamentului
          */

        Magazin magazin = new Magazin();
        Abonament abonament = magazin.creareAbonament("lite");
        System.out.println(abonament.generareFactura());
    }
}
