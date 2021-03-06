package lab5.exercitiu1;

public class Payment implements Notifiable{

    private int amount;
    private String to;

    public Payment(int amount, String to) {
        this.amount = amount;
        this.to = to;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String getNotificationMessage() {
        return "S-a efectuat o plata in valoare de " + amount + " catre contul " + to;
    }
}
