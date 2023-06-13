package ISP.Ejemplo2;

public class Cook implements RestaurantStaff, CookActivities {
    @Override
    public void teamWork() {
        System.out.println("Cook is doing teamWork.");
    }
    
    @Override
    public void prepareFood() {
        System.out.println("Cook is preparing the food.");
    }
}