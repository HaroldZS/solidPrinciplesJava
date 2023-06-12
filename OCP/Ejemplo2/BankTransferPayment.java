package OCP.Ejemplo2;

public class BankTransferPayment extends Payment
{
    @Override
    public void processPayment(){
        System.out.println("Payment was processed by bank transfer payment");
    }
}