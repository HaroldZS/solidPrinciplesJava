package ISP.Ejemplo1;

public class Whale implements Animal, MarineSkills
{
    @Override
    public void eat() {
        System.out.println("The whale is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The whale is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("The whale is moving.");
    }

    @Override
    public void makeSound() {
        System.out.println("The whale is screeching.");
    }
    
    @Override
    public void swim() {
        System.out.println("The whale is swimming.");
    }
}