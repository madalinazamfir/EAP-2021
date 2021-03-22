package lab5.comparatie_clasa_interfata.pachet1;

public class Parent {

    public static String staticVariableFromClass = "staticVariableFromClass";

    // eroare de compilare, cuvantul cheie default se poate folosi numai in interfete,
    // a nu se confunda cu nivelul de acces default(adica lipsa unui modificator de acces) invatat la clasa
//    default String defaultMethod(){
//        return "I am a 'default' method in a class";
//    }

    String defaultLevelAccessMethod() {
        return "I have default level access";
    }

}
