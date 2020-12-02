import java.util.*;
/**
 * ShoppingCart
 */
public class ShoppingCart {
    private ArrayList<ItemOrder> itemOrders;
    private boolean discount;
    public ShoppingCart(){
        itemOrders = new ArrayList<ItemOrder>();
    }
    public void add(ItemOrder newItemOrder) {
        for (int i = 0; i < itemOrders.size(); i++) {
            Item item = itemOrders.get(i).getItem();
            if (item.toString().equals(item.toString())) {
                itemOrders.set(i, newItemOrder);
                return;
            }
        }
        itemOrders.add(newItemOrder);
    }
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
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
