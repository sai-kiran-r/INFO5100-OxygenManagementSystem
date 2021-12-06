/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Hospital.*;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class HospitalDirectory {
     private ArrayList<Hospital> hospitalDirectory;
    
    public HospitalDirectory() {
        hospitalDirectory = new ArrayList();
    }
    
    public HospitalDirectory(ArrayList<Hospital> hospitalList) {
        hospitalDirectory = hospitalList;
    }

    public ArrayList<Hospital> returnAllHospitals() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public Hospital newHospital(String name, String address, int phoneNumber) {
        Hospital hospital = new Hospital(name, address, phoneNumber);
        hospitalDirectory.add(hospital);
        System.out.println(hospitalDirectory.size() + "New Res");
        return hospital;
    }
    
    public void removeHospital(Hospital hospital){
        hospitalDirectory.remove(hospital);
    }
    
    public Hospital getHospital(String name) {
        for(Hospital r : hospitalDirectory) {
            if(r.getHospitalName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public void setHospital(int index, Hospital hos) {
        this.hospitalDirectory.set(index, hos);
    }
    
    
    public Hospital getHospital(Hospital ha){
        for(Hospital r : hospitalDirectory) {
            if(r.getHospitalName().equals(ha.getHospitalName())) {
                return r;
            }
        }
        return null;
    }
    
    public void addHospital(Hospital rs){
        hospitalDirectory.add(rs);
    }
    
    public void deleteHospitalAdmin(){
        
    }
}
