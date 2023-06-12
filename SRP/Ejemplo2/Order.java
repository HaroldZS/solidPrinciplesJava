package SRP.Ejemplo2;
import java.util.ArrayList;
public class Order
{
    private ArrayList<Item> items;
    private Customer customer;

    public Order(ArrayList<Item> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void processPayment(PaymentInfo paymentInfo) {
        System.out.println("The payment "+paymentInfo.getPaymentId()+" is being processed on "+paymentInfo.getDate());
    }

    public void sendConfirmationEmail() {
        System.out.println("Email sent to customer: "+this.customer.getName());
    }

    public void generateInvoice() {
        System.out.print("Invoice generated to customer: "+this.customer.getName());
    }
    
    public ArrayList<Item> getItems(){
        return this.items;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
    
    public void setItems(Customer customer){
        this.customer = customer;
    }
}