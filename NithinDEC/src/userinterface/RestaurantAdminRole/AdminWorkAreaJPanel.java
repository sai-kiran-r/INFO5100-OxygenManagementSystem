

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount ua;
    Restaurant resto;
    RestaurantDirectory restaurantDirectory;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,
                            UserAccount ua ,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        this.system = system;
        //valueLabel.setText();
        restaurantDirectory = system.getRestaurantDirectory();
        this.resto = restaurantDirectory.getRestaurant(ua);
        valueLabel.setText(this.resto.getRestaurantName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        userJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_reserve_20px.png"))); // NOI18N
        userJButton.setText("Manage Restaurant Info");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 180, -1));

        manageEmployeeJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_menu_20px.png"))); // NOI18N
        manageEmployeeJButton.setText("Manage menu");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 180, -1));

        manageOrganizationJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_waitress_skin_type_2_20px.png"))); // NOI18N
        manageOrganizationJButton.setText("Manage Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 180, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/restaurant-new.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 580, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageRestaurantInfo manageRestObj = new ManageRestaurantInfo(this.userProcessContainer, 
                                    this.system, this.resto);  
        userProcessContainer.add("ManageMenu", manageRestObj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        try{
            this.resto.getMenu().getMenu();
        }catch(Exception e){
            Menu menuObj = new Menu();
            this.resto.setMenu(menuObj);
        }
        
        ManageMenu menuPanelObj = new ManageMenu(this.userProcessContainer, 
                                    this.system, this.resto);
        userProcessContainer.add("ManageRestaurantInfo", menuPanelObj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        ManageOrder manageOrderObj = new ManageOrder(this.userProcessContainer, 
                                    this.system, this.resto);
        userProcessContainer.add("ManageOrder", manageOrderObj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed
    
    public void reloadRestaurantName(String restaurantName){
        this.valueLabel.setText(restaurantName);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
