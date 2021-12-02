/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class ManageHospitalAdmin extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCustomerDetails
     */
    JPanel userProcessContainer;
    EcoSystem system;
    
    public ManageHospitalAdmin(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.populateTable();
//        txtName.setEditable(false);
//        txtUsername.setEditable(false);
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
        tblCustomerDetails = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lbPassword = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        lbPassword1 = new javax.swing.JLabel();
        lbPassword2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();

        setBackground(new java.awt.Color(247, 247, 247));

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Manage Hopspital Admin Details");

        tblCustomerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "UserName", "Password", "Address", "PhoneNumber"
            }
        ));
        jScrollPane1.setViewportView(tblCustomerDetails);

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

        lbPassword.setText("Password :");

        lbName.setText("Name :");

        lbUsername.setText("Username :");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbPassword1.setText("Address :");

        lbPassword2.setText("Phone Number :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbUsername)
                                                .addComponent(lbName))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbPassword2)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbPassword)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbPassword1)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(66, 66, 66)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(btnSubmit)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbName)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassword1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassword2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addContainerGap(38, Short.MAX_VALUE))
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
        int selectedRowIndex = tblCustomerDetails.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCustomerDetails.getModel();
        Customer selectedCustomer = (Customer)model.getValueAt(selectedRowIndex, 0);
        String name = txtName.getText();
        String userName = txtUsername.getText();
        String password = txtpassword.getText();

        
        ArrayList<Customer> restos = system.getCustomerDirectory().returnCustomerDetails();
        for(Customer r: restos)
        {
            if(r.getName().equals(selectedCustomer.getName()))
            {
                r.setName(name);
                r.returnUserAccount().setUsername(userName);
                r.returnUserAccount().setPassword(password);
                r.setUserName(userName);
                r.setUserPassword(password);
                r.setPhoneNumber(Long.parseLong(txtPhoneNumber.getText()));
                r.setAddress(txtAddress.getText());
                break;
            }
            
        }
        this.system.getCustomerDirectory().setCustomerDetails(restos);
        JOptionPane.showMessageDialog(this, "Updated Successfully");
        
        txtName.setText("");txtUsername.setText("");txtpassword.setText("");
        txtAddress.setText("");txtPhoneNumber.setText("");
        populateTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCustomerDetails.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to View");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCustomerDetails.getModel();
        Customer selectedCustomer = (Customer)model.getValueAt(selectedRowIndex, 0);
        txtName.setText("");
        txtName.setText(selectedCustomer.getName());
        txtUsername.setText("");
        txtUsername.setText(selectedCustomer.getUserName());
        txtpassword.setText("");
        txtpassword.setText(selectedCustomer.getUserPassword());
        txtAddress.setText("");
        txtAddress.setText(selectedCustomer.getAddress());
        txtPhoneNumber.setText("");
        txtPhoneNumber.setText(String.valueOf(selectedCustomer.getPhoneNumber()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCustomerDetails.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCustomerDetails.getModel();
        Customer selectedCustomer = (Customer)model.getValueAt(selectedRowIndex, 0);
        // First delete the customer from employee
        this.system.getEmployeeDirectory().deleteEmployee(selectedCustomer.getName());
        // And thne delete the userAccount
        this.system.getUserAccountDirectory().deleteUserAccount(
                this.system.getCustomerDirectory().returnCustomerDetails().
                        get(selectedRowIndex).returnUserAccount()
        );
        // finally delete the user from customer directory
        this.system.getCustomerDirectory().deleteCustomer(selectedCustomer);
        
        JOptionPane.showMessageDialog(this, "Deleted the entry Successfully");
        for(Customer ck : this.system.getCustomerDirectory().returnCustomerDetails()){
            System.out.println(ck.getName());
        }
        this.populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPassword1;
    private javax.swing.JLabel lbPassword2;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JTable tblCustomerDetails;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables

    private void populateTable(){
        System.out.println("Inside method to populate Customer table");
        DefaultTableModel model = (DefaultTableModel) tblCustomerDetails.getModel();
        model.setRowCount(0);

        for(Customer cust : this.system.getCustomerDirectory().returnCustomerDetails()){
            System.out.println(cust);
            Object[] row = new Object[5];
            row[0] = cust;
            row[1] = cust.getUserName();
            row[2] = cust.getUserPassword();
            row[3] = cust.getAddress();
            row[4] = cust.getPhoneNumber();
            model.addRow(row);
        }
    }

}
