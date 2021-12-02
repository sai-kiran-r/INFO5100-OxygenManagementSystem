/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author Nithin Bharadwaj
 */
public class DeliveryManDirectory {
    
     ArrayList<DeliveryMan> dm;
    
    public DeliveryManDirectory(){
        dm = new ArrayList<DeliveryMan>();
    }
    
    public void addDeliveryAgent(DeliveryMan c){
        dm.add(c);
    }
    
    public void deleteDeliveryAgent(DeliveryMan c){
        dm.remove(c);
    }
    
    public ArrayList<DeliveryMan> returnDeliveryAgentDetails(){
        return dm;
    }
    
}
