package org.cput.ac.za;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

/**
 *
 * @author 214234169
 */
public class SignUpForm extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    
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
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        btnCreateAccount = new javax.swing.JButton();
        lblFirstName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblLastName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lblAddress = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up Form");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        lblSignUp.setFont(new java.awt.Font("Serif", 0, 28)); // NOI18N
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUp.setText("Sign Up");
        lblSignUp.setToolTipText("");

        txtFirstName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        txtFirstName.setForeground(java.awt.SystemColor.controlShadow);
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirstName.setToolTipText("");
        txtFirstName.setBorder(new javax.swing.border.MatteBorder(null));

        txtLastName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        txtLastName.setForeground(java.awt.SystemColor.controlShadow);
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLastName.setBorder(new javax.swing.border.MatteBorder(null));

        txtEmail.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        txtEmail.setForeground(java.awt.SystemColor.controlShadow);
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(new javax.swing.border.MatteBorder(null));

        txtContactNumber.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        txtContactNumber.setForeground(java.awt.SystemColor.controlShadow);
        txtContactNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContactNumber.setBorder(new javax.swing.border.MatteBorder(null));
        txtContactNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactNumberKeyTyped(evt);
            }
        });

        btnCreateAccount.setBackground(new java.awt.Color(0, 153, 0));
        btnCreateAccount.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(153, 153, 153));
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        lblFirstName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name:");
        lblFirstName.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtPassword.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(new javax.swing.border.MatteBorder(null));

        lblLastName.setBackground(java.awt.Color.darkGray);
        lblLastName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last Name:");
        lblLastName.setToolTipText("");
        lblLastName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblEmail.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email Address:");
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblContactNumber.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblContactNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactNumber.setText("Contact Number:");
        lblContactNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblGender.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");
        lblGender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtAddress.setRows(5);
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 0)));
        jScrollPane1.setViewportView(txtAddress);
        txtAddress.getAccessibleContext().setAccessibleParent(this);

        lblAddress.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress.setText("Address:");

        lblUserName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("Username:");
        lblUserName.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblPassword.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");

        txtUserName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.setBorder(new javax.swing.border.MatteBorder(null));

        cmbGender.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender:", "Male", "Female" }));
        cmbGender.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 0)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\joshu\\Pictures\\Saved Pictures\\background.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword)
                            .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtContactNumber)
                                .addComponent(cmbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNumber)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNumberKeyTyped
        // allow only numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtContactNumberKeyTyped

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed

        //Method function to verify required fields
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String eMail = txtEmail.getText();
        String contactNumber = txtContactNumber.getText();
        String gender = cmbGender.getSelectedItem().toString();
        String address = txtAddress.getText();
        String userName = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());

        //Check if required fields are empty
        if(firstName.trim().equals("") || lastName.trim().equals("") || eMail.trim().equals("") || contactNumber.trim().equals("")
                || gender.trim().equals("") || address.trim().equals("")
                || userName.trim().equals("") || password.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One or more required fields are empty","Empty Fields",2);

        }
        
        try{
            String query = "INSERT INTO `user`(`fname`, `lname`, `email`, `phone`, `gender`, `addr`, `username`, `password`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/userreg", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, txtFirstName.getText());
            pst.setString(2, txtLastName.getText());
            pst.setString(3, txtEmail.getText());
            pst.setString(4, txtContactNumber.getText());
            pst.setString(5, cmbGender.getSelectedItem().toString());
            pst.setString(6, txtAddress.getText());
            pst.setString(7, txtUserName.getText());
            pst.setString(8, String.valueOf(txtPassword.getPassword()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registration Successful");
        
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
