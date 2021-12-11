/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OxygenPlant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class OxygenPlantDirectory {
     private ArrayList<OxygenPlant> oxygenPlantDirectory;
    
    public OxygenPlantDirectory() {
        oxygenPlantDirectory = new ArrayList();
    }

    public ArrayList<OxygenPlant> returnAllOxygenPlants() {
        return oxygenPlantDirectory;
    }

    public void setOxygenPlantDirectory(ArrayList<OxygenPlant> oxygenPlantDirectory) {
        this.oxygenPlantDirectory = oxygenPlantDirectory;
    }
    
    public OxygenPlant newOxygenPlant(String name, String address, String mName, int phoneNumber) {
        OxygenPlant restaurant = new OxygenPlant(name, address, mName, phoneNumber);
        oxygenPlantDirectory.add(restaurant);
        System.out.println(oxygenPlantDirectory.size() + "New Res");
        return restaurant;
    }
    
    public void removeOxygenPlant(OxygenPlant restaurant){
        oxygenPlantDirectory.remove(restaurant);
    }
    
    public OxygenPlant getOxygenPlant(String name) {
        for(OxygenPlant r : oxygenPlantDirectory) {
            if(r.getOxygenPlantName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public void setOxygenPlant(int index, OxygenPlant res) {
        this.oxygenPlantDirectory.set(index, res);
    }
    
    
    public OxygenPlant getOxygenPlant(UserAccount ua){
        for(OxygenPlant r : oxygenPlantDirectory) {
            if(r.returnUserAcc().getUsername().equals(ua.getUsername())) {
                return r;
            }
        }
        return null;
    }
    
    public void addOxygenPlant(OxygenPlant rs){
        oxygenPlantDirectory.add(rs);
    }
    
    
}
