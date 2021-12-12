/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.WaterPlantBusiness.WaterPlantManagerWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.WaterPlantBusiness.WaterPlantEmployeeWorkAreaJPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class WaterPlantEmployeeRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new WaterPlantEmployeeWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
