/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.ConnectDB;
import model.Customer_Model;
import model.Food_Model;
import model.ReserveTable_Model;

/**
 *
 * @author JamesP
 * Refactored from Queue1.java
 */
public class Queuing extends JFrame {
    
    private ReserveTable_Model reserveModel;
    private ConnectDB connectDB;
    
    public Queuing(){
        
        connectDB = new ConnectDB();
        reserveModel = new ReserveTable_Model();
        
            connectDB.connect();
            
            connectDB.disconnect();
        initComponents();
       // setLocationRelativeTo(null);
    }
    
    private void initComponents() {
        
        doneButton = new JButton();
        queuingTime = new JTextField();
        timeLabel = new JLabel();
        chooseTableButton = new JButton();
        queuingDate = new JTextField();
        customerName = new JTextField();
        phoneNumber = new JTextField();
        dateLabel = new JLabel();
        phoneNumLabel = new JLabel();
        custNameLabel = new JLabel();
        menuBackground = new JLabel();
        MainMenuTitle = new JLabel();
        QueuingBG = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/doney.png"))); // NOI18N
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 90, 30));

        queuingTime.setBackground(new java.awt.Color(255, 255, 153));
        queuingTime.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        getContentPane().add(queuingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 140, 30));

        timeLabel.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        timeLabel.setText("Queuing Time:");
        getContentPane().add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        chooseTableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/chooseTable.png"))); // NOI18N
        getContentPane().add(chooseTableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 170, 30));

        queuingDate.setBackground(new java.awt.Color(255, 255, 153));
        queuingDate.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        getContentPane().add(queuingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 140, 30));

        customerName.setBackground(new java.awt.Color(255, 255, 153));
        customerName.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        getContentPane().add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 140, 30));

        phoneNumber.setBackground(new java.awt.Color(255, 255, 153));
        phoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        getContentPane().add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 140, 30));

        dateLabel.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        dateLabel.setText("Queuing Date:");
        getContentPane().add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        phoneNumLabel.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        phoneNumLabel.setText("Phone Number:");
        getContentPane().add(phoneNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        custNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        custNameLabel.setText("Customer Name:");
        getContentPane().add(custNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        menuBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/reserve.png"))); // NOI18N
        getContentPane().add(menuBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        MainMenuTitle.setFont(new java.awt.Font("Times New Roman", 3, 56)); // NOI18N
        MainMenuTitle.setText("Queuing");
        getContentPane().add(MainMenuTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        QueuingBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/BG.png"))); // NOI18N
        getContentPane().add(QueuingBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>
     
    public void setClickedQueuing(MouseAdapter m){
        chooseTableButton.addMouseListener(m);
    }
    public String getCustomerName(){
        return customerName.getText();
    }
    public String getPhoneNumber(){
        return phoneNumber.getText();
    }
    public String getQueuingDate(){
        return queuingDate.getText();
    }
    public String getQueuingTime(){
        return queuingTime.getText();
    }
     
    // Variables declaration - do not modify                     
    private JLabel MainMenuTitle;
    private JLabel QueuingBG;
    private JLabel custNameLabel;
    private JTextField customerName;
    private JLabel dateLabel;
    private JButton chooseTableButton;
    private JLabel menuBackground;
    private JLabel phoneNumLabel;
    private JTextField phoneNumber;
    private JTextField queuingDate;
    private JTextField queuingTime;
    private JLabel timeLabel;
    private JButton doneButton;
    // End of variables declaration
}
