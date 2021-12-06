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
public class BusinessOrg {
    private String businessName;
    private String address;
    private long phoneNumber;
    private BusinessOrgAdmin businessAdmin;
    private BusinessOrgEmployee businessEmployee;

    public BusinessOrgAdmin getBusinessAdmin() {
        return businessAdmin;
    }

    public void setBusinessAdmin(BusinessOrgAdmin businessAdmin) {
        this.businessAdmin = businessAdmin;
    }

    public BusinessOrgEmployee getBusinessEmployee() {
        return businessEmployee;
    }

    public void setBusinessEmployee(BusinessOrgEmployee businessEmployee) {
        this.businessEmployee = businessEmployee;
    }
    
    public BusinessOrg(String businessName, String address,
                long phoneNumber) {
        this.businessName = businessName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public BusinessOrg(String businessName, String address) {
        this.businessName = businessName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return businessName;
    }

    
    
}
