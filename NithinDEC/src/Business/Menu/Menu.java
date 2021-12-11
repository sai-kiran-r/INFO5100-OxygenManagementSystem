/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class Menu {
    
    private ArrayList<Item> itemList;
    
    public Menu() {
        itemList = new ArrayList();
    }

    public ArrayList<Item> getMenu() {
        return itemList;
    }

    public void setMenu(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    
    public void addNewItem(String itemName, double price, String res,
                                int quantity) {
        Item newItem = new Item(itemName, price, res, quantity);
        itemList.add(newItem);
    }
    
    public void removeItem(Item item) {
        itemList.remove(item);
    }
}
