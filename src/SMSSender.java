public class SMSSender implements NotificationSender{
    @Override
    public void send(String recipient, String message){
        System.out.println("Sending SMS to: "+ recipient);
        System.out.println("Your message: "+ message);
    }
}
