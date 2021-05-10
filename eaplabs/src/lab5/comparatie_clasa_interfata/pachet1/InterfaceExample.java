package lab5.comparatie_clasa_interfata.pachet1;

// nu are constructor
public interface InterfaceExample {

    String variable = "InterfaceExample"; // chiar daca nu am specificat variabila este deja public, static si final

    String thisIsAnAbstractMethod(); // metoda este publica si abstracta fara sa fie nevoie sa specificam asta

//    String thisIsACompilationErrorMethod() { // nu compileaza pentru ca by default compilatorul o considera publica si abstracta
//        return "I am not compilable";
//    }

    // incepand cu java 8
    default String thisIsAValidMethodWithImplementation() {
        return "I am an implemented method in an interface";
    }

    static String thisIsAStaticMethod() {
        return "I am a static method in an interface";
    }

   /* // incepand cu java 9
    private String thisIsAPrivateMethod() {
        return "I am a private method in an interface";
    }

    private static String thisIsAPrivateAndStaticMethod() {
        return "I am a private and also static method in an interface";
    }

    */
}
