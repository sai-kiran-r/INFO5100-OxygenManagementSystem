/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AviationOrg;

import java.util.ArrayList;
/**
 *
 * @author Nithin Bharadwaj
 */
public class AviationOrgDirectory{
     private ArrayList<AviationOrg> aviationDirectory;
    
    public AviationOrgDirectory() {
        aviationDirectory = new ArrayList();
    }
    
    public AviationOrgDirectory(ArrayList<AviationOrg> pharmaList) {
        aviationDirectory = pharmaList;
    }

    public ArrayList<AviationOrg> returnAllAviationBusinesss() {
        return aviationDirectory;
    }

    public void setAviationBusinessDirectory(ArrayList<AviationOrg> aviationDirectory) {
        this.aviationDirectory = aviationDirectory;
    }
    
    public AviationOrg newAviationBusiness(String name, String address, int phoneNumber) {
        AviationOrg aviation = new AviationOrg(name, address, phoneNumber);
        aviationDirectory.add(aviation);
        System.out.println(aviationDirectory.size() + "New Res");
        return aviation;
    }
    
    public void removeAviationBusiness(AviationOrg pharma){
        aviationDirectory.remove(pharma);
    }
    
    public AviationOrg getAviationBusiness(String name) {
        for(AviationOrg r : aviationDirectory) {
            if(r.getBusinessName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public void setBusiness(int index, AviationOrg hos) {
        this.aviationDirectory.set(index, hos);
    }
    
    
    public AviationOrg getBusiness(AviationOrg ha){
        for(AviationOrg r : aviationDirectory) {
            if(r.getBusinessName().equals(ha.getBusinessName())) {
                return r;
            }
        }
        return null;
    }
    
    public AviationOrg getBusiness(String businessName){
        for(AviationOrg r : aviationDirectory) {
            if(r.getBusinessName().equals(businessName)) {
                return r;
            }
        }
        return null;
    }
    
    public void addBusiness(AviationOrg rs){
        aviationDirectory.add(rs);
    }
}
