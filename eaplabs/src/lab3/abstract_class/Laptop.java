package lab3.abstract_class;

public class Laptop extends ElectronicDevice{

    @Override
    public int consumKW() {
        return 25;
    }

    @Override
    public void start() {
        System.out.println("booting system");
    }
}
