import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        items = new ArrayList<>();
    }

    public void add(Item item) {
        int sum = 0;
        for (Item x: items) {
            sum += x.getWeight();
        }

        int itemWeight = item.getWeight();
        if (itemWeight + sum <= maxWeight) {
            items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        for (Item i: items) {
            if (i.equals(item))
                return true;
        }
        return false;
    }
}
