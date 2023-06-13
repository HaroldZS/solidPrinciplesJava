package LSP.Ejemplo2;
import java.util.ArrayList;

class Pond {
    private ArrayList<Duck> ducks;

    public Pond() {
        ducks = new ArrayList<>();
    }

    public void addDuck(Duck duck) {
        ducks.add(duck);
    }

    public void makeDucksSwim() {
        for (Duck duck : ducks) {
            duck.floatOnWater();
        }
    }
}