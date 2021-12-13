/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AviationOrg;
import Business.BusinessOrg.*;
import Business.BusinessOrg.BusinessOrgEmployee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Nithin Bharadwaj
 */
public class AviationOrgEmployee extends BusinessOrgEmployee{
   
    public AviationOrgEmployee(UserAccount ua) {
        // Getting the data from parent
        super(ua);
    }
    
}
