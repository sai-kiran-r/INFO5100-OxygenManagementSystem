/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class NGODirectory {
    
    ArrayList<NGOAdmin> ngoAdmin;
    ArrayList<NGOEmployee> ngoEmployee;
    
    public NGODirectory(){
        ngoAdmin = new ArrayList<NGOAdmin>();
        ngoEmployee = new ArrayList<NGOEmployee>();
    }
    
    public void addAdmin(NGOAdmin c){
        ngoAdmin.add(c);
    }
    
    public void deleteAdmin(NGOAdmin c){
        ngoAdmin.remove(c);
    }
    
    public ArrayList<NGOAdmin> returnAdminDetails(){
        return ngoAdmin;
    }
    
    public NGOAdmin getCustomer(String name){
        for(NGOAdmin ngoAdminData: ngoAdmin){
            if(ngoAdminData.getName().equalsIgnoreCase(name)){
                return ngoAdminData;
            }
        }
        return null;
    }
    
    public void setAdminDetails(ArrayList<NGOAdmin> cusList){
        ngoAdmin = cusList;
    }
    
    public void addEmployee(NGOEmployee c){
        ngoEmployee.add(c);
    }
    
    public void deleteEmployee(NGOEmployee c){
        ngoEmployee.remove(c);
    }
    
    public ArrayList<NGOEmployee> returnEmployeeDetails(){
        return ngoEmployee;
    }
    
    public NGOEmployee getEmployee(String name){
        for(NGOEmployee ngoEmployeeData: ngoEmployee){
            if(ngoEmployeeData.getName().equalsIgnoreCase(name)){
                return ngoEmployeeData;
            }
        }
        return null;
    }
    
    public void setEmployeeDetails(ArrayList<NGOEmployee> cusList){
        ngoEmployee = cusList;
    }
}
