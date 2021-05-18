
package org.cput.ac.za;

/**
 *
 * @author 214234169
 */
public class SignUpForm extends javax.swing.JFrame {

    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtFoodPreference = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JTextField();
        btnCreateAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up Form");
        setBackground(new java.awt.Color(255, 51, 0));
        setForeground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");
        jLabel1.setToolTipText("");

        txtFullName.setBackground(java.awt.Color.darkGray);
        txtFullName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFullName.setForeground(java.awt.SystemColor.controlShadow);
        txtFullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFullName.setText("Full Name");
        txtFullName.setToolTipText("");
        txtFullName.setBorder(new javax.swing.border.MatteBorder(null));
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        txtDOB.setBackground(java.awt.Color.darkGray);
        txtDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDOB.setForeground(java.awt.SystemColor.controlShadow);
        txtDOB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDOB.setText("Date Of Birth");

        txtEmail.setBackground(java.awt.Color.darkGray);
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setForeground(java.awt.SystemColor.controlShadow);
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setText("Email Address");
        txtEmail.setBorder(new javax.swing.border.MatteBorder(null));

        txtContactNumber.setBackground(java.awt.Color.darkGray);
        txtContactNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContactNumber.setForeground(java.awt.SystemColor.controlShadow);
        txtContactNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContactNumber.setText("Contact Number");
        txtContactNumber.setBorder(new javax.swing.border.MatteBorder(null));

        txtAddress.setBackground(java.awt.Color.darkGray);
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddress.setForeground(java.awt.SystemColor.controlShadow);
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddress.setText("Address");
        txtAddress.setBorder(new javax.swing.border.MatteBorder(null));

        txtFoodPreference.setBackground(java.awt.Color.darkGray);
        txtFoodPreference.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFoodPreference.setForeground(java.awt.SystemColor.controlShadow);
        txtFoodPreference.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFoodPreference.setText("Food Preference");
        txtFoodPreference.setBorder(new javax.swing.border.MatteBorder(null));

        txtPassword.setBackground(java.awt.Color.darkGray);
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setForeground(java.awt.SystemColor.controlShadow);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("Password");
        txtPassword.setBorder(new javax.swing.border.MatteBorder(null));

        txtConfirmPassword.setBackground(java.awt.Color.darkGray);
        txtConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtConfirmPassword.setForeground(java.awt.SystemColor.controlShadow);
        txtConfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmPassword.setText("Confrim Password");
        txtConfirmPassword.setBorder(new javax.swing.border.MatteBorder(null));

        btnCreateAccount.setBackground(new java.awt.Color(102, 102, 102));
        btnCreateAccount.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(255, 51, 51));
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFullName)
                    .addComponent(txtDOB)
                    .addComponent(txtEmail)
                    .addComponent(txtContactNumber)
                    .addComponent(txtAddress)
                    .addComponent(txtFoodPreference)
                    .addComponent(txtPassword)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFoodPreference, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFoodPreference;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
