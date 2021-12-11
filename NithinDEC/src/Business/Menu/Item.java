/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author Nithin Bharadwaj
 */
public class Item {
    
    private String itemName;
    private double price;
    private String restaurantName;
    private int quantity;

    public Item(String itemName, double price, 
            String restaurantName, int quantityAvailable) {
        this.itemName = itemName;
        this.price = price;
        this.restaurantName = restaurantName;
        this.quantity = quantityAvailable;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    @Override
    public String toString() {
        return itemName;
    }
    

    
}
