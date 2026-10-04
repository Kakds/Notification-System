public class UrgentNotification extends Notification{
    public UrgentNotification(NotificationSender sender){
        super(sender);
    }
    @Override
    public void notifyUser(String recipient, String message){
        sender.send(recipient, "Urgent: "+message);
    }
}
