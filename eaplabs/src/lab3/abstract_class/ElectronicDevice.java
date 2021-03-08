package lab3.abstract_class;

public abstract class ElectronicDevice {

    public abstract int consumKW();

    public abstract void start();

    public void stop() {
        System.out.println("Shutting down");
    }

}
