/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Niki Choksi
 */

public class CreateAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccountJPanel
     */
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;  

    CreateAccountJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountDirectory = accountDirectory;
    }

    public boolean validateData() {

        if (txtRoutingNumber.getText().length() == 0 || (!txtRoutingNumber.getText().matches("[0-9]+"))) {
            JOptionPane.showMessageDialog(this, "Please Enter Correct  Routing Number");
            return false;
        }
        if (txtAccountNumber.getText().length() == 0 || (!txtAccountNumber.getText().matches("[0-9]+"))) {
            JOptionPane.showMessageDialog(this, "Please Enter Correct  Account Number");
            return false;
        }
        if (txtBankName.getText().length() <= 0 || !txtBankName.getText().matches("[a-zA-Z0-9 ]+")) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Bank Name");
            return false;
        }
        if (txtBalance.getText().length() == 0 || (!txtBalance.getText().matches("^\\d{0,8}(\\.\\d{1,4})?$"))) {
            JOptionPane.showMessageDialog(this, "Please Enter Correct  Account Number");
            return false;
        }
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        lblRoutingNumber = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtRoutingNumber = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Create Account");

        lblAccountNumber.setText("Account Number : ");

        lblRoutingNumber.setText("Routing Number : ");

        lblBankName.setText("Bank Name :");

        lblBalance.setText("Balance : ");

        txtRoutingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoutingNumberActionPerformed(evt);
            }
        });

        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });

        btnCreate.setText("Create Account");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccountNumber)
                    .addComponent(lblRoutingNumber)
                    .addComponent(lblBankName)
                    .addComponent(lblBalance))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtBankName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtRoutingNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAccountNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtBalance))
                    .addComponent(btnCreate))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBalance, lblBankName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNumber)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAccountNumber, lblBalance, lblBankName, lblRoutingNumber, txtAccountNumber, txtBalance, txtBankName, txtRoutingNumber});

    }// </editor-fold>//GEN-END:initComponents

    /*private boolean routingNoPatternCorrect(){
        
        Pattern p = Pattern.compile("\\d{9}");
        Matcher m = p.matcher(txtRoutingNumber.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean AccountNoPatternCorrect(){
        
        Pattern p = Pattern.compile("^[0-9]{9,18}$");
        Matcher m = p.matcher(txtAccountNumber.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean bankNamePatternCorrect(){
        
        Pattern p = Pattern.compile("^[a-zA-Z\\s]{1,}$");
        Matcher m = p.matcher(txtBankName.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean bankBalancePatternCorrect(){
        
        Pattern p = Pattern.compile("^\\d{0,8}(\\.\\d{1,4})?$");
        Matcher m = p.matcher(txtBalance.getText());
        boolean b = m.matches();
        return b;
    }*/
    
    
    private void txtRoutingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoutingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoutingNumberActionPerformed

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalanceActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String routingNumber = txtRoutingNumber.getText();
        String accountNumber = txtAccountNumber.getText();
        String bankName = txtBankName.getText();
        int balance = Integer.parseInt(txtBalance.getText());
        
        /*if(routingNumber.equals("") || routingNumber == null){
            JOptionPane.showMessageDialog(null, "Routing Number cannot be empty!");
            return;
        }
        
        if(accountNumber.equals("") || accountNumber == null){
            JOptionPane.showMessageDialog(null, "Account Number cannot be empty!");
            return;
        }      
        
        if(bankName.equals("") || bankName == null){
            JOptionPane.showMessageDialog(null, "Bank Name cannot be empty!");
            return;
        }   
        
        
        if(!routingNoPatternCorrect()){
            JOptionPane.showMessageDialog(userProcessContainer, "Routing Number should always be a 9-digit number.");
            return;
        }
        
        if(!AccountNoPatternCorrect()){
            JOptionPane.showMessageDialog(userProcessContainer, "Account Number should always be a number between 9 to 18-digit number.");
            return;
        }        
        
        if(!bankNamePatternCorrect()){
            JOptionPane.showMessageDialog(userProcessContainer, "Bank Name should not have special characters.");
            return;
        }    */ 
        if(validateData()){
        Account account = accountDirectory.addAccount();
        account.setRoutingNumber(routingNumber);
        account.setAcountNumber(accountNumber);
        account.setBankName(bankName);
        account.setBalance(balance);
        
        JOptionPane.showMessageDialog(null, "Account successfully created");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables
}
