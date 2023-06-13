package LSP.Ejemplo2;

public class Main {
    public static void main(String[] args) {
        Pond pond = new Pond();
        
        Duck duck = new Duck();
        MetalDuck metalDuck = new MetalDuck();
        
        pond.addDuck(duck);
        pond.addDuck(metalDuck);

        pond.makeDucksSwim();
    }
}