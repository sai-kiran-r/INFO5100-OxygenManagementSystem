/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.CustomerSales.SalesDirectory;
import Business.CustomerSales.SalesManager;
import Business.CustomerSales.SalesEmployee;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.NGO.NGODirectory;
import Business.NGO.NGOAdmin;
import Business.NGO.NGOEmployee;
import Business.Role.NGOEmployeeRole;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Role.NGOAdminRole;

import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderDirectory orderDirectory;
    private NGODirectory ngoDirectory;
    private SalesDirectory salesDirectory;
    private HospitalDirectory hospitalDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, 
                    CustomerDirectory customerDirectory, 
                     DeliveryManDirectory deliveryManDirectory) {
        System.out.println("Inside public constructuer");
        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public EcoSystem(RestaurantDirectory restaurantDirectory, 
            CustomerDirectory customerDirectory, 
            DeliveryManDirectory deliveryManDirectory, 
            OrderDirectory orderDirectory, NGODirectory ngoDirectory,
            SalesDirectory salesDirectory, HospitalDirectory hospitalDirectory) {
        System.out.println("Inside public constructuer");
        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderDirectory = orderDirectory;
        this.ngoDirectory = ngoDirectory;
        this.salesDirectory = salesDirectory;
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public EcoSystem(){
        super("Restaurant Delivery");
        this.customerDirectory = new CustomerDirectory();
        this.restaurantDirectory = new RestaurantDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
        this.orderDirectory = new OrderDirectory();
        this.ngoDirectory = new NGODirectory();
        this.salesDirectory = new SalesDirectory();
        this.hospitalDirectory = new HospitalDirectory();
       // networkList=new ArrayList<Network>();
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        roleList.add(new CustomerRole());
        roleList.add(new AdminRole());
        roleList.add(new DeliverManRole());
        roleList.add(new NGOAdminRole());
        roleList.add(new NGOEmployeeRole());
        return roleList;
    }
    

    
    public boolean checkIfUserIsUnique(String userName){
       UserAccountDirectory usersList = business.getUserAccountDirectory();
        ArrayList<UserAccount> userAccounts = usersList.getUserAccountList();
        
        for(UserAccount ua : userAccounts)
        {
            if(ua.getUsername().equals(userName))
                return false;
        }
        
       return true;
    }
    
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public DeliveryManDirectory getDeliveryManDirectory(){
        return deliveryManDirectory;
    }
    
    public RestaurantDirectory getRestaurantDirectory(){
        return restaurantDirectory;
    }
    
    public void setRestaurantDirectory(ArrayList<Restaurant> rsList){
        restaurantDirectory.setRestaurantDirectory(rsList);
    }
    
    public NGODirectory getNGODirectory(){
        return ngoDirectory;
    }
    
    public void setNGODirectory(ArrayList<NGOAdmin> adminList,
                        ArrayList<NGOEmployee> employeeList){
        ngoDirectory.setAdminDetails(adminList);
        ngoDirectory.setEmployeeDetails(employeeList);
    }
    
    public HospitalDirectory getHospitalDirectory(){
        return this.hospitalDirectory;
    }
    
    public void setHospitalDirectory(ArrayList<Hospital> hospitalList){
        this.hospitalDirectory = new HospitalDirectory(hospitalList);
    }
    
    public SalesDirectory getSalesDirectory(){
        return salesDirectory;
    }
    
    public void setSalesDirectory(ArrayList<SalesManager> managerList,
                            ArrayList<SalesEmployee> employeeList){
        this.salesDirectory.setManagerDetails(managerList);
        this.salesDirectory.setEmployeeDetails(employeeList);
    }
    
    public OrderDirectory getOrderDirectory(){
        return this.orderDirectory;
    }
    
    public int getLastOrderId(){
        int maxOrderId = 0;
        for(Order o : this.orderDirectory.getOrderDirectory()){
            if(o.getOrderId() > maxOrderId){
               maxOrderId = o.getOrderId();
            }
        }
        return maxOrderId;
    }
    
}
