package lab5.exercitiu1;

public class NotificationService {

    public void send(Notifiable notifiable) {
        System.out.println(notifiable.getNotificationMessage());
    }
}
