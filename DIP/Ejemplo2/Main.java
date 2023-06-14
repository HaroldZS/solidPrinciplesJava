package DIP.Ejemplo2;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        FacebookEmailSender fbEmailSender = new FacebookEmailSender();
        
        EmailSenderProcessor emailSenderProcessor = new EmailSenderProcessor(emailSender);
        FacebookEmailSenderProcessor fbEmailSenderProcessor = new FacebookEmailSenderProcessor(fbEmailSender);
        
        UserController userController = new UserController(emailSenderProcessor);
        UserController fbUserController = new UserController(fbEmailSenderProcessor);
        
        userController.createUser("John");
        fbUserController.createUser("Harold");
    }
}