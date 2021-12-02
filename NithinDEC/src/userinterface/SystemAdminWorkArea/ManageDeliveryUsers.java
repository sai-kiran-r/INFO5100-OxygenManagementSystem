/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Validation.Validation;
import java.awt.Dimension;
import javax.swing.UIManager;

/**
 *
 * @author Nithin Bharadwaj
 */
public class ManageDeliveryUsers extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCustomerDetails
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Validation validation;
    
    public ManageDeliveryUsers(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.populateTable();
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

        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryUsers = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lbPassword = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lbUsername1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lbUsername2 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(247, 247, 247));

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Manage Delivery Partners");

        tblDeliveryUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "UserName", "Status", "Address", "PhoneNumber"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryUsers);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnSubmit.setText("Update");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lbPassword.setText("Status :");

        lbName.setText("Name :");

        lbUsername.setText("Username :");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbUsername1.setText("Address :");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        lbUsername2.setText("Phone Number :");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Not Available" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUsername)
                            .addComponent(lbName)
                            .addComponent(lbPassword)
                            .addComponent(lbUsername1)
                            .addComponent(lbUsername2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtAddress)
                            .addComponent(txtName)
                            .addComponent(txtUsername)
                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(btnSubmit)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsername))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPassword)
                            .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsername1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsername2))))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof SystemAdminWorkAreaJPanel){
                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                systemAdminWorkAreaJPanel.populateTree();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDeliveryUsers.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDeliveryUsers.getModel();
        DeliveryMan selectedDelivery = (DeliveryMan)model.getValueAt(selectedRowIndex, 0);
        
        boolean validateName = this.validation.validateName(txtName);
        boolean validateUserName = this.validation.validateUserName(txtUsername);
        boolean validateAddress = this.validation.validateAddress(txtAddress);
        boolean validatePhone = this.validation.validatePhoneNumber(txtPhoneNumber);
        
        if(validateAddress && validatePhone && validateName && validateUserName){
            String name = txtName.getText();
            String userName = txtUsername.getText();
            String status = comboStatus.getSelectedItem().toString();
            String address = txtAddress.getText();
            long phoneNumber = Long.parseLong(txtPhoneNumber.getText());

            ArrayList<DeliveryMan> restos = system.getDeliveryManDirectory().returnDeliveryAgentDetails();
            for(DeliveryMan r: restos)
            {
                if(r.getName().equals(selectedDelivery.getName()))
                {
                   r.setName(name);
                   r.getUa().setUsername(userName);
                   r.setStatus(status);
                   r.setPhoneNumber(Long.parseLong(txtPhoneNumber.getText()));
                   r.setAddress(txtAddress.getText());
                   break;
                }

            }
            JOptionPane.showMessageDialog(this, "Updated the DeliveryMan Details");
            txtName.setText("");txtUsername.setText("");
            txtAddress.setText("");txtPhoneNumber.setText("");
            populateTable();
        }
        else{
            String errorMessage = String.format("Profile info NOT SAVED!!! \n"
                    + "Name validation Status: %s \n UserName Validation : %s \n" +
                    "Phone Number Validation : %s\n" +
                    "Address Validation : %s \n"
                                , validateName, validateUserName,
                                validatePhone, validateAddress
                                );
                UIManager.put("OptionPane.minimumSize",new Dimension(250,250)); 
                JOptionPane.showMessageDialog(this, errorMessage);
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDeliveryUsers.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to View");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDeliveryUsers.getModel();
        DeliveryMan selectedDeliveryAgent = (DeliveryMan)model.getValueAt(selectedRowIndex, 0);
        txtName.setText("");
        txtName.setText(selectedDeliveryAgent.getName());
        txtUsername.setText("");
        txtUsername.setText(selectedDeliveryAgent.getUa().getUsername());
        comboStatus.setSelectedItem(selectedDeliveryAgent.getStatus());
        txtAddress.setText("");
        txtAddress.setText(selectedDeliveryAgent.getAddress());
        txtPhoneNumber.setText("");
        txtPhoneNumber.setText(String.valueOf(selectedDeliveryAgent.getPhoneNumber()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDeliveryUsers.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
         DefaultTableModel model = (DefaultTableModel) tblDeliveryUsers.getModel();
        DeliveryMan selectedDeliveryAgent = (DeliveryMan)model.getValueAt(selectedRowIndex, 0);
        // First delete the customer from employee
        this.system.getEmployeeDirectory().deleteEmployee(selectedDeliveryAgent.getName());
        // And thne delete the userAccount
        this.system.getUserAccountDirectory().deleteUserAccount(
                this.system.getDeliveryManDirectory().returnDeliveryAgentDetails().
                        get(selectedRowIndex).getUa()
        );
        // finally delete the user from customer directory
        this.system.getDeliveryManDirectory().deleteDeliveryAgent(selectedDeliveryAgent);
        
        JOptionPane.showMessageDialog(this, "Deleted the entry Successfully");
        for(DeliveryMan ck : this.system.getDeliveryManDirectory().returnDeliveryAgentDetails()){
            System.out.println(ck.getName());
        }
        this.populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox comboStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbUsername1;
    private javax.swing.JLabel lbUsername2;
    private javax.swing.JTable tblDeliveryUsers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    private void populateTable(){
        System.out.println("Inside method to populate Delivery person details");
        DefaultTableModel model = (DefaultTableModel) tblDeliveryUsers.getModel();
        model.setRowCount(0);

        for(DeliveryMan del : this.system.getDeliveryManDirectory().returnDeliveryAgentDetails()){
            System.out.println(del);
            Object[] row = new Object[5];
            row[0] = del;
            row[1] = del.getUa().getUsername();
            row[2] = del.getStatus();
            row[3] = del.getAddress();
            row[4] = del.getPhoneNumber();
            model.addRow(row);
        }
    }


}
