public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity() {
        qty++;
    }

    public String toString() {
        return product + ": " + qty;
    }

    public boolean equals(Item i) {
        if (this.product == i.product && this.unitPrice == i.unitPrice)
            return true;
        return false;
    }

    public int hashCode() {
        return product.hashCode();
    }
}
