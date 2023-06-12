package SRP.Ejemplo2;

public class PaymentProcessor
{
    public void processPayment(PaymentInfo paymentInfo) {
        System.out.println("The payment "+paymentInfo.getPaymentId()+" is being processed on "+paymentInfo.getDate());
    }
}