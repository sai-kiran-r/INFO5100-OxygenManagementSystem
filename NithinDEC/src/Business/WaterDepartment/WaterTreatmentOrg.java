/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WaterDepartment;
import Business.BusinessOrg.BusinessOrg;
/**
 *
 * @author Nithin Bharadwaj
 */
public class WaterTreatmentOrg extends BusinessOrg{
    
    public WaterTreatmentOrg(String businessName, String address, long phoneNumber) {
        super(businessName, address, phoneNumber);
    }
    
    public WaterTreatmentOrg(String businessName, String address) {
        super(businessName, address);
    }
    
}
