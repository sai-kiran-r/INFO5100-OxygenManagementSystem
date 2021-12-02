/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class CustomerDirectory {
    
    ArrayList<Customer> cd;
    
    public CustomerDirectory(){
        cd = new ArrayList<Customer>();
    }
    
    public void addCustomer(Customer c){
        cd.add(c);
    }
    
    public void deleteCustomer(Customer c){
        cd.remove(c);
    }
    
    public ArrayList<Customer> returnCustomerDetails(){
        return cd;
    }
    
    public Customer getCustomer(String name){
        for(Customer customer: cd){
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
    
    public void setCustomerDetails(ArrayList<Customer> cusList){
        cd = cusList;
    }
    
}
