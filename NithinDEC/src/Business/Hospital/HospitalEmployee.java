/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.NGO.*;
import Business.Customer.*;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Nithin Bharadwaj
 */
public class HospitalEmployee {
    
    private String name;
    private String userName;
    private String userPassword;
    private long phoneNumber;
    private String address;
    UserAccount ua;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    
    public HospitalEmployee(UserAccount ua){
       this.ua = ua; 
       this.name = ua.getEmployee().getName();
       this.userName = ua.getUsername();
       this.userPassword = ua.getPassword();
    }
    
    public UserAccount returnUserAccount(){
        return this.ua;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
