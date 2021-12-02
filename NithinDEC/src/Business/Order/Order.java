/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Menu.Item;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Nithin Bharadwaj
 */
public class Order extends WorkRequest {
   
    private static AtomicInteger atomicInteger = new AtomicInteger(100002);
    private int orderId;
    private String orderStatus;
    private Restaurant restaurant;
    private Customer customer;
    private String deliveryMan;
    private int quantity;
    private Item item;
    private String result;
    private boolean assign;

    public Order(){
        super();
        this.orderId = atomicInteger.getAndIncrement();
    }
    
    public boolean isAssign() {
        return assign;
    }

    public void setAssign(boolean assign) {
        this.assign = assign;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    

    @Override
    public String toString() {
        return String.valueOf(orderId);
    }
    
}
