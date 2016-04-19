/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JamesP
 * Refactored from Billing1.java
 */



public class checkBill extends JFrame {
    public checkBill(){
        initComponents();
    }
    
    private void initComponents() {

        billLabel = new javax.swing.JLabel();                  //changed name from jLabel1
        checkBillButton = new javax.swing.JButton();           //changed name from jButton1

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        billLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        billLabel.setText("Billing");

        checkBillButton.setText("Choose table to check bill");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(billLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(checkBillButton)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(billLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(checkBillButton)
                .addGap(75, 75, 75))
        );

        pack();
    }
    
    private JButton checkBillButton;
    private JLabel billLabel;
}
