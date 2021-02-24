package lab1;

public class Operators {

    public static void main(String[] args) {

        // literals - valori specificate explicit in codu sursa, fara declararea unei variabile

        // Operatorul de atribuire "="
        // la atribuire pot avea loc conversii implicite de largire de tip

        short x = 12;
        int y = 10;

        short sum = (short) (x+y);


        // Operatorul de conversie explicita "()" - este folosit pentru a converti fortat valoarea unei variabile sau expresii la un tip de date dorit
        // In cazul primitivelor se pot converti tipurile de date numerice (inclusiv char), boolean nu se poate converti in/din alt tip de date
        // se poate folosi si pentru referinte, dar exista alte reguli
        // la conversia unui tip de date mai mare la un tip de date mai mic se pastreaza biti cei mai putin semnificativi

        int i2 = 1234567;
        byte b1 = (byte) i2;
        System.out.println(b1); // -121 - semnul este dat de ultimul bit


        // Operatori aritmetici : binari si unari
        // binari: "+" adunare, "-" scadere, "/" impartire, "%" modulo
        // "+" este supraincarcat

        System.out.println("text" + 5);
        System.out.println(5+5);
        System.out.println(5+5 + "2"); // 102
        System.out.println("2" + 5 + 6); // 256

        // unari: "++" incrementare, "--" decrementare

        // Operatori de comparare: ==, <, >, <=. >=, !=
        // genereaza un rezultat de tip boolean
        // !! din cauza impreciziei numerelor memorate in virgula mobila, nu este recomandata compararea acestora folosing "=="

        float fl1 = 6.1f;
        double d2 = 6.1;

        System.out.println(fl1 == d2); // false
        System.out.println(fl1 - d2); //-9.536743128535363E-8


        // Operatori logici: & si, | sau, ! diferit
        // cu scurcircuitare: && si, || sau

        int[] params = {};
        if(params.length !=0 && params[0] == 1) {

        }

        if(params.length !=0 & params[0] == 1) {
            // array index out of boundaries
        }



        // Operatorul ternar conditional: conditie ? valoare_conditia_e_adevarata : valoare_conditia_e_falsa


    }
}
