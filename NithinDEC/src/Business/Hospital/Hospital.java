/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class Hospital {
    private String hospitalName;
    private String address;
    private long phoneNumber;
    private UserAccount managerAccount;
    private HospitalAdmin hospitalAdmin;
    private HospitalEmployee hospitalEmployee;

    public HospitalAdmin getHospitalAdmin() {
        return hospitalAdmin;
    }

    public void setHospitalAdmin(HospitalAdmin hospitalAdmin) {
        this.hospitalAdmin = hospitalAdmin;
    }

    public HospitalEmployee getHospitalEmployee() {
        return hospitalEmployee;
    }

    public void setHospitalEmployee(HospitalEmployee hospitalEmployee) {
        this.hospitalEmployee = hospitalEmployee;
    }
    
    public Hospital(String hospitalName, String address,
                long phoneNumber) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public Hospital(String hospitalName, String address) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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
        return hospitalName;
    }

    
    
}
