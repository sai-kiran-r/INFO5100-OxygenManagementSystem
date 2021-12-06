/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BusinessOrg;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class BusinessOrgDirectory {
     private ArrayList<BusinessOrg> businessDirectory;
    
    public BusinessOrgDirectory() {
        businessDirectory = new ArrayList();
    }
    
    public BusinessOrgDirectory(ArrayList<BusinessOrg> businessList) {
        businessDirectory = businessList;
    }

    public ArrayList<BusinessOrg> returnAllBusinesss() {
        return businessDirectory;
    }

    public void setBusinessDirectory(ArrayList<BusinessOrg> businessDirectory) {
        this.businessDirectory = businessDirectory;
    }
    
    public BusinessOrg newBusiness(String name, String address, int phoneNumber) {
        BusinessOrg business = new BusinessOrg(name, address, phoneNumber);
        businessDirectory.add(business);
        System.out.println(businessDirectory.size() + "New Res");
        return business;
    }
    
    public void removeBusiness(BusinessOrg business){
        businessDirectory.remove(business);
    }
    
    public BusinessOrg getBusiness(String name) {
        for(BusinessOrg r : businessDirectory) {
            if(r.getBusinessName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public void setBusiness(int index, BusinessOrg hos) {
        this.businessDirectory.set(index, hos);
    }
    
    
    public BusinessOrg getBusiness(BusinessOrg ha){
        for(BusinessOrg r : businessDirectory) {
            if(r.getBusinessName().equals(ha.getBusinessName())) {
                return r;
            }
        }
        return null;
    }
    
    public void addBusiness(BusinessOrg rs){
        businessDirectory.add(rs);
    }
    
    
}
