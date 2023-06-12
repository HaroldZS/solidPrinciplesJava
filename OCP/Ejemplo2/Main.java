package OCP.Ejemplo2;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){
        ArrayList<Payment> payments = new ArrayList<Payment>();
        Payment creditCard = new Payment("CreditCard");
        Payment bankTransfer = new Payment("BankTransfer");
        
        payments.add(creditCard);
        payments.add(bankTransfer);
        
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        
        for(int i=0; i<payments.size(); i++){
            paymentProcessor.processPayment(payments.get(i));
        }
    }
}