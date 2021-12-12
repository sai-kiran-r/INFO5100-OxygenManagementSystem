/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.AviationBusiness.AviationManagerWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.AviationBusiness.AviationEmployeeWorkAreaJPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class AviationOrgEmployeeRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new AviationEmployeeWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
