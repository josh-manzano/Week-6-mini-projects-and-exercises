package week6.Inheritance.ShoppingCartSystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();
    double tax = 21;

    public void addItem (Product product){

        items.add(product);
    }

    public void printReceipt(){
        for(Product itemInCart : items){
            System.out.println("\nItem: " + itemInCart.getName() + " | " + "Price: " + String.format("%.2f", itemInCart.getFinalPrice()));
        }
        System.out.println("\nSubtotal: $" + String.format("%.2f", totalNoTax()) + " | Tax: $" + String.format("%.2f", justTax()) + " | Final Total: $" + String.format("%.2f", totalWTax()));
    }

    public double totalNoTax(){
        double totalPrice = 0;
        for(Product itemInCart : items){
            totalPrice = totalPrice + itemInCart.getFinalPrice();
        }
        return totalPrice;
    }

    public double totalWTax(){
        return totalNoTax() * (1 + tax / 100);
    }

    public double justTax(){
        return totalWTax() - totalNoTax();
    }
}
