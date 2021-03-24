package lab5.exercitiu1;

public class Deposit implements Notifiable{

    private String name;
    private String currency;

    public Deposit(String name, String currency) {
        this.name = name;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String getNotificationMessage() {
        return "Ai deschis un nou cont in "+ currency + " cu numele " + name;
    }
}
