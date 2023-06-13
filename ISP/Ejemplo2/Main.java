package ISP.Ejemplo2;

public class Main
{
    public static void main(String[] args){
        Cashier cashier = new Cashier();
        Waiter waiter = new Waiter();
        Cook cook = new Cook();
        
        cashier.processPayment();
        waiter.takeOrder();
        waiter.serveFood();
        waiter.processPayment();
        cook.prepareFood();
        
        cashier.prepareFood();
        waiter.prepareFood();
        cook.processPayment();
    }
}