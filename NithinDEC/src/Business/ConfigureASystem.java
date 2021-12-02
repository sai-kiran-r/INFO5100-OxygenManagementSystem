package Business;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Menu.Item;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");   
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee customer = system.getEmployeeDirectory().createEmployee("Customer");
        UserAccount customerAccount = system.getUserAccountDirectory().createUserAccount("customer", "customer", customer, new CustomerRole());
        Customer cus = new Customer(customerAccount);
        cus.setAddress("Bankadsda snjadksd adsnk");
        cus.setPhoneNumber(9232132123L);
        system.getCustomerDirectory().addCustomer(cus);
        
        Employee delivery = system.getEmployeeDirectory().createEmployee("Delivery");
        UserAccount deliveryAccount = system.getUserAccountDirectory().createUserAccount("delivery", "delivery", delivery, new DeliverManRole());
        DeliveryMan deliveryAgent = new DeliveryMan(deliveryAccount);
        deliveryAgent.setAddress("asdasd aasd nasdnkj");
        deliveryAgent.setPhoneNumber(9321322193L);
        deliveryAgent.setStatus("Available");
        system.getDeliveryManDirectory().addDeliveryAgent(deliveryAgent);
        
        Employee restaurant = system.getEmployeeDirectory().createEmployee("Restaurant");
        UserAccount restaurantAccount = system.getUserAccountDirectory().createUserAccount("restaurant", "restaurant", restaurant, new AdminRole());
        
        Restaurant restaurantData = new Restaurant("Buakra", "Alpasdj St","Borak",
                                  9000999099L, restaurantAccount);
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("Burrito", 9.90, "Buakra"));
        Menu menuItems = new Menu();
        menuItems.setMenu(itemList);
        restaurantData.setMenu(menuItems);
        system.getRestaurantDirectory().addRestaurant(restaurantData);
        
        return system;
    }
    
}
