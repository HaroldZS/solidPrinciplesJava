package DIP.Ejemplo1;

public class PostgresqlDatabaseServiceProcessor implements DatabaseProcessor
{
    private PostgresqlDatabaseService postgresqlDatabaseService;
    
    public PostgresqlDatabaseServiceProcessor(PostgresqlDatabaseService postgresqlDatabaseService){
        this.postgresqlDatabaseService = postgresqlDatabaseService;
    }
    
    @Override
    public void saveUser(User user){
        this.postgresqlDatabaseService.saveUserToPostgresqlDatabase(user);
    }
}