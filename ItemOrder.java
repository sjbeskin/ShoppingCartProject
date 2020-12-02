/**
 * ItemOrder
 */
public class ItemOrder {
    private Item myItem;
    private int quantity;
    public ItemOrder(Item myItem, int quantity) {
        this.myItem = myItem;
        this.quantity = quantity;
    }
    public double getPrice() {
        return myItem.priceFor(quantity);
    }
    public Item getItem() {
        return myItem;
    }
}