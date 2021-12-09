package Business;

import Business.AviationOrg.AviationOrg;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.CustomerSales.SalesManager;
import Business.CustomerSales.SalesEmployee;
import Business.Hospital.Hospital;
import Business.Menu.Item;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.PharmaOrg.PharmaOrgEmployee;
import Business.PharmaOrg.PharmaOrgAdmin;
import Business.PharmaOrg.PharmaOrg;
import Business.AviationOrg.AviationOrgAdmin;
import Business.AviationOrg.AviationOrgEmployee;
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
import Business.Role.AviationOrgEmployeeRole;
import Business.Role.AviationOrgManagerRole;
import Business.Role.DefenseOrgEmployeeRole;
import Business.Role.HospitalAdminRole;
import Business.Role.PharmaEmployeeRole;
import Business.Role.PharmaManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.DefenseOrg.DefenseOrg;
import Business.DefenseOrg.DefenseOrgAdmin;
import Business.DefenseOrg.DefenseOrgDirectory;
import Business.DefenseOrg.DefenseOrgEmployee;
import Business.ScubaOrg.ScubaOrgEmployee;
import Business.ScubaOrg.ScubaOrgAdmin;
import Business.ScubaOrg.ScubaOrgDirectory;
import Business.Role.DefenseOrgManagerRole;
import Business.Role.ScubaOrgEmployeeRole;
import Business.Role.ScubaOrgManagerRole;
import Business.Role.WaterPlantEmployeeRole;
import Business.Role.WaterPlantManagerRole;
import Business.ScubaOrg.ScubaOrg;
import Business.WaterDepartment.WaterTreatmentOrg;
import Business.WaterDepartment.WaterTreatmentOrgAdmin;
import Business.WaterDepartment.WaterTreatmentOrgEmployee;
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
        
        // Pharma System
        
        Employee pharmaEmployee = system.getEmployeeDirectory().createEmployee("PharmaEmployee");
        UserAccount PharmaEmpAccount = system.getUserAccountDirectory().createUserAccount("pharmaemp", "pharmaemp", pharmaEmployee, new PharmaEmployeeRole());
        PharmaOrgEmployee pharmaEmpAcc = new PharmaOrgEmployee(PharmaEmpAccount);
        
        Employee pharmaAdmin = system.getEmployeeDirectory().createEmployee("PharmaAdmin");
        UserAccount pharmaAdminAccount = system.getUserAccountDirectory().createUserAccount("pharmaadmin", "pharmaadmin", pharmaAdmin, new PharmaManagerRole());
        PharmaOrgAdmin pharmaAdminAcc = new PharmaOrgAdmin(pharmaAdminAccount);
        
        PharmaOrg pharmaOrg = new PharmaOrg("Pfizer", "Roxbury Street");
        pharmaOrg.setBusinessAdmin(pharmaAdminAcc);
        pharmaOrg.setBusinessEmployee(pharmaEmpAcc);    
        system.getPharmaDirectory().addBusiness(pharmaOrg);
        
        Employee aviationEmployee = system.getEmployeeDirectory().createEmployee("AviationEmployee");
        UserAccount AviationEmpAccount = system.getUserAccountDirectory().createUserAccount("aviationemp", "aviationemp", aviationEmployee, new AviationOrgEmployeeRole());
        AviationOrgEmployee aviationEmpAcc = new AviationOrgEmployee(AviationEmpAccount);
        
        Employee aviationAdmin = system.getEmployeeDirectory().createEmployee("AviationAdmin");
        UserAccount aviationAdminAccount = system.getUserAccountDirectory().createUserAccount("aviationadmin", "aviationadmin", aviationAdmin, new AviationOrgManagerRole());
        AviationOrgAdmin aviationAdminAcc = new AviationOrgAdmin(aviationAdminAccount);
        
        AviationOrg aviationOrg = new AviationOrg("Boieng", "123, Huntington Avenue, Quincy");
        aviationOrg.setBusinessAdmin(aviationAdminAcc);
        aviationOrg.setBusinessEmployee(aviationEmpAcc);    
        system.getAviationDirectory().addBusiness(aviationOrg);
        
        Employee defenseEmployee = system.getEmployeeDirectory().createEmployee("DefenseEmployee");
        UserAccount defenseEmpAccount = system.getUserAccountDirectory().createUserAccount("defenseemp", "defenseemp", defenseEmployee, new DefenseOrgEmployeeRole());
        DefenseOrgEmployee defenseEmpAcc = new DefenseOrgEmployee(defenseEmpAccount);
        
        Employee defenseAdmin = system.getEmployeeDirectory().createEmployee("DefenseAdmin");
        UserAccount defenseAdminAccount = system.getUserAccountDirectory().createUserAccount("defenseadmin", "defenseadmin", defenseAdmin, new DefenseOrgManagerRole());
        DefenseOrgAdmin defenseAdminAcc = new DefenseOrgAdmin(defenseAdminAccount);
        
        DefenseOrg defenseOrg = new DefenseOrg("Rayethon", "235, Super park Avenue, Waltham");
        defenseOrg.setBusinessAdmin(defenseAdminAcc);
        defenseOrg.setBusinessEmployee(defenseEmpAcc);    
        system.getDefenseDirectory().addBusiness(defenseOrg);
        
        
        Employee scubaEmployee = system.getEmployeeDirectory().createEmployee("ScubaEmployee");
        UserAccount scubaEmpAccount = system.getUserAccountDirectory().createUserAccount("scubaemp", "scubaemp", scubaEmployee, new ScubaOrgEmployeeRole());
        ScubaOrgEmployee scubaEmpAcc = new ScubaOrgEmployee(scubaEmpAccount);
        
        Employee scubaAdmin = system.getEmployeeDirectory().createEmployee("ScubaAdmin");
        UserAccount scubaAdminAccount = system.getUserAccountDirectory().createUserAccount("scubaadmin", "scubaadmin", scubaAdmin, new ScubaOrgManagerRole());
        ScubaOrgAdmin scubaAdminAcc = new ScubaOrgAdmin(scubaAdminAccount);
        
        ScubaOrg scubaOrg = new ScubaOrg("National Association of Underwater Instructors", "long beach, CA");
        scubaOrg.setBusinessAdmin(scubaAdminAcc);
        scubaOrg.setBusinessEmployee(scubaEmpAcc);    
        system.getScubaOrgDirectory().addBusiness(scubaOrg);
        
        Employee waterTreatmentEmployee = system.getEmployeeDirectory().createEmployee("WaterTreatmentEmployee");
        UserAccount waterTreatmentEmpAccount = system.getUserAccountDirectory().createUserAccount("treatmentplantemp", "treatmentplantemp", waterTreatmentEmployee, new WaterPlantEmployeeRole());
        WaterTreatmentOrgEmployee treatmentEmpAcc = new WaterTreatmentOrgEmployee(waterTreatmentEmpAccount);
        
        Employee treatmentPlantAdmin = system.getEmployeeDirectory().createEmployee("treatmentPlantAdmin");
        UserAccount treatmentPlantAdminAccount = system.getUserAccountDirectory().createUserAccount("treatmentplantadmin", "treatmentplantadmin", treatmentPlantAdmin, new WaterPlantManagerRole());
        WaterTreatmentOrgAdmin treatmentPlantAdminAcc = new WaterTreatmentOrgAdmin(treatmentPlantAdminAccount);
        
        WaterTreatmentOrg treatmentPlantOrg = new WaterTreatmentOrg("American Water Association", "213, St Peters road,Rochester,New York");
        treatmentPlantOrg.setBusinessAdmin(treatmentPlantAdminAcc);
        treatmentPlantOrg.setBusinessEmployee(treatmentEmpAcc);    
        system.getWaterTreatementirectory().addBusiness(treatmentPlantOrg);
        
        
        
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
        itemList.add(new Item("Themrmo Oxygen ", 9.90, "Oxygen Plant 1"));
        Menu menuItems = new Menu();
        menuItems.setMenu(itemList);
        restaurantData.setMenu(menuItems);
        system.getRestaurantDirectory().addRestaurant(restaurantData);
        
        return system;
        
    }
    
}
