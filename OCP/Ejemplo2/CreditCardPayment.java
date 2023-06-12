package OCP.Ejemplo2;

public class CreditCardPayment extends Payment
{
    @Override
    public void processPayment(){
        System.out.println("Payment was processed by credit card");
    }
}