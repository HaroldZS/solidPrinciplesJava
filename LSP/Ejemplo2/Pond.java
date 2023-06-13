package LSP.Ejemplo2;
import java.util.ArrayList;

class Pond {
    private ArrayList<Floatable> ducks;

    public Pond() {
        ducks = new ArrayList<>();
    }

    public void addDuck(Floatable duck) {
        ducks.add(duck);
    }

    public void makeDucksSwim() {
        for (Floatable duck : ducks) {
            duck.floatOnWater();
        }
    }
}