package OCP.Ejemplo2;

public class PaymentProcessor {
    public void processPayment(Payment payment) {
        if (payment.getType().equals("CreditCard")) {
            processCreditCardPayment(payment);
        } else if (payment.getType().equals("BankTransfer")) {
            processBankTransferPayment(payment);
        }
    }
    
    private void processCreditCardPayment(Payment payment) {
        System.out.println("Payment was processed by credit card");
    }
    
    private void processBankTransferPayment(Payment payment) {
        System.out.println("Payment was processed by bank transfer payment");
    }
}