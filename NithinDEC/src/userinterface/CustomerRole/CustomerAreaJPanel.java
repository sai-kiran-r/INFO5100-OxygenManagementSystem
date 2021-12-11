/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Menu.Item;
import Business.Menu.Menu;
import Business.Order.Order;
import Business.OxygenPlant.OxygenPlant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer,
                            UserAccount account ,EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        valueLabel.setText(account.getUsername());
        ArrayList<OxygenPlant> restList = this.system.getOxygenPlantDirectory().returnAllOxygenPlants();
        ArrayList<String> restaurantNames = new ArrayList();
        for(OxygenPlant p : restList){
            restaurantNames.add(p.getOxygenPlantName());
        }
        comboRestaurant.setModel(new DefaultComboBoxModel<String>(restaurantNames.toArray(new String[0])));
        populateMenuTable();
        populateRequestTable();
    }
    
    public void populateMenuTable(){
        String restaurantName = comboRestaurant.getSelectedItem().toString();
        ArrayList<OxygenPlant> restList = this.system.getOxygenPlantDirectory().returnAllOxygenPlants();
        ArrayList<Item> itemList = new ArrayList();
        for(OxygenPlant p : restList){
            if(p.getOxygenPlantName().equals(restaurantName)){
                itemList = p.getMenu().getMenu();
                break;
            }
        }
        
        System.out.println("Inside method to populate Menu table");
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.setRowCount(0);

        for(Item item : itemList){
            System.out.println(item);
            Object[] row = new Object[2];
            row[0] = item;
            row[1] = item.getPrice();
            model.addRow(row);
        }
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Order order : system.getOrderDirectory().getOrderDirectory()){
            //System.out.println("Order" + order.getOrderId());
            if(userAccount.getEmployee().getName().equals(order.getCustomer().getName())) {
                Object[] row = new Object[8];
                row[0] = order;
                row[1] = order.getItem().getItemName();
                row[2] = order.getQuantity() * order.getItem().getPrice();
                row[3] = order.getRestaurant().getOxygenPlantName();
                row[4] = order.getMessage();
                row[5] = order.getCustomer().getName();
                row[6] = order.getOrderStatus();
                row[7] = order.getQuantity();
                model.addRow(row);
            }
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmitReview = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboRestaurant = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnPlaceOrder = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 252, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmitReview.setText("Add Comment");
        btnSubmitReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitReviewActionPerformed(evt);
            }
        });
        add(btnSubmitReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, -1, -1));

        refreshTestJButton.setText("Refresh ");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Welcome ");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 27, 99, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 29, 158, 26));

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Oxygen Model", "Price"
            }
        ));
        jScrollPane2.setViewportView(tblMenu);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 96));

        jLabel1.setText("Select Pack: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        comboRestaurant.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pack 4", "Pack 6", "Item 24", "Item 48" }));
        comboRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRestaurantActionPerformed(evt);
            }
        });
        add(comboRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 100, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Quantity");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 129, -1));

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 105, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "ItemName", "Price", "---***", "Message", "Receiver", "Status", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 859, 91));

        jLabel3.setText("Add Comments To Order: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, -1, -1));
        add(txtComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 175, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("View Your Orders Below:- ");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 254, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/orders.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 70, 460, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitReviewActionPerformed
  
         if(txtComment.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Field cannot be empty");
            return;
        }
        
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)workRequestJTable.getValueAt(selectedRow, 0);
        order.setMessage(txtComment.getText());
        populateRequestTable();        
    }//GEN-LAST:event_btnSubmitReviewActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMenu.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int quantity = Integer.parseInt(txtQuantity.getText());
        String restaurantName = comboRestaurant.getSelectedItem().toString();
        OxygenPlant restaurant = system.getOxygenPlantDirectory().getOxygenPlant(restaurantName);
        Customer customer = system.getCustomerDirectory().getCustomer(this.userAccount.getEmployee().getName());
        Item selectedItem = (Item) tblMenu.getValueAt(selectedRow, 0);
        String status = "Order Placed";
        
        int lastOrderId = system.getLastOrderId();
        Order order = system.getOrderDirectory().newOrder();
        System.out.println("New Order-id that can be taken : " + lastOrderId+1);
        System.out.println("order id generated : " + order.getOrderId());
        if(lastOrderId+1 > order.getOrderId()){
            order.setOrderId(lastOrderId++);
        }
        
        order.setCustomer(customer);
        order.setQuantity(quantity);
        order.setItem(selectedItem);
        order.setRestaurant(restaurant);
        order.setOrderStatus(status);
        order.setAssign(false);
        order.setReceiver(this.userAccount);
        
        JOptionPane.showMessageDialog(null,"You have placed an order");
        populateRequestTable();
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void comboRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRestaurantActionPerformed
        // TODO add your handling code here:
        this.populateMenuTable();
    }//GEN-LAST:event_comboRestaurantActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSubmitReview;
    private javax.swing.JComboBox comboRestaurant;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
