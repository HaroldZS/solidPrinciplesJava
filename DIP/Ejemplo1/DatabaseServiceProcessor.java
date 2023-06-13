package DIP.Ejemplo1;

public class DatabaseServiceProcessor implements DatabaseProcessor
{
    private DatabaseService databaseService;
    
    public DatabaseServiceProcessor(DatabaseService databaseService){
        this.databaseService = databaseService;
    }
    
    @Override
    public void saveUser(User user){
        this.databaseService.saveUserToDatabase(user);
    }
}