public class OneItemBox extends Box{
    private Item myItem;

    public OneItemBox() {
        myItem = new Item("", 0);
    }

    public void add(Item item) {
        if (myItem.getName() == "") {
            this.myItem = item;
        }
    }

    public boolean isInBox(Item item) {
        if (this.myItem.equals(item))
            return true;
        else
            return false;
    }
}
