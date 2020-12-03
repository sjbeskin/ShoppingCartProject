import java.util.*;
/**
 * ShoppingCart
 */
public class ShoppingCart {
    private ArrayList<ItemOrder> itemOrders;
    private boolean discount;
    
    //constructor that creates a new arraylist of ItemOrders
    public ShoppingCart(){
        itemOrders = new ArrayList<ItemOrder>();
    }
    
    //add a new ItemOrder to the shopping cart
    //if the attempted ItemOrder's Item is already in the cart, replaces the current ItemOrder with the new one
    public void add(ItemOrder newItemOrder) {
        for (int i = 0; i < itemOrders.size(); i++) {
            Item item = itemOrders.get(i).getItem();
            if (item.toString().equals(newItemOrder.getItem().toString())) {
                itemOrders.set(i, newItemOrder);
                return;
            }
        }
        itemOrders.add(newItemOrder);
    }
    
    //set the current discount
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
    
    //returns the total price of the items
    //reduces total by 10% if the discount applies
    public double getTotal() {
        double total = 0;
        for (ItemOrder itemOrder : itemOrders) {
            total += itemOrder.getPrice();
        }
        if (discount) {
            total = total * 0.9;
        }
        return total;
    }
}
