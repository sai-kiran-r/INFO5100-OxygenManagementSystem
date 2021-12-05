/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        SysAdmin("Sysadmin"),
        Customer("Customer"),
        OperationsAdmin("OperationsAdmin"),
        HospitalAdmin("HospitalAdmin"),
        HospitalOperationsAdmin("HospitalOperationsAdmin"),
        SalesManager("SalesManager"),
        SalesExecutive("SalesExecutive"),
        NGOAdmin("NGOAdmin"),
        NGOExecutive("NGOExecutive"),
        PharmaManager("PharmaManager"),
        PharmaExecutive("PharmaExecutive"),
        DefenseOrgManager("DefenseOrgManager"),
        DefenseOrgExecutive("DefenseOrgExecutive"),
        AviationOrgManager("AviationOrgManager"),
        AviationOrgExecutive("AviationOrgExecutive"),
        ScubaOrgManager("ScubaOrgManager"),
        ScubaOrgExecutive("ScubaOrgExecutive"),
        WaterPlantManager("ScubaOrgManager"),
        WaterPlantExecutive("ScubaOrgExecutive"),
        RestaurantAdmin("RestaurantAdmin"),
        DeliveryMan("Delivery");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
       
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
