public class EmailSender implements NotificationSender{
    @Override
    public void send(String recipient, String message){
        System.out.println("Sending email to: "+ recipient);
        System.out.println("Your message: "+ message);
    }
}
