/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.WaterPlantBusiness.WaterPlantEmployeeWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.WaterPlantBusiness.WaterPlantManagerWorkAreaJPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class WaterPlantManagerRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new WaterPlantManagerWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
