/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
//Testing

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
import Business.PharmaOrg.PharmaOrgDirectory;
import Business.OxygenPlant.OxygenPlant;
import Business.OxygenPlant.OxygenPlantDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Role.NGOAdminRole;
import Business.AviationOrg.AviationOrgDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.PharmaOrg.PharmaOrg;
import Business.AviationOrg.AviationOrg;
import Business.DefenseOrg.DefenseOrg;
import Business.DefenseOrg.DefenseOrgDirectory;
import Business.ScubaOrg.ScubaOrg;
import Business.ScubaOrg.ScubaOrgDirectory;
import Business.WaterDepartment.WaterTreatmentOrg;
import Business.WaterDepartment.WaterTreatmentOrgDirectory;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private OxygenPlantDirectory oxygenPlantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderDirectory orderDirectory;
    private NGODirectory ngoDirectory;
    private SalesDirectory salesDirectory;
    private HospitalDirectory hospitalDirectory;
    private PharmaOrgDirectory pharmaDirectory;
    private AviationOrgDirectory aviationDirectory;
    private DefenseOrgDirectory defenseDirectory;
    private ScubaOrgDirectory scubaOrgDirectory;
    private WaterTreatmentOrgDirectory waterTreatmentOrgDirectory; 
    private ArrayList<PendingAccountApproval> PendingAccountCreation;
    
    public EcoSystem(OxygenPlantDirectory oxygenPlantDirectory, 
                    CustomerDirectory customerDirectory, 
                     DeliveryManDirectory deliveryManDirectory) {
        System.out.println("Inside public constructuer");
        this.oxygenPlantDirectory = oxygenPlantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public EcoSystem(OxygenPlantDirectory oxygenPlantDirectory, 
            CustomerDirectory customerDirectory, 
            DeliveryManDirectory deliveryManDirectory, 
            OrderDirectory orderDirectory, NGODirectory ngoDirectory,
            SalesDirectory salesDirectory, HospitalDirectory hospitalDirectory,
            PharmaOrgDirectory pharmaDirectory, AviationOrgDirectory aviationDirectory,
            DefenseOrgDirectory defenseDirectory, ScubaOrgDirectory scubaOrgDirectory,
            WaterTreatmentOrgDirectory waterTreatmentOrgDirectory,
            ArrayList<PendingAccountApproval> PendingAccountCreation) {
        System.out.println("Inside public constructuer");
        this.oxygenPlantDirectory = oxygenPlantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderDirectory = orderDirectory;
        this.ngoDirectory = ngoDirectory;
        this.salesDirectory = salesDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.pharmaDirectory = pharmaDirectory;
        this.aviationDirectory = aviationDirectory;
        this.defenseDirectory = defenseDirectory;
        this.scubaOrgDirectory = scubaOrgDirectory;
        this.waterTreatmentOrgDirectory = waterTreatmentOrgDirectory;
        this.PendingAccountCreation = PendingAccountCreation;
    }
    
    public EcoSystem(){
        super("Restaurant Delivery");
        this.customerDirectory = new CustomerDirectory();
        this.oxygenPlantDirectory = new OxygenPlantDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
        this.orderDirectory = new OrderDirectory();
        this.ngoDirectory = new NGODirectory();
        this.salesDirectory = new SalesDirectory();
        this.hospitalDirectory = new HospitalDirectory();
        this.pharmaDirectory = new PharmaOrgDirectory();
        this.aviationDirectory = new AviationOrgDirectory();
        this.defenseDirectory = new DefenseOrgDirectory();
        this.scubaOrgDirectory = new ScubaOrgDirectory();
        this.waterTreatmentOrgDirectory = new WaterTreatmentOrgDirectory();
        this.PendingAccountCreation = new ArrayList<PendingAccountApproval>();
        
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
    
    public OxygenPlantDirectory getOxygenPlantDirectory(){
        return oxygenPlantDirectory;
    }
    
    public void setRestaurantDirectory(ArrayList<OxygenPlant> rsList){
        oxygenPlantDirectory.setOxygenPlantDirectory(rsList);
    }
    
    public PharmaOrgDirectory getPharmaDirectory(){
        return pharmaDirectory;
    }
    
    public void setPharmaOrgDirectory(ArrayList<PharmaOrg> pharmaOrgList){
        this.pharmaDirectory = new PharmaOrgDirectory(pharmaOrgList);
    }

    public WaterTreatmentOrgDirectory getWaterTreatementirectory(){
        return this.waterTreatmentOrgDirectory;
    }
    
    public void setWaterTreatementOrgDirectory(ArrayList<WaterTreatmentOrg> plantOrgList){
        this.waterTreatmentOrgDirectory = new WaterTreatmentOrgDirectory(plantOrgList);
    }
    
    public ScubaOrgDirectory getScubaOrgDirectory(){
        return this.scubaOrgDirectory;
    }
    
    public void setScubaOrgDirectory(ArrayList<ScubaOrg> scubaOrgList){
        this.scubaOrgDirectory = new ScubaOrgDirectory(scubaOrgList);
    }
    
    public DefenseOrgDirectory getDefenseDirectory(){
        return this.defenseDirectory;
    }
    
    public void setDefenseOrgDirectory(ArrayList<DefenseOrg> defenseOrgList){
        this.defenseDirectory = new DefenseOrgDirectory(defenseOrgList);
    }
    
    public AviationOrgDirectory getAviationDirectory(){
        return aviationDirectory;
    }
    
    public void setAviationOrgDirectory(ArrayList<AviationOrg> aviationOrgList){
        this.aviationDirectory = new AviationOrgDirectory(aviationOrgList);
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
    
    public ArrayList<PendingAccountApproval> getPendingAccountCreation(){
        return this.PendingAccountCreation;
    }
    
    public void addPendingAccountApproval(PendingAccountApproval e){
        this.PendingAccountCreation.add(e);
    }
    
    public void setPendingAccountApproval(ArrayList<PendingAccountApproval> ar){
        this.PendingAccountCreation = ar;
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
