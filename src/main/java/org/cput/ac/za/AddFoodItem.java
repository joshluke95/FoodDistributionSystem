
package org.cput.ac.za;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author 214234169
 */
public class AddFoodItem extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form FoodMenu
     */
    public AddFoodItem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblItemID = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        lblItemPrice = new javax.swing.JLabel();
        txtItemID = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtItemPrice = new javax.swing.JTextField();
        btnProcessNewItem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Food Menu");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblItemID.setBackground(new java.awt.Color(255, 255, 255));
        lblItemID.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblItemID.setText("Item ID:");

        lblItemName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblItemName.setText("Item Name:");

        lblItemPrice.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblItemPrice.setText("Item Price:");

        txtItemID.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N

        txtItemName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N

        txtItemPrice.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N

        btnProcessNewItem.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        btnProcessNewItem.setText("Process Food Item");
        btnProcessNewItem.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 102)));
        btnProcessNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessNewItemActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\joshu\\Pictures\\Saved Pictures\\logo.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblItemName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItemPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItemID, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItemID)
                            .addComponent(txtItemName)
                            .addComponent(txtItemPrice)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnProcessNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnProcessNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessNewItemActionPerformed
        //Method functions to verify required fields
        String itemID = txtItemID.getText();
        String itemName = txtItemName.getText();
        String itemPrice = txtItemPrice.getText();
        
        //Check if required fields are empty
        if(itemID.trim().equals("") || itemName.trim().equals("") || itemPrice.trim().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "One or more required fields are empty","Empty Fields",2);
                }
        
        try{
            String query = "INSERT INTO `menu`(`itemid`, `itemname`, `itemprice`) VALUES (?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/foodmenu", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, txtItemID.getText());
            pst.setString(2, txtItemName.getText());
            pst.setString(3, txtItemPrice.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "New Item Saved");
        
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);        
    }//GEN-LAST:event_btnProcessNewItemActionPerformed
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddFoodItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFoodItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFoodItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFoodItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFoodItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessNewItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblItemID;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemPrice;
    private javax.swing.JTextField txtItemID;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    // End of variables declaration//GEN-END:variables
}
