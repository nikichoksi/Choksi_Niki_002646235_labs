/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Business.Account;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Niki Choksi
 */
public class ViewAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAccountJPanel
     */
    private JPanel userProcessContainer;
    private Account account;
    

    ViewAccountJPanel(JPanel userProcessContainer, Account account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        
        populateAccountDetails();
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true );
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

        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblRoutingNumber = new javax.swing.JLabel();
        txtRoutingNumber = new javax.swing.JTextField();
        lblAccountNumber = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("View Account");

        lblRoutingNumber.setText("Routing Number : ");

        txtRoutingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoutingNumberActionPerformed(evt);
            }
        });

        lblAccountNumber.setText("Account Number : ");

        lblBankName.setText("Bank Name :");

        btnSave.setText("Save ");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRoutingNumber)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBankName)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAccountNumber)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(284, 284, 284))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAccountNumber, lblBankName, lblRoutingNumber});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccountNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBankName))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(383, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSave, btnUpdate});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAccountNumber, lblBankName, lblRoutingNumber});

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
    }*/

    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        Component component = userProcessContainer.getComponent(userProcessContainer.getComponentCount() - 1);
         if(component instanceof ManageAccountJPanel panel){
                panel.populateTable();
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void toManageAccountJPanel(){
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();

        Component[] comps = userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageAccountJPanel panel){
                panel.populateTable();
            }
        }

        layout.previous(userProcessContainer);
    }
    
    private void txtRoutingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoutingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoutingNumberActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtRoutingNumber.setEditable(true);
        txtAccountNumber.setEditable(true);
        txtBankName.setEditable(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(validateData()){
        String routingNumber = txtRoutingNumber.getText();
        String accountNumber = txtAccountNumber.getText();
        String bankName = txtBankName.getText();
        
        account.setRoutingNumber(routingNumber); 
        account.setAcountNumber(accountNumber);
        account.setBankName(bankName);
       
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
         
        JOptionPane.showMessageDialog(null, "Account Updated Successfully");
        toManageAccountJPanel();
        }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables

    private void populateAccountDetails() {
        txtRoutingNumber.setText(account.getRoutingNumber());
        txtAccountNumber.setText(account.getAcountNumber());
        txtBankName.setText(account.getBankName());
    }
}
