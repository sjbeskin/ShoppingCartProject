import java.text.NumberFormat;
import java.util.*;

public class Item {
    String name;
    double price;
    int bulkQuantity; 
    double bulkPrice; 
    
    //constructor with name and price parameters
    //bulkPrice and bulkQuantity are automatically set to equal -1
    //if the price is negative, throws an IllegalArgumentException 

    public Item(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException();
        }
        
        this.name = name;
        this.price = price; 
        this.bulkPrice = -1;
        this.bulkQuantity = -1; 
    }
    
    //constructor with name, price, bulkQuantity, and bulkPrice parameters
    //if the price, bulkQuantity, or bulkPrice is negative, throws an IllegalArgumentException
    
    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        if (price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice; 
    }

    
    //calculates the price given a certain quantity of the Item
    //calculates differently based on whether bulkQuantity or bulkPrice are negative
    //this is to account for if the first constructor with just name and price parameters was used
    
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
    
    //toString method that includes the name, the formatted price and, if the second constructor was used, bulkPrice and bulkQuantity
    
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(); 

        String finalString = name + nf.format(price);

        if (bulkPrice != -1) {
            finalString += " (" + bulkQuantity + " for " + nf.format(bulkPrice) + ")";
        }

        return finalString; 
    }

}
