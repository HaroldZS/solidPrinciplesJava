package SRP.Ejemplo2;

public class PaymentInfo
{
    private String date;
    private int paymentId;
    
    public PaymentInfo(String date, int paymentId)
    {
        this.date = date;
        this.paymentId = paymentId;
    }
    
    public String getDate(){
        return this.date;
    }
    
    public int getPaymentId(){
        return this.paymentId;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public void setPaymentId(int paymentId){
        this.paymentId = paymentId;
    }
}