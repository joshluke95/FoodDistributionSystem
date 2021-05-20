
package org.cput.ac.za;

import javax.swing.*;

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

        lblSignUp = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        btnCreateAccount = new javax.swing.JButton();
        lblFullName = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jConfirmPassword = new javax.swing.JPasswordField();
        lblDOB = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblAddress = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up Form");
        setBackground(new java.awt.Color(255, 51, 0));
        setForeground(new java.awt.Color(255, 51, 0));

        lblSignUp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSignUp.setForeground(java.awt.Color.red);
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUp.setText("Sign Up");
        lblSignUp.setToolTipText("");
        lblSignUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblSignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtFullName.setBackground(java.awt.Color.darkGray);
        txtFullName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFullName.setForeground(java.awt.SystemColor.controlShadow);
        txtFullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        txtEmail.setBackground(java.awt.Color.darkGray);
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setForeground(java.awt.SystemColor.controlShadow);
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(new javax.swing.border.MatteBorder(null));

        txtContactNumber.setBackground(java.awt.Color.darkGray);
        txtContactNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContactNumber.setForeground(java.awt.SystemColor.controlShadow);
        txtContactNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContactNumber.setBorder(new javax.swing.border.MatteBorder(null));
        txtContactNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNumberKeyTyped(evt);
            }
        });

        btnCreateAccount.setBackground(new java.awt.Color(102, 102, 102));
        btnCreateAccount.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(255, 51, 51));
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        lblFullName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblFullName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFullName.setText("Full Name:");
        lblFullName.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jPassword.setBackground(java.awt.Color.darkGray);
        jPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPassword.setBorder(new javax.swing.border.MatteBorder(null));

        jConfirmPassword.setBackground(java.awt.Color.darkGray);
        jConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jConfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jConfirmPassword.setBorder(new javax.swing.border.MatteBorder(null));

        lblDOB.setBackground(java.awt.Color.darkGray);
        lblDOB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDOB.setText("Date of Birth:");
        lblDOB.setToolTipText("");
        lblDOB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email Address:");
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblContactNumber.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblContactNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNumber.setText("Contact Number:");
        lblContactNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");
        lblGender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        radMale.setBackground(java.awt.Color.darkGray);
        radMale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radMale.setForeground(java.awt.SystemColor.controlShadow);
        radMale.setText("Male");
        radMale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radMale.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        radFemale.setBackground(java.awt.Color.darkGray);
        radFemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radFemale.setForeground(java.awt.SystemColor.controlShadow);
        radFemale.setText("Female");
        radFemale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radFemale.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.darkGray, 3));
        jScrollPane1.setViewportView(jTextArea1);

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress.setText("Address:");

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");
        lblPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConfirmPassword.setText("Confirm Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblConfirmPassword))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jConfirmPassword)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtContactNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radMale, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPassword))))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radMale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(radFemale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmPassword))
                .addGap(18, 18, 18)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {
        String fullName = txtFullName.getText();
        String eMail = txtEmail.getText();
        String DOB = txtDOB.getText();
        String pass = String.valueOf(jPassword.getPassword());
        String confirmPass = String.valueOf(jConfirmPassword.getPassword());
        String contactNumber = txtContactNumber.getText();
        String gender = "Male";

        if(radFemale.isSelected()) {
            gender = "Female";
        }

        if(verifyFields()){

        }
    }

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

    private void txtContactNumberKeyTyped(java.awt.event.KeyEvent evt) {

        // allow only numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }

    }

    //Method function to verify required fields
    public boolean verifyFields(){
      String fullName = txtFullName.getText();
      String eMail = txtEmail.getText();
      String DOB = txtDOB.getText();
      String contactNumber = txtContactNumber.getText();
      String pass = String.valueOf(jPassword.getPassword());
      String confirmPass = String.valueOf(jConfirmPassword.getPassword());

    //Check if required fields are empty
      if(fullName.trim().equals("") || eMail.trim().equals("") || DOB.trim().equals("") || contactNumber.trim().equals("")
           || pass.trim().equals("") || confirmPass.trim().equals(""))
      {
          JOptionPane.showMessageDialog(null, "One or more required fields are empty","Empty Fields",2);
          return false;
      }
      //Check if the two password fields are equal
        else if (pass.equals(confirmPass))
        {
            JOptionPane.showMessageDialog(null,"Password does not match","Confirm Password",2);
            return false;
        }
        else {
            return true;
      }

    }

    


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JPasswordField jConfirmPassword;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    // End of variables declaration//GEN-END:variables
}
