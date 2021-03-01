package lab2.classes.inheritance;

public class Cat extends Animal{

    private String membruPrivat;

    public Cat(String porecla, String rasa) {
        super(porecla, rasa);
    }

    @Override
    public void mananca(String foodType) {
        System.out.println("mananca delicat "+ foodType);
    }

    @Override
    public void merge() {
        System.out.println("merge delicat ");
    }

    public void miauna() {
        System.out.println("miauna delicat");
    }

    public String getMembruPrivat() {
        return membruPrivat;
    }
}
