/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ScubaOrg;

import java.util.ArrayList;
/**
 *
 * @author Nithin Bharadwaj
 */
public class ScubaOrgDirectory{
     private ArrayList<ScubaOrg> scubaDirectory;
    
    public ScubaOrgDirectory() {
        scubaDirectory = new ArrayList();
    }
    
    public ScubaOrgDirectory(ArrayList<ScubaOrg> scubaOrgList) {
        scubaDirectory = scubaOrgList;
    }

    public ArrayList<ScubaOrg> returnAllScubaBusinesses() {
        return scubaDirectory;
    }

    public void setScubaBusinessDirectory(ArrayList<ScubaOrg> scubaDirectory) {
        this.scubaDirectory = scubaDirectory;
    }
    
    public ScubaOrg newScubaBusiness(String name, String address, int phoneNumber) {
        ScubaOrg aviation = new ScubaOrg(name, address, phoneNumber);
        scubaDirectory.add(aviation);
        System.out.println(scubaDirectory.size() + "New Res");
        return aviation;
    }
    
    public void removeScubaBusiness(ScubaOrg pharma){
        scubaDirectory.remove(pharma);
    }
    
    public ScubaOrg getScubaBusiness(String name) {
        for(ScubaOrg r : scubaDirectory) {
            if(r.getBusinessName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public void setBusiness(int index, ScubaOrg hos) {
        this.scubaDirectory.set(index, hos);
    }
    
    
    public ScubaOrg getBusiness(ScubaOrg ha){
        for(ScubaOrg r : scubaDirectory) {
            if(r.getBusinessName().equals(ha.getBusinessName())) {
                return r;
            }
        }
        return null;
    }
    
    public void addBusiness(ScubaOrg rs){
        scubaDirectory.add(rs);
    }
}
