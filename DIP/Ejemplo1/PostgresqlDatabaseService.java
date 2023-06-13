package DIP.Ejemplo1;

public class PostgresqlDatabaseService
{
    public void saveUserToPostgresqlDatabase(User user) {
        System.out.println("User: "+user.getUsername()+" saved by PostgreSQL Database");
    }
}