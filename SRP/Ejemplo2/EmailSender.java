package SRP.Ejemplo2;

public class EmailSender
{
    public void sendConfirmationEmail(Customer customer) {
        System.out.println("Email sent to customer: "+customer.getName());
    }
}