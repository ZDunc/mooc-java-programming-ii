import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productCounts;

    public Warehouse() {
        productPrices = new HashMap<>();
        productCounts = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productCounts.put(product, stock);
    }

    public int price(String product) {
        Integer price = productPrices.get(product);

        if (price == null)
            return -99;
        return price;
    }

    public int stock(String product) {
        Integer stock = productCounts.get(product);

        if (stock == null)
            return 0;
        return stock;
    }

    public boolean take(String product) {

        Integer stock = productCounts.get(product);

        if (stock == null || stock < 1)
            return false;
        
        stock--;
        productCounts.put(product, stock);
        return true;
    }

    public Set<String> products() {
        Set<String> products = new HashSet<>();

        for (String key: productPrices.keySet()) {
            products.add(key);
        }
        return products;
    }
}
