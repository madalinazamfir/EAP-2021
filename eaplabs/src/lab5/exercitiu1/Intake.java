package lab5.exercitiu1;

public class Intake {

    private int amount;
    private String from;

    public Intake(int amount, String from) {
        this.amount = amount;
        this.from = from;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
