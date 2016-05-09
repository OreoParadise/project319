/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Oriopun Jaja
 */
public class Receipt extends JFrame{
    
    private JLabel TableNoLabel;
    private JButton checkBillButton;
    private JLabel cusNameLabel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel totalPriceLabel;
    private JLabel receiptTitle;
    
    
    public Receipt() {
        initComponents();
        
    }
    
    private void initComponents() {
        
        
        checkBillButton = new JButton();
        totalPriceLabel = new JLabel();
        TableNoLabel = new JLabel();
        cusNameLabel = new JLabel();
        jLabel7 = new JLabel();
        jLabel5 = new JLabel();
        jLabel4 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel1 = new JLabel();
        receiptTitle = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkBillButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/checkBill.png"))); // NOI18N
        getContentPane().add(checkBillButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 130, 40));

        totalPriceLabel.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        getContentPane().add(totalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 80, 20));

        TableNoLabel.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        getContentPane().add(TableNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 80, 20));

        cusNameLabel.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        getContentPane().add(cusNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 80, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setText("Total Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Table No.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Customer Name: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setText("Receipt");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/receipt.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/BG.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        pack();
    }// </editor-fold>
    
    
    
    public String getReceiptTitle(){
        return receiptTitle.getText();
    }
    
}
