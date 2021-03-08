package lab3.Object_methods;

public class Student {

    private int id;
    private String name;
    private String group;
    private int year;

    public Student(int id, String name, String group, int year) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.year = year;
    }

    @Override
    // produce un nr calculat pe baza continutului obiectului. Nu este unic de la un obiect la altul, insa trebuie sa fie acelasi pentru 2 obiecte care sunt equals din pct de vedere al lui equals() din motive de performanta - mai multe detalii la colectii
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    // implementarea originala compara referintele
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    // implementarea originala produce un String de forma tipDeData@hashCode
    public String toString() {
        return super.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
