package lab5.comparatie_clasa_interfata;

import lab5.comparatie_clasa_interfata.pachet1.InterfaceExample;
import lab5.comparatie_clasa_interfata.pachet2.ClassInterfaceComparison;

public class Main {

    public static void main(String[] args) {
        ClassInterfaceComparison comparison = new ClassInterfaceComparison();
        comparison.thisIsAnAbstractMethod();
        comparison.thisIsAValidMethodWithImplementation();
        String staticFieldFromInterface = InterfaceExample.variable;
        String staticMethodFromInterface = InterfaceExample.thisIsAStaticMethod();

        System.out.println(comparison instanceof InterfaceExample); // true

    }
}
