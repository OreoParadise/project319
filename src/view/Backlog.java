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
public class Backlog extends JFrame{
    
    private JLabel backlogTitle;
    private JLabel noOfCusLabel;
    private JLabel revenueLabel;
    private JLabel popFoodLabel;
    private JButton doneButton;
    
    public Backlog() {
        initComponents();
    }
    
    private void initComponents() {

        backlogTitle = new JLabel();
        noOfCusLabel= new JLabel();
        revenueLabel = new JLabel();
        popFoodLabel = new JLabel();
        doneButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        backlogTitle.setFont(new Font("TH Charm of AU", 0, 36)); // NOI18N
        backlogTitle.setHorizontalAlignment(SwingConstants.CENTER);
        backlogTitle.setText("Backlog");
        backlogTitle.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        noOfCusLabel.setText("Number of Customer");
        /*noOfCusLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //noOfCusLabelActionPerformed(evt);
            }
        });*/

        revenueLabel.setText("Revenue");
        /*revenueLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //revenueLabelActionPerformed(evt);
            }
        });*/

        popFoodLabel.setText("Popular Food");
        /*popFoodLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //popFoodLabelActionPerformed(evt);
            }
        });*/
        
        doneButton.setText("DONE");
        /*doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //doneButtonActionPerformed(evt);
            }
        });*/
        

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(backlogTitle, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfCusLabel, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                    .addComponent(revenueLabel, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                    .addComponent(popFoodLabel, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                    .addComponent(doneButton, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(backlogTitle)
                .addGap(54, 54, 54)
                .addComponent(noOfCusLabel)
                .addGap(42, 42, 42)
                .addComponent(revenueLabel)
                .addGap(42, 42, 42)
                .addComponent(popFoodLabel)
                .addGap(54, 54, 54)
                .addComponent(doneButton)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
    
    public String getBacklogTitle(){
        return backlogTitle.getText();
    }
    
    
    
}

