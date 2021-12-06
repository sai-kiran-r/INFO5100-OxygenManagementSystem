/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerSales;

import Business.NGO.*;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class SalesDirectory {
    
    ArrayList<SalesManager> salesManager;
    ArrayList<SalesEmployee> salesEmployee;
    
    public SalesDirectory(){
        salesManager = new ArrayList<SalesManager>();
        salesEmployee = new ArrayList<SalesEmployee>();
    }
    
    public void addManager(SalesManager c){
        salesManager.add(c);
    }
    
    public void deleteManager(SalesManager c){
        salesManager.remove(c);
    }
    
    public ArrayList<SalesManager> returnSalesManagerDetails(){
        return salesManager;
    }
    
    public SalesManager getManagerDetails(String name){
        for(SalesManager salesManagerData: salesManager){
            if(salesManagerData.getName().equalsIgnoreCase(name)){
                return salesManagerData;
            }
        }
        return null;
    }
    
    public void setManagerDetails(ArrayList<SalesManager> cusList){
        salesManager = cusList;
    }
    
    public void addEmployee(SalesEmployee c){
        salesEmployee.add(c);
    }
    
    public void deleteEmployee(SalesEmployee c){
        salesEmployee.remove(c);
    }
    
    public ArrayList<SalesEmployee> returnEmployeeDetails(){
        return salesEmployee;
    }
    
    public SalesEmployee getEmployee(String name){
        for(SalesEmployee salesEmployeeData: salesEmployee){
            if(salesEmployeeData.getName().equalsIgnoreCase(name)){
                return salesEmployeeData;
            }
        }
        return null;
    }
    
    public void setEmployeeDetails(ArrayList<SalesEmployee> cusList){
        salesEmployee = cusList;
    }
}
