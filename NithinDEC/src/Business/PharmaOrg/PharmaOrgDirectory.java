/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PharmaOrg;
import Business.BusinessOrg.BusinessOrgDirectory;
import java.util.ArrayList;
/**
 *
 * @author Nithin Bharadwaj
 */
public class PharmaOrgDirectory extends BusinessOrgDirectory {
     private ArrayList<PharmaOrg> pharmaDirectory;
    
    public PharmaOrgDirectory() {
        pharmaDirectory = new ArrayList();
    }
    
    public PharmaOrgDirectory(ArrayList<PharmaOrg> pharmaList) {
        pharmaDirectory = pharmaList;
    }

    public ArrayList<PharmaOrg> returnAllPharmaBusinesss() {
        return pharmaDirectory;
    }

    public void setPharmaBusinessDirectory(ArrayList<PharmaOrg> pharmaDirectory) {
        this.pharmaDirectory = pharmaDirectory;
    }
    
    public PharmaOrg newPharmaBusiness(String name, String address, int phoneNumber) {
        PharmaOrg pharma = new PharmaOrg(name, address, phoneNumber);
        pharmaDirectory.add(pharma);
        System.out.println(pharmaDirectory.size() + "New Res");
        return pharma;
    }
    
    public void removePharmaBusiness(PharmaOrg pharma){
        pharmaDirectory.remove(pharma);
    }
    
    public PharmaOrg getPharmaBusiness(String name) {
        for(PharmaOrg r : pharmaDirectory) {
            if(r.getBusinessName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public void setBusiness(int index, PharmaOrg hos) {
        this.pharmaDirectory.set(index, hos);
    }
    
    
    public PharmaOrg getBusiness(PharmaOrg ha){
        for(PharmaOrg r : pharmaDirectory) {
            if(r.getBusinessName().equals(ha.getBusinessName())) {
                return r;
            }
        }
        return null;
    }
    
    public void addBusiness(PharmaOrg rs){
        pharmaDirectory.add(rs);
    }
}
