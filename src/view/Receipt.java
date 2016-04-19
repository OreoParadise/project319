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
    
    private JLabel receiptTitle;
    private JLabel cusNameLabel;
    private JLabel tableNoLabel;
    private JLabel totalPriceLabel;
    private JButton checkBillLabel;
    
    public Receipt() {
        initComponents();
    }
    
    private void initComponents() {

        receiptTitle = new JLabel();
        cusNameLabel= new JLabel();
        tableNoLabel = new JLabel();
        totalPriceLabel = new JLabel();
        checkBillLabel = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        receiptTitle.setFont(new Font("TH Charm of AU", 0, 36)); // NOI18N
        receiptTitle.setHorizontalAlignment(SwingConstants.CENTER);
        receiptTitle.setText("Receipt");
        receiptTitle.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cusNameLabel.setText("Customer Name: ");
        /*cusNameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //cusNameLabelActionPerformed(evt);
            }
        });*/

        tableNoLabel.setText("Table No.");
        /*tableNoLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //tableNoLabelActionPerformed(evt);
            }
        });*/

        totalPriceLabel.setText("Total Price: ");
        /*totalPriceLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //totalPriceLabelActionPerformed(evt);
            }
        });*/
        
        checkBillLabel.setText("Check Bill");
        /*checkBillLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //checkBillLabelActionPerformed(evt);
            }
        });*/
        

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(receiptTitle, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cusNameLabel, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableNoLabel, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPriceLabel, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBillLabel, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(receiptTitle)
                .addGap(54, 54, 54)
                .addComponent(cusNameLabel)
                .addGap(42, 42, 42)
                .addComponent(tableNoLabel)
                .addGap(42, 42, 42)
                .addComponent(totalPriceLabel)
                .addGap(54, 54, 54)
                .addComponent(checkBillLabel)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
    
    public String getBacklogTitle(){
        return receiptTitle.getText();
    }
    
}
