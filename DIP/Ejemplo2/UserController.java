package DIP.Ejemplo2;

public class UserController {
    private EmailProcessor emailProcessor;

    public UserController(EmailProcessor emailProcessor) {
        this.emailProcessor = emailProcessor;
    }

    public void createUser(String username) {
        User user = new User(username);
        emailProcessor.sendEmail(user);
    }
}