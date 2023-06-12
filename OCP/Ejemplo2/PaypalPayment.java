package OCP.Ejemplo2;

public class PaypalPayment extends Payment
{
    @Override
    public void processPayment(){
        System.out.println("Payment was processed by Paypal");
    }
}