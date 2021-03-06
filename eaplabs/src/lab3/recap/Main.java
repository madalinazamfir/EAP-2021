package lab3.recap;

public class Main {

    public static void main(String[] args) {
        Schior schior = new Schior("Andrei", 1);

        boolean esteSchior = schior instanceof Schior;
        boolean esteSportiv = schior instanceof Sportiv;
        boolean estePersoana = schior instanceof Persoana;
        System.out.println(esteSchior + " " + esteSportiv + " " + estePersoana); // true true true
//        boolean compilationError = schior instanceof String;


        // upcasting
        Persoana persoanaSchior = new Schior("Marius", 0); // acces doar la membrii Persoana (nume, prezinta() )
        Sportiv sportivSchior = new Schior("Alex", 10);
        sportivSchior.antrenament();
        System.out.println(sportivSchior.nivel); // 11

        //downcasting
        Persoana persoana = new Schior("Maria", 1);
        Schior schior1 = (Schior) persoana;
        System.out.println(persoana.prezentare()); // polimorfism dinamic

        // downcasting gresit
//        Schior schiorD = (Schior) new Persoana("Alexandru");
//        schiorD.getNivelSchior(); // exceptie java.lang.ClassCastException
        // in cazul acesta era bine sa facem instanceOf

        //suprapuneri
        schior.inregistrare();
        schior.antrenament();
        System.out.println(schior.getNivelSchior());
        System.out.println(schior.getNivelParinte());

    }
}
