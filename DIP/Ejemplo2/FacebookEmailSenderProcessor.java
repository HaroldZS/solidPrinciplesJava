package DIP.Ejemplo2;

public class FacebookEmailSenderProcessor implements EmailProcessor
{
    private FacebookEmailSender facebookEmailSender;
    
    public FacebookEmailSenderProcessor(FacebookEmailSender facebookEmailSender){
        this.facebookEmailSender = facebookEmailSender;
    }
    
    @Override
    public void sendEmail(User user){
        facebookEmailSender.sendEmailToFacebook(user.getEmail());
    }
}