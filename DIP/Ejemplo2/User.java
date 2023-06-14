package DIP.Ejemplo2;

public class User {
    private String username;
    private String email;

    public User(String username) {
        this.username = username;
        this.email = generateEmail(username);
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    private String generateEmail(String username) {
        return username + "@example.com";
    }
}