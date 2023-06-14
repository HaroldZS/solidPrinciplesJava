package DIP.Ejemplo2;

public class UserController {
    private EmailSender emailSender;

    public UserController() {
        this.emailSender = new EmailSender();
    }

    public void createUser(String username) {
        User user = new User(username);
        emailSender.sendEmail(user.getEmail(), "Welcome to our platform!");
    }
}