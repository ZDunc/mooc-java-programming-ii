import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item toBuy = cart.get(product);

        if (toBuy == null)
            cart.put(product, new Item(product, 1, price));
        else
            toBuy.increaseQuantity();
    }

    public int price() {
        int total = 0;

        for (Item i: cart.values()) {
            total += i.price();
        }
        return total;
    }

    public void print() {
        for (Item i: cart.values())
            System.out.println(i.toString());
    }
}