package ISP.Ejemplo1;

public class Main
{
    public static void main(String[] args){
        Lion lion = new Lion();
        Eagle eagle = new Eagle();
        Whale whale = new Whale();
        
        lion.makeSound();
        eagle.makeSound();
        whale.makeSound();
        
        lion.walk();
        eagle.fly();
        whale.swim();
    }
}