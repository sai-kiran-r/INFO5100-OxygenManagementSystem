/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AviationOrg;
import Business.BusinessOrg.BusinessOrg;
/**
 *
 * @author Nithin Bharadwaj
 */
public class AviationOrg extends BusinessOrg{
    
    public AviationOrg(String businessName, String address, long phoneNumber) {
        super(businessName, address, phoneNumber);
    }
    
    public AviationOrg(String businessName, String address) {
        super(businessName, address);
    }
    
}
