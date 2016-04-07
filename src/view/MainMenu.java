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
 * @author JamesP
 */
public class MainMenu extends JFrame {

    /**
     * Creates new form Function1
     */
    private JButton backlogButton; //rename from backlog
    private JButton billingButton; //rename from billing
    private JButton queuingButton; //rename from jButton2
    private JLabel restaurantTitle; //rename from jLabel1
    
    public MainMenu() {
        initComponents();
    }
    
    private void initComponents() {

        restaurantTitle = new JLabel();
        queuingButton = new JButton();
        billingButton = new JButton();
        backlogButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        restaurantTitle.setFont(new Font("TH Charm of AU", 0, 36)); // NOI18N
        restaurantTitle.setHorizontalAlignment(SwingConstants.CENTER);
        restaurantTitle.setText("Restaurant Management System");
        restaurantTitle.setCursor(new Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        queuingButton.setText("Queuing");
        /*queuingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //queuingButtonActionPerformed(evt);
            }
        });*/

        billingButton.setText("Billing");
        /*billingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //billingButtonActionPerformed(evt);
            }
        });*/

        backlogButton.setText("Backlog");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(restaurantTitle, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
                    .addComponent(queuingButton, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                    .addComponent(billingButton, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                    .addComponent(backlogButton, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(restaurantTitle)
                .addGap(54, 54, 54)
                .addComponent(queuingButton)
                .addGap(42, 42, 42)
                .addComponent(billingButton)
                .addGap(42, 42, 42)
                .addComponent(backlogButton)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
    
    public String getRestaurantTitle(){
        return restaurantTitle.getText();
    }
}

