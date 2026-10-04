public class NormalNotification extends Notification{
    public NormalNotification(NotificationSender sender){
        super(sender);
    }
    @Override
    public void notifyUser(String recipient, String message){
        sender.send(recipient, "Normal Notification: "+message);
    }
}
