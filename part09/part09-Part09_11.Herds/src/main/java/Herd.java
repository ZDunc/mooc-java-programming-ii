import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{
    private List<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public String toString() {
        String str = "";
        for (Movable organism: herd) {
            str += organism.toString() + "\n";
        }
        return str;
    }

    public void addToHerd(Movable moveable) {
        herd.add(moveable);
    }

    public void move(int dx, int dy) {
        for (Movable organism: herd) {
            organism.move(dx, dy);
        }
    }
}
