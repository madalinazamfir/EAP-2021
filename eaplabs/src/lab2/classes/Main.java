package lab2.classes;

import lab2.classes.inheritance.Animal;
import lab2.classes.inheritance.Cat;

public class Main {

    public static void main(String[] args) {
        Animal[] gradinaZoo = new Animal[2];
        Cat tom = new Cat("miti", "europeana");
        gradinaZoo[0] = tom;

        Animal tom2 = new Cat("miti2", "europeana");

        tom2.mananca("pliculete"); // polimorfism dinamic

        Cat tom3 = (Cat) tom2;
        tom3.getMembruPrivat();

    }
}
