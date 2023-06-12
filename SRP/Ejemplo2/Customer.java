package SRP.Ejemplo2;

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
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
}