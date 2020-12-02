import java.util.*;

public class Item {
    String name;
    double price;
    int bulkQuantity; 
    double bulkPrice; 

    public Item(String name, int price) {
        this.name = name;
        this.price = price; 
        this.bulkPrice = -1;
        this.bulkQuantity = -1; 
    }

    public Item(String name, int price, int bulkQuantity, int bulkPrice) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice; 
    }

    public double priceFor(int quantity) {
        int numBulkQuantities = (quantity / bulkQuantity); 

        int numExcess = quantity % bulkQuantity;

        double finalPrice = (numBulkQuantities * bulkQuantity) + (numExcess * price);

        if (finalPrice < 0) {
            throw new IllegalArgumentException(); 
        } else {
            return finalPrice; 
        }


    }

    public String toString() {
        String finalString = name + ", $" + price;

        if (bulkPrice != -1) {
            finalString += " (" + bulkQuantity + " for " + "$" + bulkPrice + ")";
        }

        return finalString; 
    }

}