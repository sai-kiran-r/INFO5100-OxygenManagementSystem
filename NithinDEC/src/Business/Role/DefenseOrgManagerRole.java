/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.DefenseBusiness.DefenseOrgManagerWorkAreaJPanel1;
import javax.swing.JPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class DefenseOrgManagerRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new DefenseOrgManagerWorkAreaJPanel1(userProcessContainer, account, system);
    }
    
}
