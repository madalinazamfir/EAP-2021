package lab5.exercitiu1;

public class Main {

    public static void main(String[] args) {
        /* Cont bancar:
                Sa se scrie un serviciu care, de fiecare data cand se intampla o actiune in contul meu, trimite o notificare(mail, mesaj = un system.out)
                Ex actiuni:
                    - incasare
                    - plata
                    - deschidere depozit
        */

        Account myAccount = new Account();
        myAccount.pay(20, "RO04RZBR9629448399233658");
        myAccount.receive(200, "RO97RZBR2655429746674587");
        myAccount.openDeposit("Savings", "RON");

    }
}
