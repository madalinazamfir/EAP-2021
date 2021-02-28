package lab2.classes;

// nu se poate instantia
public abstract class AbstractClass {

    private int field;

    //dar pot sa am constructor
    // chiar daca nu am declarat nici un constructor, compilatorul va insera automat la compilare constructorul default (cel de jos)
    // daca am declarat un constructor, atunci compilatorul NU mai insereaza defaultul
    public AbstractClass() {
    }

    public AbstractClass(int field) {
        this.field = field;
    }

    //exemple de metode

    public abstract void abstractMethod(int param1, String param2);

    public String classicMethod() {
        return "I have implementation even though I am in an abstract class";
    }
}
