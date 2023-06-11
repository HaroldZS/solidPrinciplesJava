package SRP.Ejemplo1;

public class CustomerPrinter
{
    public void printCustomerDetails(Customer customer) {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Customer Balance: $" + customer.getBalance());
    }
}