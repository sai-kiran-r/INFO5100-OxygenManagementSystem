/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DefenseOrg;

import java.util.ArrayList;
/**
 *
 * @author Nithin Bharadwaj
 */
public class DefenseOrgDirectory{
     private ArrayList<DefenseOrg> defenseDirectory;
    
    public DefenseOrgDirectory() {
        defenseDirectory = new ArrayList();
    }
    
    public DefenseOrgDirectory(ArrayList<DefenseOrg> pharmaList) {
        defenseDirectory = pharmaList;
    }

    public ArrayList<DefenseOrg> returnAllDefenseBusinesses() {
        return defenseDirectory;
    }

    public void setDefenseBusinessDirectory(ArrayList<DefenseOrg> defenseDirectory) {
        this.defenseDirectory = defenseDirectory;
    }
    
    public DefenseOrg newDefenseBusiness(String name, String address, int phoneNumber) {
        DefenseOrg aviation = new DefenseOrg(name, address, phoneNumber);
        defenseDirectory.add(aviation);
        System.out.println(defenseDirectory.size() + "New Res");
        return aviation;
    }
    
    public void removeDefenseBusiness(DefenseOrg pharma){
        defenseDirectory.remove(pharma);
    }
    
    public DefenseOrg getDefenseBusiness(String name) {
        for(DefenseOrg r : defenseDirectory) {
            if(r.getBusinessName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public void setBusiness(int index, DefenseOrg hos) {
        this.defenseDirectory.set(index, hos);
    }
    
    
    public DefenseOrg getBusiness(DefenseOrg ha){
        for(DefenseOrg r : defenseDirectory) {
            if(r.getBusinessName().equals(ha.getBusinessName())) {
                return r;
            }
        }
        return null;
    }
    
    public void addBusiness(DefenseOrg rs){
        defenseDirectory.add(rs);
    }
}
