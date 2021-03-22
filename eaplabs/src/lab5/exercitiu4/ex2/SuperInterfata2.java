package lab5.exercitiu4.ex2;

public interface SuperInterfata2 {

    default String defaultMethodPresentIn2Interfaces() {
        return "SuperInterfata2 I have the same name in 2 interfaces and I am default in both";
    }

    String abstractMethodPresentIn2Interfaces();
}
