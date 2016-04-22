/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author m
 */
public class Order extends JFrame {
    
    
    private void initComponents() {

        coke = new JButton();
        pepsi = new JButton();
        cake = new JButton();
        cupcake = new JButton();
        spaghetti = new JButton();
        ramen = new JButton();
        orderListScroll = new JScrollPane();
        orderList = new JTable();
        clear = new JButton();
        priceLabel = new JLabel();
        back = new JButton();
        doneButton = new JButton();
        orderLabel = new JLabel();
        tableLabel = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coke.setIcon(new javax.swing.ImageIcon("C:\\Users\\JamesP\\Documents\\NetBeansProjects\\RestaurantProjectG6\\src\\restaurantprojectg6\\coke.png")); // NOI18N
        coke.setText("Coke");
        /*
        coke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeActionPerformed(evt);
            }
        });
        */

        pepsi.setIcon(new javax.swing.ImageIcon("C:\\Users\\JamesP\\Documents\\NetBeansProjects\\RestaurantProjectG6\\src\\restaurantprojectg6\\Pepsi.png")); // NOI18N
        pepsi.setText("pepsi");
        /*
        pepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiActionPerformed(evt);
            }
        });
        */

        cake.setIcon(new javax.swing.ImageIcon("C:\\Users\\JamesP\\Documents\\NetBeansProjects\\RestaurantProjectG6\\src\\restaurantprojectg6\\cake.png")); // NOI18N
        cake.setText("cake");
        /*
        cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cakeActionPerformed(evt);
            }
        });
        */

        cupcake.setIcon(new javax.swing.ImageIcon("C:\\Users\\JamesP\\Documents\\NetBeansProjects\\RestaurantProjectG6\\src\\restaurantprojectg6\\cupcake.png")); // NOI18N
        cupcake.setText("cupcake");
        /*
        cupcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupcakeActionPerformed(evt);
            }
        });
        */
                
        spaghetti.setIcon(new javax.swing.ImageIcon("C:\\Users\\JamesP\\Documents\\NetBeansProjects\\RestaurantProjectG6\\src\\restaurantprojectg6\\pasta.png")); // NOI18N
        spaghetti.setText(" Spaghetti");
        /*
        spaghetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaghettiActionPerformed(evt);
            }
        });
        */

        ramen.setIcon(new javax.swing.ImageIcon("C:\\Users\\JamesP\\Documents\\NetBeansProjects\\RestaurantProjectG6\\src\\restaurantprojectg6\\Ramen.png")); // NOI18N
        ramen.setText("Ramen");
        /*
        ramen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramenActionPerformed(evt);
            }
        });
        */

        orderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu", "Price"
            }
        ));
        orderListScroll.setViewportView(orderList);

        clear.setText("Clear");
        /*
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        */

        priceLabel.setText("Total price: ");

        back.setText("Back");

        doneButton.setText("Done");
        /*
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        */
                
        orderLabel.setFont(new java.awt.Font("TH Charm of AU", 0, 48)); // NOI18N
        orderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderLabel.setText("Order");
        orderLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tableLabel.setText("Table: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doneButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(coke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ramen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pepsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spaghetti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cupcake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tableLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderListScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(orderLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderLabel)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(priceLabel)
                        .addGap(18, 18, 18)
                        .addComponent(clear))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableLabel)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pepsi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coke, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cupcake)
                            .addComponent(cake, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ramen, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spaghetti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(doneButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton back;
    private javax.swing.JButton cake;
    private javax.swing.JButton clear;
    private javax.swing.JButton coke;
    private javax.swing.JButton cupcake;
    private javax.swing.JButton doneButton;
    private javax.swing.JButton ramen;
    private javax.swing.JButton spaghetti;
    private javax.swing.JButton pepsi;
    private javax.swing.JLabel orderLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel tableLabel;
    private javax.swing.JScrollPane orderListScroll;
    private javax.swing.JTable orderList;

}
