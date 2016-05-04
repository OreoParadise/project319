/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author m
 */
public class BillTable extends JFrame {
    
    public BillTable(){
        initComponents();
    }
    
    private void initComponents() {

    Table3 = new JToggleButton();
    Table2 = new JToggleButton();
    Table5 = new JToggleButton();
    Table1 = new JToggleButton();
    Table4 = new JToggleButton();
    Table6 = new JToggleButton();
    Table7 = new JToggleButton();
    doneButton = new JButton();
    jLabel2 = new JLabel();

   setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table7.setBackground(new java.awt.Color(153, 51, 0));
        Table7.setForeground(new java.awt.Color(153, 51, 0));
        Table7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Error.png"))); // NOI18N
        /* Table7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        Table7ActionPerformed(evt);
        }
        });*/
        getContentPane().add(Table7, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 388, 30, 30));
        
        Table6.setBackground(new java.awt.Color(153, 51, 0));
        Table6.setForeground(new java.awt.Color(153, 51, 0));
        Table6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Error.png"))); // NOI18N
        /*Table6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        Table6ActionPerformed(evt);
        }
        });*/
        getContentPane().add(Table6, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 402, 30, 30));

        Table5.setBackground(new java.awt.Color(153, 51, 0));
        Table5.setForeground(new java.awt.Color(153, 51, 0));
        Table5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Error.png"))); // NOI18N
        /* Table5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        Table5ActionPerformed(evt);
        }
        });*/
        getContentPane().add(Table5, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 387, 30, 30));

        Table4.setBackground(new java.awt.Color(153, 51, 0));
        Table4.setForeground(new java.awt.Color(153, 51, 0));
        Table4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view//Error.png"))); // NOI18N
        /*Table4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        Table4ActionPerformed(evt);
        }
        });*/
        getContentPane().add(Table4, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 329, 30, 30));

        Table3.setBackground(new java.awt.Color(153, 51, 0));
        Table3.setForeground(new java.awt.Color(153, 51, 0));
        Table3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Error.png"))); // NOI18N
        /*Table3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        Table3ActionPerformed(evt);
        }
        });*/
        getContentPane().add(Table3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 288, 30, 30));

        Table1.setBackground(new java.awt.Color(153, 51, 0));
        Table1.setForeground(new java.awt.Color(153, 51, 0));
        Table1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Error.png"))); // NOI18N
        /*Table1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        Table1ActionPerformed(evt);
        }
        });*/
        getContentPane().add(Table1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 288, 30, 30));

        Table2.setBackground(new java.awt.Color(153, 51, 0));
        Table2.setForeground(new java.awt.Color(153, 51, 0));
        Table2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Error.png"))); // NOI18N
        /* Table2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        Table2ActionPerformed(evt);
        }
        });*/
        getContentPane().add(Table2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 262, 30, 30));

        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/done.png"))); // NOI18N
        /*doneButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        doneButtonActionPerformed(evt);
        }
        });*/
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 140, 40));
        
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("choose table to check bill");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, 40));
        
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Map.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/BG.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    
    }
    //Method for clicked event in table toggle buttons
    /*public void setClickedTable1(MouseAdapter m){
    Table1.addMouseListener(m);
    }
    public void setClickedTable2(MouseAdapter m){
    Table2.addMouseListener(m);
    }
    public void setClickedTable3(MouseAdapter m){
    Table3.addMouseListener(m);
    }
    public void setClickedTable4(MouseAdapter m){
    Table4.addMouseListener(m);
    }
    public void setClickedTable5(MouseAdapter m){
    Table5.addMouseListener(m);
    }
    public void setClickedTable6(MouseAdapter m){
    Table6.addMouseListener(m);
    }
    public void setClickedTable7(MouseAdapter m){
    Table7.addMouseListener(m);
    }    */
   
    // Variables declaration - do not modify                     
    private JToggleButton Table1;
    private JToggleButton Table2;
    private JToggleButton Table3;
    private JToggleButton Table4;
    private JToggleButton Table5;
    private JToggleButton Table6;
    private JToggleButton Table7;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
}