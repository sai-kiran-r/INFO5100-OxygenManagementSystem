/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.DefenseBusiness.DefenseOrgEmployeeWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.DefenseBusiness.DefenseOrgManagerWorkAreaJPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class DefenseOrgManagerRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new DefenseOrgManagerWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
