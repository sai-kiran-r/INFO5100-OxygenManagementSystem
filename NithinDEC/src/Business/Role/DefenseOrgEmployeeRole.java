/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.DefenseBusiness.DefenseOrgManagerWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.DefenseBusiness.DefenseOrgEmployeeWorkAreaJPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class DefenseOrgEmployeeRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new DefenseOrgEmployeeWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
