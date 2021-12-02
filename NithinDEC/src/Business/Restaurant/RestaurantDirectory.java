/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class RestaurantDirectory {
     private ArrayList<Restaurant> restaurantDirectory;
    
    public RestaurantDirectory() {
        restaurantDirectory = new ArrayList();
    }

    public ArrayList<Restaurant> returnAllRestaurants() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant newRestaurant(String name, String address, String mName, int phoneNumber) {
        Restaurant restaurant = new Restaurant(name, address, mName, phoneNumber);
        restaurantDirectory.add(restaurant);
        System.out.println(restaurantDirectory.size() + "New Res");
        return restaurant;
    }
    
    public void removeRestaurant(Restaurant restaurant){
        restaurantDirectory.remove(restaurant);
    }
    
    public Restaurant getRestaurant(String name) {
        for(Restaurant r : restaurantDirectory) {
            if(r.getRestaurantName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public void setRestaurant(int index, Restaurant res) {
        this.restaurantDirectory.set(index, res);
    }
    
    
    public Restaurant getRestaurant(UserAccount ua){
        for(Restaurant r : restaurantDirectory) {
            if(r.returnUserAcc().getUsername().equals(ua.getUsername())) {
                return r;
            }
        }
        return null;
    }
    
    public void addRestaurant(Restaurant rs){
        restaurantDirectory.add(rs);
    }
    
    
}
