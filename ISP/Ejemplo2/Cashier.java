package ISP.Ejemplo2;

public class Cashier implements RestaurantStaff, CashierActivities, CashierWaiterSharedActivities {
    @Override
    public void teamWork() {
        System.out.println("Cashier is doing teamWork.");
    }

    @Override
    public void processPayment() {
        System.out.println("Cashier is processing the payment.");
    }
    
    @Override
    public void generateReceipt() {
        System.out.println("Cashier is generating the receipt.");
    }
}