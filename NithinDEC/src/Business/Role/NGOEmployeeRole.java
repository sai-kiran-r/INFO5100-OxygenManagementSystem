/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.NGO.NGOExecutiveWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class NGOEmployeeRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new NGOExecutiveWorkAreaJPanel(userProcessContainer, account, system);
    }
    
}
