
package org.cput.ac.za;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author 214234169
 */
public class AddOrder extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form AddOrder
     */
    public AddOrder() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        btnProcessOrder = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        cmbFoodItem = new javax.swing.JComboBox<>();
        lblIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsername.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblUsername.setText("Username:");

        lblDate.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblDate.setText("Date:");

        lblItem.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblItem.setText("Item:");

        btnProcessOrder.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        btnProcessOrder.setText("Process Order");
        btnProcessOrder.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 102)));
        btnProcessOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessOrderActionPerformed(evt);
            }
        });

        txtUserName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N

        txtDate.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        txtDate.setText("dd/mm/yyyy");

        cmbFoodItem.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        cmbFoodItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Food Item:", "Pizza", "Burger", "Wrap", " " }));

        lblIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\joshu\\Pictures\\Saved Pictures\\logo.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIcon)
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcessOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblDate)
                            .addComponent(lblItem))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbFoodItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserName)
                            .addComponent(txtDate))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFoodItem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem))
                .addGap(41, 41, 41)
                .addComponent(btnProcessOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessOrderActionPerformed
        //Method functions to verify required fields
        String userName = txtUserName.getText();
        String date = txtDate.getText();
        String foodItem = cmbFoodItem.getSelectedItem().toString();
        
        //Check if required fields are empty
        if(userName.trim().equals("") || date.trim().equals("") || foodItem.trim().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "One or more required fields are empty","Empty Fields",2);
                }
        try{
            String query = "INSERT INTO `orders`(`username`, `date`, `item`) VALUES (?, ?, ?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/addorder", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, txtUserName.getText());
            pst.setString(2, txtDate.getText());
            pst.setString(3, cmbFoodItem.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Your Order Has Been Processed");
        
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
    }//GEN-LAST:event_btnProcessOrderActionPerformed

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
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessOrder;
    private javax.swing.JComboBox<String> cmbFoodItem;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}
