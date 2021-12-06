package Business;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.CustomerSales.SalesManager;
import Business.CustomerSales.SalesEmployee;
import Business.Hospital.Hospital;
import Business.Menu.Item;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.NGO.NGOAdmin;
import Business.NGO.NGOEmployee;
import Business.Role.HospitalOperationsAdminRole;
import Business.Role.NGOAdminRole;
import Business.Role.NGOEmployeeRole;
import Business.Role.SalesEmployeeRole;
import Business.Role.SalesManagerRole;
import Business.Hospital.HospitalAdmin;
import Business.Hospital.HospitalEmployee;
import Business.Role.HospitalAdminRole;
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
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Sysadmin");   
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee customer = system.getEmployeeDirectory().createEmployee("Customer");
        UserAccount customerAccount = system.getUserAccountDirectory().createUserAccount("customer", "customer", customer, new CustomerRole());
        Customer cus = new Customer(customerAccount);
        cus.setAddress("Bankadsda snjadksd adsnk");
        cus.setPhoneNumber(9232132123L);
        system.getCustomerDirectory().addCustomer(cus);

        Employee ngoAdmin = system.getEmployeeDirectory().createEmployee("NGOAdmin");
        UserAccount ngoAccount = system.getUserAccountDirectory().createUserAccount("ngoadmin", "ngoadmin", ngoAdmin, new NGOAdminRole());
        NGOAdmin ngoAd = new NGOAdmin(ngoAccount);
        system.getNGODirectory().addAdmin(ngoAd);
              
        Employee ngoEmployee = system.getEmployeeDirectory().createEmployee("NGOEmployee");
        UserAccount ngoEmpAccount = system.getUserAccountDirectory().createUserAccount("ngoemployee", "ngoemployee", ngoEmployee, new NGOAdminRole());
        NGOEmployee ngoEmpAcc = new NGOEmployee(ngoEmpAccount);
        system.getNGODirectory().addEmployee(ngoEmpAcc);
        
        Employee SalesManagerEmployee = system.getEmployeeDirectory().createEmployee("SalesManager");
        UserAccount SalesManAccount = system.getUserAccountDirectory().createUserAccount("salesmanager", "salesmanager", SalesManagerEmployee, new SalesManagerRole());
        SalesManager salesManAcc = new SalesManager(SalesManAccount);
        system.getSalesDirectory().addManager(salesManAcc);
        
        Employee SalesEmployee = system.getEmployeeDirectory().createEmployee("SalesEmployee");
        UserAccount SalesEmpAccount = system.getUserAccountDirectory().createUserAccount("salesemp", "salesemp", SalesEmployee, new SalesEmployeeRole());
        SalesEmployee salesEmpAcc = new SalesEmployee(SalesEmpAccount);
        system.getSalesDirectory().addEmployee(salesEmpAcc);
        
        // Hospital System
        Employee hospitalEmployee = system.getEmployeeDirectory().createEmployee("HospitalEmployee");
        UserAccount HospitalEmpAccount = system.getUserAccountDirectory().createUserAccount("hospitalemp", "hospitalemp", hospitalEmployee, new HospitalOperationsAdminRole());
        HospitalEmployee hospitalEmpAcc = new HospitalEmployee(HospitalEmpAccount);
        
        Employee hospitalAdmin = system.getEmployeeDirectory().createEmployee("HospitalAdmin");
        UserAccount HospitalAdminAccount = system.getUserAccountDirectory().createUserAccount("hospitaladmin", "hospitaladmin", hospitalAdmin, new HospitalAdminRole());
        HospitalAdmin hospitalAdminAcc = new HospitalAdmin(HospitalAdminAccount);
        
        Hospital hoc = new Hospital("BlueCross", "Alphabasnd Street");
        hoc.setHospitalAdmin(hospitalAdminAcc);
        hoc.setHospitalEmployee(hospitalEmpAcc);    
        system.getHospitalDirectory().addHospital(hoc);

        
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
