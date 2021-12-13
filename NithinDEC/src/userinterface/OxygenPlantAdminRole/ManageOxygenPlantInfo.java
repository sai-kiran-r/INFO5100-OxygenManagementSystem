/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OxygenPlantAdminRole;

import Business.EcoSystem;
import Business.Validation.Validation;
import Business.OxygenPlant.OxygenPlant;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class ManageOxygenPlantInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageOxygenPlantInfo
     */
    JPanel userProcessContainer;
    EcoSystem system;
    OxygenPlant res;
    Validation validation;
    
    public ManageOxygenPlantInfo(JPanel userProcessContainer, EcoSystem system, OxygenPlant res) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.res = res;
        txtAddress.setText(this.res.getAddress());
        txtMangerName.setText(this.res.getManagerName());
        txtRestaurantName.setText(this.res.getOxygenPlantName());
        System.out.println(this.res.getPhoneNumber());
        txtPhoneNumber.setText(String.valueOf(this.res.getPhoneNumber()));
        this.validation = new Validation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTItle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtMangerName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 252, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTItle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTItle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTItle.setText("Update Oxygen Plant Info");
        add(lbTItle, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 97, 373, 51));

        jLabel2.setText("Address :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 226, -1, -1));

        jLabel3.setText("Oxygen Plant Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 188, -1, -1));

        jLabel4.setText("Phone Number :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 264, -1, -1));

        jLabel5.setText("Plant Manager Name :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 308, -1, -1));
        add(txtRestaurantName, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 183, 150, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 221, 150, -1));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 259, 150, -1));
        add(txtMangerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 303, 150, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 375, -1, -1));

        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"))); // NOI18N
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 31, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/giffing.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 510, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String restaurantName = this.res.getOxygenPlantName();
        System.out.println("New Restaurant Name: " + restaurantName);
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof AdminWorkAreaJPanel){
                AdminWorkAreaJPanel adminWorkPanel = (AdminWorkAreaJPanel) comp;
                System.out.println("Inside for loop");
                System.out.println(txtRestaurantName.getText());
                adminWorkPanel.reloadRestaurantName(restaurantName);
//                systemAdminWorkAreaJPanel.populateTree();
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int counter = -1;
        
        boolean restaurantNameValdidation = this.validation.validateName(txtRestaurantName);
        boolean addressValidation = this.validation.validateAddress(txtAddress);
        boolean phoneValidation = this.validation.validatePhoneNumber(txtPhoneNumber);
        boolean restaurantManagerName = this.validation.validateName(txtRestaurantName);
           
        if(restaurantNameValdidation && addressValidation && phoneValidation
                && restaurantNameValdidation){
            for(OxygenPlant restaurantData : this.system.getOxygenPlantDirectory().returnAllOxygenPlants()){
                counter++;
                if(restaurantData.getOxygenPlantName().equals(this.res.getOxygenPlantName())){
                    break;
                }
            }
            this.res.setAddress(txtAddress.getText());
            this.res.setPhoneNumber(Long.parseLong(txtPhoneNumber.getText()));
            this.res.setManagerName(txtMangerName.getText());
            this.res.setOxygenPlantName(txtRestaurantName.getText());
            JOptionPane.showMessageDialog(this, "Updated info Successfully");
            this.system.getOxygenPlantDirectory().setOxygenPlant(counter, this.res);
            for(OxygenPlant restaurantData : this.system.getOxygenPlantDirectory().returnAllOxygenPlants()){
                System.out.println("Restaurant Name : " + restaurantData.getOxygenPlantName());
            }
        }
        else{
            String errorMessage = String.format("Profile info NOT SAVED!!! \n"
                    + "Restaurant validation Status: %s \n Restaurant ManagerName Validation : %s \n" +
                    "Phone Number Validation : %s\n" +
                    "Address Validation : %s \n"
                                , restaurantNameValdidation, restaurantManagerName,
                                phoneValidation, addressValidation
                                );
                UIManager.put("OptionPane.minimumSize",new Dimension(250,250)); 
                JOptionPane.showMessageDialog(this, errorMessage);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbTItle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtMangerName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRestaurantName;
    // End of variables declaration//GEN-END:variables
}
