package DIP.Ejemplo1;

public class User
{
    private String username;
    private String password;
    
    public User(String username)
    {
        this.username = username;
        this.password = "Secret";
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
}