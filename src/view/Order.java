/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author m
 */
public class Order extends JFrame {
    
    public Order(){
        initComponents();
    }
    
    private void initComponents() {

        totalPriceLabel = new javax.swing.JLabel();
        tableNoLabel1 = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        JLabel priceLabel = new javax.swing.JLabel();
        JPanel BG_Panel3 = new javax.swing.JPanel();
        espresso = new javax.swing.JButton();
        latte = new javax.swing.JButton();
        JButton milkShake = new javax.swing.JButton();
        JPanel BG_Panel2 = new javax.swing.JPanel();
        cheese = new javax.swing.JButton();
        friedEgg = new javax.swing.JButton();
        JButton frenchFried = new javax.swing.JButton();
        sandWich = new javax.swing.JButton();
        honey = new javax.swing.JButton();
        hamberger = new javax.swing.JButton();
        rice = new javax.swing.JButton();
        popcorn = new javax.swing.JButton();
        hotdog = new javax.swing.JButton();
        orderListScroll = new javax.swing.JScrollPane();
        orderList = new javax.swing.JTable();
        JPanel BG_Panel1 = new javax.swing.JPanel();
        bananaChoko = new javax.swing.JButton();
        butterCake = new javax.swing.JButton();
        candy = new javax.swing.JButton();
        donut = new javax.swing.JButton();
        chocolateCake = new javax.swing.JButton();
        chocoIcecream = new javax.swing.JButton();
        parfait = new javax.swing.JButton();
        redVelvet = new javax.swing.JButton();
        strawberryCake = new javax.swing.JButton();
        vanillaIceCream = new javax.swing.JButton();
        strawberryMousse = new javax.swing.JButton();
        strawberryIceCream = new javax.swing.JButton();
        orderTitle = new javax.swing.JLabel();
        JLabel TableLabel = new javax.swing.JLabel();
        JLabel orderBG = new javax.swing.JLabel();
        JLabel background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(totalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 532, 50, 20));

        tableNoLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(tableNoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 50, 20));

        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/doney.png"))); // NOI18N
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, 70, 25));

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/clear.png"))); // NOI18N
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 70, 25));

        backButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/back.png"))); // NOI18N
        getContentPane().add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 70, 25));

        priceLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        priceLabel.setText("Total price: ");
        getContentPane().add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        BG_Panel3.setBackground(new java.awt.Color(255, 255, 204));
        BG_Panel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        espresso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Beverage/Espresso.png"))); // NOI18N

        latte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Beverage/Latte.png"))); // NOI18N

        milkShake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Beverage/MikeShake.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(BG_Panel3);
        BG_Panel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(espresso, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(latte, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(milkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espresso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latte, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(milkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(BG_Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 200, 70));

        BG_Panel2.setBackground(new java.awt.Color(255, 255, 204));
        BG_Panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cheese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Food/Cheese.png"))); // NOI18N

        friedEgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Food/FriedEgg.png"))); // NOI18N

        frenchFried.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Food/Freshfried.png"))); // NOI18N

        sandWich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Food/SandWich.png"))); // NOI18N

        honey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Food/Honey.png"))); // NOI18N

        hamberger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Food/Hamberger.png"))); // NOI18N

        rice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Food/Rice.png"))); // NOI18N

        popcorn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Food/Popcorn.png"))); // NOI18N

        hotdog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Food/Hotdog.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(BG_Panel2);
        BG_Panel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hamberger, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(friedEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(honey, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(popcorn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frenchFried, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sandWich, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotdog, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(frenchFried, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sandWich, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hotdog, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(friedEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(honey, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(popcorn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hamberger, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rice, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(BG_Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 200, 170));

        orderList.setBackground(new java.awt.Color(255, 204, 204));
        orderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Menu", "Price"
            }
        ));
        orderListScroll.setViewportView(orderList);

        getContentPane().add(orderListScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 240, 240));

        BG_Panel1.setBackground(new java.awt.Color(255, 255, 204));
        BG_Panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bananaChoko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/BananaChoko.png"))); // NOI18N

        butterCake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/ButterCake.png"))); // NOI18N

        candy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/Candy.png"))); // NOI18N

        donut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/Donut.png"))); // NOI18N

        chocolateCake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/ChocolateCake.png"))); // NOI18N

        chocoIcecream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/ChocoIcecream.png"))); // NOI18N

        parfait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/Parfait.png"))); // NOI18N

        redVelvet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/RedVelvet.png"))); // NOI18N

        strawberryCake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/StrawberryCake.png"))); // NOI18N

        vanillaIceCream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/VanillaIceCream.png"))); // NOI18N

        strawberryMousse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/StrawberryMousse.png"))); // NOI18N

        strawberryIceCream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Dessert/StrawberryIceCream.png"))); // NOI18N

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG_Panel1);
        BG_Panel1.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addComponent(vanillaIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strawberryMousse, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strawberryIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bananaChoko, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chocoIcecream, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parfait, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butterCake, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redVelvet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(candy, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donut, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strawberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(candy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(donut, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strawberryCake, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(BGLayout.createSequentialGroup()
                            .addComponent(butterCake, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(chocolateCake, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(redVelvet, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BGLayout.createSequentialGroup()
                            .addComponent(bananaChoko, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(chocoIcecream, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(parfait, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(strawberryIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(strawberryMousse, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vanillaIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(BG_Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 200, 240));

        orderTitle.setFont(new java.awt.Font("Times New Roman", 3, 56)); // NOI18N
        orderTitle.setText("Order");
        getContentPane().add(orderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 150, 70));

        TableLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        TableLabel.setText("Table No. ");
        getContentPane().add(TableLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 20));

        orderBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/Order.png"))); // NOI18N
        getContentPane().add(orderBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/BG.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }
    
    // Variables declaration - do not modify                     
    private JButton backButton1;
    private JButton bananaChoko;
    private JButton butterCake;
    private JButton candy;
    private JButton cheese;
    private JButton chocoIcecream;
    private JButton chocolateCake;
    private JButton clear;
    private JButton doneButton;
    private JButton donut;
    private JButton espresso;
    private JButton friedEgg;
    private JButton hamberger;
    private JButton honey;
    private JButton hotdog;
    private JButton jButton31;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JButton latte;
    private JButton mikeShake;
    private JTable orderList;
    private JScrollPane orderListScroll;
    private JLabel orderTitle;
    private JButton parfait;
    private JButton popcorn;
    private JButton redVelvet;
    private JButton rice;
    private JButton sandWich;
    private JButton strawberryCake;
    private JButton strawberryIceCream;
    private JButton strawberryMousse;
    private JLabel tableNoLabel1;
    private JLabel totalPriceLabel;
    private JButton vanillaIceCream;

}
