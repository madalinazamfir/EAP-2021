package lab5.comparatie_clasa_interfata.pachet2;

import lab5.comparatie_clasa_interfata.pachet1.InterfaceExample;
import lab5.comparatie_clasa_interfata.pachet1.Parent;

// ordine: extend si apoi implement, invers avem eroare de compilare
public class ClassInterfaceComparison extends Parent implements InterfaceExample {

    @Override
    public String thisIsAnAbstractMethod() {
        return "thisIsAnAbstractMethod from InterfaceExample but I was implemented in ClassInterfaceComparison";
    }

    // poate fi suprascrisa in copil
    @Override
    public String thisIsAValidMethodWithImplementation() {
        return null;
    }
}
