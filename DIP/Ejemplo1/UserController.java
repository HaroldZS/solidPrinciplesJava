package DIP.Ejemplo1;

public class UserController {
    private DatabaseProcessor databaseProcessor;

    public UserController(DatabaseProcessor databaseProcessor) {
        this.databaseProcessor = databaseProcessor;
    }

    public void createUser(String username) {
        User user = new User(username);
        this.databaseProcessor.saveUser(user);
    }
}