
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Item i) {
        if (i.getName() == this.name)
            return true;
        return false;
    }

    public int hashCode() {
        int hash = 7;
        return 31 * hash * this.name.hashCode();
    }
}
