package OCP.Ejemplo2;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args){
        ArrayList<Payment> payments = new ArrayList<Payment>();
        CreditCardPayment creditCard = new CreditCardPayment();
        BankTransferPayment bankTransfer = new BankTransferPayment();
        PaypalPayment paypal = new PaypalPayment();
        
        payments.add(creditCard);
        payments.add(bankTransfer);
        payments.add(paypal);
        
        for(int i=0; i<payments.size(); i++){
            payments.get(i).processPayment();
        }
    }
}