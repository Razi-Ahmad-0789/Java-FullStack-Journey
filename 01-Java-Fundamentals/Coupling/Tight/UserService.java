package tight;


import loose.NotificationService;

public class UserService {
     loose.NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

//    public void notifyUser(String message){
//        notificationService.send("Notification hello");
//
//    }
}
