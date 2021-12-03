/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel1 extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel1(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
//        populateTree();
    }
    
    public void populateTree(){
//        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        // Add the code for draw your system structure shown by JTree
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("SystemAdmin");
//        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
//        root.removeAllChildren();
//        root.insert(networks, 0);

        ArrayList<Customer> customerDir= this.ecosystem.getCustomerDirectory().returnCustomerDetails();
        ArrayList<DeliveryMan> deliveryDir = ecosystem.getDeliveryManDirectory().returnDeliveryAgentDetails();
        ArrayList<Restaurant> restaurantDir = ecosystem.getRestaurantDirectory().returnAllRestaurants();

        Customer customer;
        DeliveryMan deliveryMan;
        Restaurant restaurant;

        DefaultMutableTreeNode customerListNode = new DefaultMutableTreeNode("Customer");
        DefaultMutableTreeNode deliveryManListNode = new DefaultMutableTreeNode("Delivery");
        DefaultMutableTreeNode restaurantListNode = new DefaultMutableTreeNode("Restaurant");
        networks.insert(customerListNode, 0);
        networks.insert(deliveryManListNode, 1);
        networks.insert(restaurantListNode, 2);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        for(int i=0;i<customerDir.size();i++){
        customer=customerDir.get(i);
        networkNode=new DefaultMutableTreeNode(customer.getName());
        customerListNode.insert(networkNode, i);

        }
        for(int j=0; j<deliveryDir.size();j++){
        deliveryMan= deliveryDir.get(j);
        enterpriseNode=new DefaultMutableTreeNode(deliveryMan.getName());
        deliveryManListNode.insert(enterpriseNode, j);
        }

        for(int k=0;k<restaurantDir.size();k++){
        restaurant=restaurantDir.get(k);
        organizationNode=new DefaultMutableTreeNode(restaurant.getRestaurantName());
        restaurantListNode.insert(organizationNode, k);
        }

//        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        btnNewUser = new javax.swing.JButton();
        btnManageNetwork1 = new javax.swing.JButton();
        btnManageNetwork2 = new javax.swing.JButton();
        btnManageNetwork3 = new javax.swing.JButton();
        btnManageNetwork4 = new javax.swing.JButton();
        btnManageNetwork5 = new javax.swing.JButton();
        btnManageNetwork6 = new javax.swing.JButton();
        btnManageNetwork7 = new javax.swing.JButton();
        btnManageNetwork8 = new javax.swing.JButton();
        btnManageNetwork9 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        btnManageNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_customer_20px_2.png"))); // NOI18N
        btnManageNetwork.setText("Manage All Consumers");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_restaurant_20px.png"))); // NOI18N
        btnManageEnterprise.setText("Manage Restaurants");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Delivery.png"))); // NOI18N
        btnManageAdmin.setText("Manage Deliveryman");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });

        btnNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_user_20px.png"))); // NOI18N
        btnNewUser.setText("Create New User");
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });

        btnManageNetwork1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Customerstwo.png"))); // NOI18N
        btnManageNetwork1.setText("Manage Operations Admin");
        btnManageNetwork1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork1ActionPerformed(evt);
            }
        });

        btnManageNetwork2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Hospital.png"))); // NOI18N
        btnManageNetwork2.setText("Manage Hospital Admin");
        btnManageNetwork2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork2ActionPerformed(evt);
            }
        });

        btnManageNetwork3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Hospital2.png"))); // NOI18N
        btnManageNetwork3.setText("Manage Hospital Operations");
        btnManageNetwork3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork3ActionPerformed(evt);
            }
        });

        btnManageNetwork4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ManagerSalesTwo.png"))); // NOI18N
        btnManageNetwork4.setText("Manage Sales Manager");
        btnManageNetwork4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork4ActionPerformed(evt);
            }
        });

        btnManageNetwork5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ManagerSales.png"))); // NOI18N
        btnManageNetwork5.setText("Manage Sales Executive");
        btnManageNetwork5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork5ActionPerformed(evt);
            }
        });

        btnManageNetwork6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/NGOONE.png"))); // NOI18N
        btnManageNetwork6.setText("Manage NGO Administrator");
        btnManageNetwork6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork6ActionPerformed(evt);
            }
        });

        btnManageNetwork7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/NGOONE.png"))); // NOI18N
        btnManageNetwork7.setText("Manage NGO Admin Assistant");
        btnManageNetwork7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork7ActionPerformed(evt);
            }
        });

        btnManageNetwork8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BusinessTwo.png"))); // NOI18N
        btnManageNetwork8.setText("Manage Bussiness Admin");
        btnManageNetwork8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork8ActionPerformed(evt);
            }
        });

        btnManageNetwork9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/BusinessTwo.png"))); // NOI18N
        btnManageNetwork9.setText("Manage Bussiness Assitant");
        btnManageNetwork9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetwork9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnManageNetwork1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnManageAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnManageNetwork3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageNetwork6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageNetwork7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageNetwork5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageNetwork8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageNetwork9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageNetwork4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageNetwork2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(4, 4, 4)
                .addComponent(btnNewUser)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageNetwork))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageEnterprise)
                    .addComponent(btnManageNetwork1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageNetwork2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageNetwork3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnManageNetwork4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageNetwork5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageNetwork6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageNetwork7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageNetwork8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageNetwork9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed

        UpdateCustomerDetails customerObj = new UpdateCustomerDetails(userProcessContainer,
                                                ecosystem);
        userProcessContainer.add("CustomerDashboard", customerObj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageRestaurantDetails restaurantDetailsObj = new ManageRestaurantDetails(
                                    userProcessContainer, ecosystem);
        
        userProcessContainer.add("RestaurantDashboard", restaurantDetailsObj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
       ManageDeliveryUsers deliveryUsersObj = new ManageDeliveryUsers(
                                    userProcessContainer, ecosystem);
        
        userProcessContainer.add("DeliveryUserDashboard", deliveryUsersObj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        // TODO add your handling code here:
        CreateUser createUserObj = new CreateUser(userProcessContainer,
                                                ecosystem);
        userProcessContainer.add("CreateUser", createUserObj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void btnManageNetwork1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork1ActionPerformed
        // TODO add your handling code here:
        
//        ManageDeliveryUsers deliveryUsersObj = new ManageDeliveryUsers(
//                                    userProcessContainer, ecosystem);
//        
//        userProcessContainer.add("DeliveryUserDashboard", deliveryUsersObj);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetwork1ActionPerformed

    private void btnManageNetwork2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetwork2ActionPerformed

    private void btnManageNetwork3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetwork3ActionPerformed

    private void btnManageNetwork4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetwork4ActionPerformed

    private void btnManageNetwork5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetwork5ActionPerformed

    private void btnManageNetwork7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetwork7ActionPerformed

    private void btnManageNetwork8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetwork8ActionPerformed

    private void btnManageNetwork9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetwork9ActionPerformed

    private void btnManageNetwork6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetwork6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetwork6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton btnManageNetwork1;
    private javax.swing.JButton btnManageNetwork2;
    private javax.swing.JButton btnManageNetwork3;
    private javax.swing.JButton btnManageNetwork4;
    private javax.swing.JButton btnManageNetwork5;
    private javax.swing.JButton btnManageNetwork6;
    private javax.swing.JButton btnManageNetwork7;
    private javax.swing.JButton btnManageNetwork8;
    private javax.swing.JButton btnManageNetwork9;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
