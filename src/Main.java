public class Main {
    public static void main(String[] args){
        NotificationSender email= new EmailSender();
        NotificationSender sms= new SMSSender();

        Notification normal= new NormalNotification(email);
        Notification urgent= new UrgentNotification(sms);

        normal.notifyUser("user@example.com", "You have received email");
        System.out.println();

        urgent.notifyUser("+77777777777", "Your account was accessed");

        System.out.println("\nSwitching delivery method:\n");

        normal.setSender(sms);
        normal.notifyUser("+77001234567", "Your package is ready");

        urgent.setSender(email);
        urgent.notifyUser("admin@example.com", "Server failure detected");
    }
}
