/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author m
 */
public class BillTable extends JFrame {
    private JLabel BillTableMap;
    private JToggleButton tableNumber;
    private JButton doneButton;
    
    private void initComponents() {

    Table3 = new javax.swing.JToggleButton();
    Table2 = new javax.swing.JToggleButton();
    Table5 = new javax.swing.JToggleButton();
    Table1 = new javax.swing.JToggleButton();
    Table12 = new javax.swing.JToggleButton();
    Table4 = new javax.swing.JToggleButton();
    Table6 = new javax.swing.JToggleButton();
    Table7 = new javax.swing.JToggleButton();
    Table8 = new javax.swing.JToggleButton();
    Table9 = new javax.swing.JToggleButton();
    Table10 = new javax.swing.JToggleButton();
    Table11 = new javax.swing.JToggleButton();
    doneButton = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    Table3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table3MouseClicked(evt);
        }
    });
    */

    Table2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table2MouseClicked(evt);
        }
    });
    */

    Table5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table5.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table5MouseClicked(evt);
        }
    });
    */

    Table1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Check.png"))); // NOI18N
    /*
    Table1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table1MouseClicked(evt);
        }
    });
    */

    Table12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table12.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table12MouseClicked(evt);
        }
    });
    */
    
    Table4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table4MouseClicked(evt);
        }
    });
    */

    Table6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table6.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table6MouseClicked(evt);
        }
    });
    */

    Table7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table7.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table7MouseClicked(evt);
        }
    });
    */

    Table8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table8.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table8MouseClicked(evt);
        }
    });
    */

    Table9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table9.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table9MouseClicked(evt);
        }
    });
    */

    Table10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table10.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table10MouseClicked(evt);
        }
    });
    */

    Table11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
    /*
    Table11.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            Table11MouseClicked(evt);
        }
    });
    */

    doneButton.setBackground(new java.awt.Color(255, 204, 204));
    doneButton.setForeground(new java.awt.Color(51, 51, 51));
    doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Girl.png"))); // NOI18N
    doneButton.setText("DONE");
    doneButton.setToolTipText("");
    /*
    doneButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            doneButtonActionPerformed(evt);
        }
    });
    */

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/R.jpg"))); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 628, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Table1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(Table6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Table9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Table3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Table5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Table7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Table10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Table12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(Table11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(Table4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(Table8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 542, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(Table1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Table6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Table9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(Table3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Table5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Table7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Table10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Table12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(Table11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(Table2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(Table4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(Table8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)))
    );

    pack();
    
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton Table1;
    private javax.swing.JToggleButton Table10;
    private javax.swing.JToggleButton Table11;
    private javax.swing.JToggleButton Table12;
    private javax.swing.JToggleButton Table2;
    private javax.swing.JToggleButton Table3;
    private javax.swing.JToggleButton Table4;
    private javax.swing.JToggleButton Table5;
    private javax.swing.JToggleButton Table6;
    private javax.swing.JToggleButton Table7;
    private javax.swing.JToggleButton Table8;
    private javax.swing.JToggleButton Table9;
    private javax.swing.JLabel jLabel2;
}
 