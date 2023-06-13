package DIP.Ejemplo1;

public class DatabaseService {
    public void saveUserToDatabase(User user) {
        System.out.println("User: "+user.getUsername()+" saved by Database");
    }
}