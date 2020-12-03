/**
 * ItemOrder
 */
public class ItemOrder {
    private Item myItem;
    private int quantity;
    
    
    //constructor with parameters for a given Item and quantity
    public ItemOrder(Item myItem, int quantity) {
        this.myItem = myItem;
        this.quantity = quantity;
    }
    
    //returns the price for the given Item
    public double getPrice() {
        return myItem.priceFor(quantity);
    }
    
    //returns the given Item
    public Item getItem() {
        return myItem;
    }
}
