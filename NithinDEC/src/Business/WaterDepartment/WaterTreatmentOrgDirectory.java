/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WaterDepartment;
import Business.WaterDepartment.WaterTreatmentOrg;

import java.util.ArrayList;
/**
 *
 * @author Nithin Bharadwaj
 */
public class WaterTreatmentOrgDirectory{
     private ArrayList<WaterTreatmentOrg> waterTreatmentDirectory;
    
    public WaterTreatmentOrgDirectory() {
        waterTreatmentDirectory = new ArrayList();
    }
    
    public WaterTreatmentOrgDirectory(ArrayList<WaterTreatmentOrg> waterTreatmentObjList) {
        waterTreatmentDirectory = waterTreatmentObjList;
    }


    public ArrayList<WaterTreatmentOrg> returnAllWaterTreatmentBusinesses() {
        return waterTreatmentDirectory;
    }

    public void setWaterTreatmentBusinessDirectory(ArrayList<WaterTreatmentOrg> waterTreatmentDirectory) {
        this.waterTreatmentDirectory = waterTreatmentDirectory;
    }
    
    public WaterTreatmentOrg newWaterTreatmentBusiness(String name, String address, int phoneNumber) {
        WaterTreatmentOrg waterTreatmentObj = new WaterTreatmentOrg(name, address, phoneNumber);
        waterTreatmentDirectory.add(waterTreatmentObj);
        System.out.println(waterTreatmentDirectory.size() + "New Res");
        return waterTreatmentObj;
    }
    
    public void removeWaterTreatmentBusiness(WaterTreatmentOrg waterTreatmentObj){
        waterTreatmentDirectory.remove(waterTreatmentObj);
    }
    
    public WaterTreatmentOrg getWaterTreatmentBusiness(String name) {
        for(WaterTreatmentOrg r : waterTreatmentDirectory) {
            if(r.getBusinessName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public void setBusiness(int index, WaterTreatmentOrg hos) {
        this.waterTreatmentDirectory.set(index, hos);
    }
    
    
    public WaterTreatmentOrg getBusiness(WaterTreatmentOrg ha){
        for(WaterTreatmentOrg r : waterTreatmentDirectory) {
            if(r.getBusinessName().equals(ha.getBusinessName())) {
                return r;
            }
        }
        return null;
    }
    
    public WaterTreatmentOrg getBusiness(String businessName){
        for(WaterTreatmentOrg r : waterTreatmentDirectory) {
            if(r.getBusinessName().equals(businessName)) {
                return r;
            }
        }
        return null;
    }
    
    public void addBusiness(WaterTreatmentOrg rs){
        waterTreatmentDirectory.add(rs);
    }
}
