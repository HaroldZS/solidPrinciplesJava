package DIP.Ejemplo1;

public class Main
{
    public static void main(){
        DatabaseService databaseService = new DatabaseService();
        PostgresqlDatabaseService postgresqlDS = new PostgresqlDatabaseService();
        
        DatabaseServiceProcessor databaseServiceProcessor = new DatabaseServiceProcessor(databaseService);
        PostgresqlDatabaseServiceProcessor postgresqlDSP = new PostgresqlDatabaseServiceProcessor(postgresqlDS);
        
        UserController userController = new UserController(databaseServiceProcessor);
        UserController postgresqlUserController = new UserController(postgresqlDSP);
        
        userController.createUser("Harold");
        postgresqlUserController.createUser("Harold");
    }
}