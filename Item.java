import java.text.NumberFormat;
import java.util.*;

public class Item {
    String name;
    double price;
    int bulkQuantity; 
    double bulkPrice; 

    public Item(String name, double price) {
        this.name = name;
        this.price = price; 
        this.bulkPrice = -1;
        this.bulkQuantity = -1; 

        if (price < 0) {
            throw new IllegalArgumentException();
        }
    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice; 

        if (price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
            throw new IllegalArgumentException();
        }
    }

    public double priceFor(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException();
        }

        if (bulkQuantity < 0 || bulkPrice < 0) {
            return price * quantity; 
        } else { 
            int numBulkQuantities = (quantity / bulkQuantity); 
            int numExcess = quantity % bulkQuantity;
            return (numBulkQuantities * bulkPrice) + (numExcess * price);
        }

    }

    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(); 

        String finalString = name + nf.format(price);

        if (bulkPrice != -1) {
            finalString += " (" + bulkQuantity + " for " + nf.format(bulkPrice) + ")";
        }

        return finalString; 
    }

}