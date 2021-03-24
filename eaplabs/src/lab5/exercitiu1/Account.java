package lab5.exercitiu1;

import java.util.Arrays;

public class Account {

    private NotificationService notificationService = new NotificationService();

    private Payment[] credit = new Payment[0];
    private Intake[] debit = new Intake[0];
    private Deposit[] deposits = new Deposit[0];

    public void pay(int amount, String to){
        Payment newPayment = new Payment(amount, to);
        credit = Arrays.copyOf(credit, credit.length + 1);
        credit[credit.length - 1] = newPayment;
        notificationService.send(newPayment);
    }

    public void receive(int amount, String from) {
        Intake receivedMoney = new Intake(amount, from);
        debit = Arrays.copyOf(debit, debit.length + 1);
        debit[debit.length - 1] = receivedMoney;
        notificationService.send(receivedMoney);
    }

    public void openDeposit(String name, String currency) {
        Deposit newDeposit = new Deposit(name, currency);
        deposits = Arrays.copyOf(deposits, deposits.length + 1);
        deposits[deposits.length - 1] = newDeposit;
        notificationService.send(newDeposit);
    }
}
