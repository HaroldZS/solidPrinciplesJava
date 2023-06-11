package SRP.Ejemplo1;

public class Customer
{
    private String name;
    private String address;
    private double balance;

    public Customer(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public String setName(){
        return this.name;
    }
    
    public String setAdress(){
        return this.address;
    }
    
    public double setBalance(){
        return this.balance;
    }
}