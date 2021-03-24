package lab5.exercitiu1;

public class Intake implements Notifiable{

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

    @Override
    public String getNotificationMessage() {
        return "Suma de " + amount + "de la" + from + " a fost virata in contul dvs";
    }
}
