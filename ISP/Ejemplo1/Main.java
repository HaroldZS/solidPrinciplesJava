package ISP.Ejemplo1;

public class Main
{
    public static void main(String[] args){
        Lion lion = new Lion();
        Eagle eagle = new Eagle();
        
        lion.makeSound();
        eagle.makeSound();
        
        lion.fly();
        eagle.fly();
    }
}