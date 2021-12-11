/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OxygenPlant;

import Business.UserAccount.UserAccount;
import Business.Menu.Menu;
import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class OxygenPlant {
    private String plantName;
    private String address;
    private String managerName;
    private long phoneNumber;
    private Menu itemMenu;
    private UserAccount managerAccount;
    
    public OxygenPlant(String plantName, String address,
                String managerName, long phoneNumber, UserAccount ua) {
        this.plantName = plantName;
        this.address = address;
        this.managerName = managerName;
        this.phoneNumber = phoneNumber;
        this.managerAccount = ua;
    }
    
    public OxygenPlant(String plantName, String address,
                String managerName, int phoneNumber) {
        this.plantName = plantName;
        this.address = address;
        this.managerName = managerName;
        this.phoneNumber = phoneNumber;
    }

    public Menu getMenu() {
        return itemMenu;
    }

    public void setMenu(Menu newMenu) {
        this.itemMenu = newMenu;
    }
    
    public String getOxygenPlantName() {
        return plantName;
    }

    public void setOxygenPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public UserAccount returnUserAcc(){
        return this.managerAccount;
    }
    
    @Override
    public String toString() {
        return plantName;
    }

        
}
