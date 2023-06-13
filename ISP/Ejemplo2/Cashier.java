package ISP.Ejemplo2;

public class Cashier implements RestaurantStaff {
    @Override
    public void takeOrder() {
        // ISP violation
    }

    @Override
    public void serveFood() {
        // ISP violation
    }

    @Override
    public void processPayment() {
        System.out.println("Cashier is processing the payment.");
    }

    @Override
    public void prepareFood() {
        // ISP violation
    }
}