/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public abstract class Role {
    
    public enum RoleType{
        SysAdmin("Sysadmin"),
        Customer("Customer"),
        OperationsAdmin("OperationsAdmin"),
        HospitalAdmin("HospitalAdmin"),
        HospitalOperationsAdmin("HospitalOperationsAdmin"),
        SalesManager("SalesManager"),
        SalesEmployee("SalesEmployee"),
        NGOAdmin("NGOAdmin"),
        NGOEmployee("NGOEmployee"),
        PharmaManager("PharmaManager"),
        PharmaEmployee("PharmaEmployee"),
        DefenseOrgManager("DefenseOrgManager"),
        DefenseOrgEmployee("DefenseOrgEmployee"),
        AviationOrgManager("AviationOrgManager"),
        AviationOrgEmployee("AviationOrgEmployee"),
        ScubaOrgManager("ScubaOrgManager"),
        ScubaOrgEmployee("ScubaOrgEmployee"),
        WaterPlantManager("ScubaOrgManager"),
        WaterPlantEmployee("ScubaOrgEmployee"),
        RestaurantAdmin("RestaurantAdmin"),
        DeliveryMan("Delivery");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}