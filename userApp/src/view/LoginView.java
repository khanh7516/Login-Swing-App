/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UserHandle;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import model.User;

/**
 *
 * @author Acer
 */
public class LoginView extends javax.swing.JFrame {
    private final static UserHandle userHandle = new UserHandle();
    private User user;

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        txtLoginUsername = new javax.swing.JTextField();
        lblLoginUsername = new javax.swing.JLabel();
        lblLoginPassword = new javax.swing.JLabel();
        txtLoginPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblCreateAnAccount = new javax.swing.JLabel();
        lblForgotPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Login");
        lblLogin.setToolTipText("");

        lblLoginUsername.setText("Username");

        lblLoginPassword.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblCreateAnAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCreateAnAccount.setForeground(new java.awt.Color(0, 153, 153));
        lblCreateAnAccount.setText("Chưa có tài khoản? Tạo tài khoản");
        lblCreateAnAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAnAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreateAnAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreateAnAccountMouseExited(evt);
            }
        });

        lblForgotPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblForgotPassword.setForeground(new java.awt.Color(0, 153, 153));
        lblForgotPassword.setText("Quên mật khẩu?");
        lblForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblForgotPasswordMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLoginPassword)
                                    .addComponent(lblLoginUsername))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLoginUsername)
                                    .addComponent(txtLoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
                            .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCreateAnAccount)
                            .addComponent(lblForgotPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnLogin)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginPassword)
                    .addComponent(txtLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addComponent(lblCreateAnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCreateAnAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAnAccountMouseClicked
        // TODO add your handling code here:
       RegisterView registerView = new RegisterView(userHandle);
       registerView.setLocationRelativeTo(null);
       registerView.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_lblCreateAnAccountMouseClicked

    private void lblCreateAnAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAnAccountMouseEntered
        // TODO add your handling code here:
        lblCreateAnAccount.setForeground(Color.red);
    }//GEN-LAST:event_lblCreateAnAccountMouseEntered

    private void lblCreateAnAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAnAccountMouseExited
        // TODO add your handling code here:
        lblCreateAnAccount.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_lblCreateAnAccountMouseExited

    private void lblForgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseClicked
        // TODO add your handling code here:
        while (true) {

            String email = JOptionPane.showInputDialog(null, "Nhập email đăng ký tài khoản:");
            if (email == null) break;

            if (userHandle.findUserByEmail(email) == null) {
                JOptionPane.showMessageDialog(rootPane, "Email không tồn tại!", "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            while (true) {
                JPasswordField passwordField = new JPasswordField();
                String newPassword = "";
                String newRePassword = "";
                int option = JOptionPane.showOptionDialog(null, passwordField, "Nhập mật khẩu mới:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                if (option == JOptionPane.OK_OPTION) {
                    newPassword = new String(passwordField.getPassword());
                }else break;
                
                String newPasswordError = userHandle.validatePassword(newPassword, newPassword);
                if (newPasswordError != null) {
                    JOptionPane.showMessageDialog(rootPane, newPasswordError, "Lỗi!", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                JPasswordField passwordField2 = new JPasswordField();
                int option2 = JOptionPane.showOptionDialog(null, passwordField2, "Nhập lại mật khẩu mới:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
                if (option2 == JOptionPane.OK_OPTION) {
                    newRePassword = new String(passwordField2.getPassword());
                }else break;

                String newRePasswordError = userHandle.validatePassword(newPassword, newRePassword);
                if (newRePasswordError != null) {
                    JOptionPane.showMessageDialog(rootPane, newRePasswordError, "Lỗi!", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                User activeUser = userHandle.findUserByEmail(email);
                activeUser.setPassword(newPassword);
                break;
            }
            break;
        }
        
    }//GEN-LAST:event_lblForgotPasswordMouseClicked

    private void lblForgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseEntered
        // TODO add your handling code here:
        lblForgotPassword.setForeground(Color.red);
    }//GEN-LAST:event_lblForgotPasswordMouseEntered

    private void lblForgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotPasswordMouseExited
        // TODO add your handling code here:
        lblForgotPassword.setForeground(new Color(0,153,153));
    }//GEN-LAST:event_lblForgotPasswordMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtLoginUsername.getText();
        String password = txtLoginPassword.getText();
        
        if (userHandle.findUserByName(username) == null) {
            JOptionPane.showMessageDialog(rootPane, "Kiểm tra lại username!");
            txtLoginUsername.setText("");
            txtLoginPassword.setText("");
        }else {
            if (userHandle.loginUser(username, password)) {
                UserInfoView userInfoView = new UserInfoView(userHandle.findUserByName(username), userHandle);
                userInfoView.setLocationRelativeTo(null);
                userInfoView.setVisible(true);
                setVisible(false);
            } else {
                int option = JOptionPane.showOptionDialog(rootPane, "Mật khẩu không chính xác!", "Lỗi!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
                        new String[] {"Đăng nhập lại", "Quên mật khẩu"}, "Đăng nhập lại" );
                if(option == 0);
                else lblForgotPasswordMouseClicked(null);
                txtLoginPassword.setText("");
            }
        }  
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginView().setVisible(true);
//            }
//        });
//    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCreateAnAccount;
    private javax.swing.JLabel lblForgotPassword;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLoginPassword;
    private javax.swing.JLabel lblLoginUsername;
    private javax.swing.JPasswordField txtLoginPassword;
    private javax.swing.JTextField txtLoginUsername;
    // End of variables declaration//GEN-END:variables
}