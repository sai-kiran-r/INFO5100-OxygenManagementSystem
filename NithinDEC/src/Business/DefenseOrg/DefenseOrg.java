/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DefenseOrg;
import Business.BusinessOrg.BusinessOrg;
/**
 *
 * @author Nithin Bharadwaj
 */
public class DefenseOrg extends BusinessOrg{
    
    public DefenseOrg(String businessName, String address, long phoneNumber) {
        super(businessName, address, phoneNumber);
    }
    
    public DefenseOrg(String businessName, String address) {
        super(businessName, address);
    }
    
}
