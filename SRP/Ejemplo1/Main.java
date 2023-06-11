package SRP.Ejemplo1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "123 Main St", 1000.0);
        
        CustomerPrinter customerPrinter = new CustomerPrinter();
        CustomerDatabase customerDatabase = new CustomerDatabase();
        CustomerEmailSender customerEmailSender = new CustomerEmailSender();
        
        customerPrinter.printCustomerDetails(customer);
        customerDatabase.saveCustomerToDatabase(customer);
        customerEmailSender.sendEmailToCustomer(customer);
    }
}