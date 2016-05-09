/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Backlog_Controller;
import controller.BillTable_Controller;
import controller.Queuing_Controller;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
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
    private JLabel MainMenuBG;
    private JLabel MainMenuTitle;
    private JButton backlogButton;
    private JButton billingButton;
    private JButton queuingButton;
    
    public MainMenu() {
        initComponents();
        
    }
    
    private void initComponents() {

        MainMenuTitle = new JLabel();
        billingButton = new JButton();
        backlogButton = new JButton();
        queuingButton = new JButton();
        MainMenuBG = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        //setLocationRelativeTo(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainMenuTitle.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        MainMenuTitle.setText("Restaurant Management System");
        getContentPane().add(MainMenuTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        billingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/billing.png"))); // NOI18N
        /*billingButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        billingButtonActionPerformed(evt);
        }
        });*/
        getContentPane().add(billingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 310, 40));
        
        
        backlogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/backlog.png"))); // NOI18N
        /* backlogButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        backlogButtonActionPerformed(evt);
        }
        });*/
        getContentPane().add(backlogButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 310, 40));
        
        queuingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/queuing.png"))); // NOI18N
        /*queuingButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        queuingButtonActionPerformed(evt);
        }
        });*/
        getContentPane().add(queuingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 310, 40));
        
        MainMenuBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/BG.png"))); // NOI18N
        getContentPane().add(MainMenuBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>
    
    /*private void billingButtonActionPerformed(ActionEvent evt) {
    dispose();
    BillTable_Controller billtable = new BillTable_Controller();
    
    }
    
    private void backlogButtonActionPerformed(ActionEvent evt) {
    dispose();
    Backlog_Controller backlog = new Backlog_Controller();
    
    }
    private void queuingButtonActionPerformed(ActionEvent evt) {
    dispose();
    Queuing_Controller queuing = new Queuing_Controller();
    
    }*/
    
    public void setClickedQueuing(MouseAdapter m){
    queuingButton.addMouseListener(m);
    }
    public void setClickedBilling(MouseAdapter m){
        billingButton.addMouseListener(m);
    }
    public void setClickedBacklog(MouseAdapter m){
    backlogButton.addMouseListener(m);
    }
    
    
    
    public String getMianMenuTitle(){
        return MainMenuTitle.getText();
    }
}

