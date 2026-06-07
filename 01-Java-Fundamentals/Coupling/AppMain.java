import loose.EmailNotificationService;
import loose.NotificationService;
import tight.UserService;

public class AppMain {
    public static void main(String[] args) {

        //Tight
//        UserService userService=new UserService();
//          userService.notifyUser("Order Placed");

        //Loose
        NotificationService emailService=new EmailNotificationService();
        UserService userServiceLoose=new UserService(emailService);
    }
}
