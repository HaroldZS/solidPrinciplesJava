package ISP.Ejemplo2;

public class Waiter implements RestaurantStaff, WaiterActivities, CashierWaiterSharedActivities {
    @Override
    public void teamWork() {
        System.out.println("Waiter is doing teamWork.");
    }
    
    @Override
    public void takeOrder() {
        System.out.println("Waiter is taking the order.");
    }

    @Override
    public void serveFood() {
        System.out.println("Waiter is serving the food.");
    }

    @Override
    public void processPayment() {
        System.out.println("Waiter is processing the payment.");
    }
}