package ISP.Ejemplo1;

public class Eagle implements Animal {
    @Override
    public void eat() {
        System.out.println("The eagle is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The eagle is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("The eagle is moving.");
    }

    @Override
    public void makeSound() {
        System.out.println("The eagle is screeching.");
    }

    @Override
    public void fly() {
        System.out.println("The eagle is flying.");
    }
}