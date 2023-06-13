package ISP.Ejemplo2;

public class Cook implements RestaurantStaff {
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
        // ISP violation
    }
    
    @Override
    public void prepareFood() {
        System.out.println("Cook is preparing the food.");
    }
}