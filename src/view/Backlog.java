/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import model.ConnectDB;
import model.Customer_Model;
import model.Food_Model;

/**
 *
 * @author Oriopun Jaja
 */
public class Backlog extends JFrame  {
    
    private JLabel backlogTitle;
    private JLabel JLabel2;
    private JLabel JLabel3;
    private JLabel JLabel1;
    private JLabel popFoodLabel;
    private JLabel noOfCusLabel;
    private JLabel revenueLabel;
    private JButton doneButton;
    private JLabel BG;
    

  
    
    
    
    public Backlog() {
        initComponents();
           
    }
   
    
    private void initComponents(){
        doneButton = new JButton();
        JLabel1 = new JLabel();
        JLabel2 = new JLabel();
        JLabel3 = new JLabel();
        noOfCusLabel = new JLabel();
        revenueLabel = new JLabel();
        popFoodLabel = new JLabel();
        backlogTitle = new JLabel();
        BG = new JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/done.png"))); // NOI18N
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 140, 40));

        JLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        JLabel1.setText("Popular food");
        getContentPane().add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        JLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        JLabel2.setText("Number of customer");
        getContentPane().add(JLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        JLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        JLabel3.setText("Revenue");
        getContentPane().add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));
        
        popFoodLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        getContentPane().add(popFoodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 120, 40));

        noOfCusLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        getContentPane().add(noOfCusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 120, 40));

        revenueLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        getContentPane().add(revenueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 120, 40));

        backlogTitle.setFont(new java.awt.Font("Times New Roman", 3, 70)); // NOI18N
        backlogTitle.setText("Backlog");
        getContentPane().add(backlogTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/BG.png"))); // NOI18N
        BG.setText("BG");
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 899, -1));

        pack();
    }
    
    // Mouse listener
    public void setClickedDone(MouseAdapter m) {
        doneButton.addMouseListener(m);
    }
    
    public JLabel getPopFoodLabel(){
        return popFoodLabel;
    }
    
    public JLabel getCustomerNumberLabel(){
        return noOfCusLabel;
    }
    
    public JLabel getRevenueLabel(){
        return revenueLabel;
    }
    
   
    
    public String getBacklogTitle(){
        return backlogTitle.getText();
    }
    
    
    
}

