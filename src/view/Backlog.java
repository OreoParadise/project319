/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
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
    private JLabel BG;
    
    
    
    public Backlog() {
        initComponents();
        setSize(915,736);
        
    }
   
    
    private void initComponents(){
        doneButton = new JButton();
        popFoodLabel = new JLabel();
        noOfCusLabel = new JLabel();
        revenueLabel = new JLabel();
        backlogTitle = new JLabel();
        BG = new JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doneButton.setIcon(new javax.swing.ImageIcon(("C:\\Users\\Oriopun Jaja\\Desktop\\OreoParadise\\project319\\src\\view\\done.png"))); // NOI18N
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 140, 40));

        popFoodLabel.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        popFoodLabel.setText("Popular food");
        getContentPane().add(popFoodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        noOfCusLabel.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        noOfCusLabel.setText("Number of customer");
        getContentPane().add(noOfCusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        revenueLabel.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        revenueLabel.setText("Revenue");
        getContentPane().add(revenueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        backlogTitle.setFont(new java.awt.Font("Times New Roman", 3, 70)); // NOI18N
        backlogTitle.setText("Backlog");
        getContentPane().add(backlogTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Oriopun Jaja\\Desktop\\OreoParadise\\project319\\src\\view\\BG.png")); // NOI18N
        BG.setText("BG");
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 899, -1));

        pack();
    }
    
    
    
    
    public String getBacklogTitle(){
        return backlogTitle.getText();
    }
    
    
    
}

