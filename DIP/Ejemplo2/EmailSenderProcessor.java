package DIP.Ejemplo2;

public class EmailSenderProcessor implements EmailProcessor
{
    private EmailSender emailSender;
    
    public EmailSenderProcessor(EmailSender emailSender){
        this.emailSender = emailSender;
    }
    
    @Override
    public void sendEmail(User user){
        emailSender.sendEmail(user.getEmail(), "Welcome to our platform!");
    }
}