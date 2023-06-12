package SRP.Ejemplo2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sofia","123 Main St",1000.0);
        ArrayList<Item> items = new ArrayList<Item>();
        
        
        Item item1 = new Item("Naranja",7);
        Item item2 = new Item("Pera",8);
        Item item3 = new Item("Manzana",10);
        
        items.add(item1);
        items.add(item2);
        items.add(item3);
        
        Order order = new Order(items, customer);
        PaymentInfo paymentInfo = new PaymentInfo("11/06/23",61612298);
        
        order.processPayment(paymentInfo);
        order.sendConfirmationEmail();
        order.generateInvoice();
    }
}