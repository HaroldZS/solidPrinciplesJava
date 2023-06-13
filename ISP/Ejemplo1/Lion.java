package ISP.Ejemplo1;

public class Lion implements Animal, TerrestrialSkills {
    @Override
    public void eat() {
        System.out.println("The lion is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The lion is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("The lion is moving.");
    }

    @Override
    public void makeSound() {
        System.out.println("The lion is roaring.");
    }
    
    @Override
    public void walk() {
        System.out.println("The lion is walking.");
    }
}