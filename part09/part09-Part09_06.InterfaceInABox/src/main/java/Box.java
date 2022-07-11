import java.util.ArrayList;

public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> contents;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        contents = new ArrayList<>();
    }

    public void add(Packable content) {
        if (this.weight() + content.weight() <= maxCapacity) {
            contents.add(content);
        }
    }

    public double weight() {
        double weight = 0;

        for (Packable content: contents) {
            weight += content.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + contents.size() + " items, total weight " + this.weight() + " kg";
    }
}
