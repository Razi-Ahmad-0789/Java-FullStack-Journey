package loose;

public class EmailNotificationService implements NotificationService{

    @Override
    public void message(String message) {
        System.out.println("Email:"+message);
    }
}
