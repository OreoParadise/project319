/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
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
    
    
    private int buttonID = 1;
    public Order(){
        initComponents();
    }
    
    //Method for adding mouseListener to JButton classes of Food
    public void setFoodListener(MouseAdapter m){
         for(JButton food : myFood){
             food.addMouseListener(m);
         }
    }
    
    public void setClearListener(MouseAdapter m){
        clear.addMouseListener(m);
    }
    
    public void setDoneListener(MouseAdapter m){
        doneButton.addMouseListener(m);
    }
    
    
    //Method for getting button and add them as an element of arrayList
    private JButton getFoodButton(){
        JButton temp = new JButton();
        temp.setText(buttonID+"");
        buttonID++;
        myFood.add(temp);
        return temp;
    }
    
    public JLabel getPriceLabel(){
        return priceLabel;
    }
    public void setPriceLabel(String price){
        priceLabel.setText(price);
    }
    
    public JTable getOrderList(){
        return orderList;
    }
    
    private void initComponents() {

        myFood = new ArrayList<JButton>();      //ID
        bananaChoko = getFoodButton();          //1
        butterCake = getFoodButton();           //2
        candy = getFoodButton();                //3
        chocoIcecream = getFoodButton();        //4
        chocolateCake = getFoodButton();        //5
        donut = getFoodButton();                //6
        parfait = getFoodButton();              //7
        redVelvet = getFoodButton();            //8
        strawberryCake = getFoodButton();       //9
        strawberryIceCream = getFoodButton();   //10
        strawberryMousse = getFoodButton();     //11
        vanillaIceCream = getFoodButton();      //12
        cheese = getFoodButton();               //13
        frenchFried = getFoodButton();          //14
        friedEgg = getFoodButton();             //15
        hamberger = getFoodButton();            //16
        honey = getFoodButton();                //17
        hotdog = getFoodButton();               //18
        popcorn = getFoodButton();              //19
        rice = getFoodButton();                 //20
        sandWich = getFoodButton();             //21
        espresso = getFoodButton();             //22
        latte = getFoodButton();                //23
        milkShake = getFoodButton();            //24
        
        doneButton = new JButton();
        backButton1 = new JButton();
        clear = new JButton();
        
        totalPriceLabel = new JLabel();
        tableNoLabel1 = new JLabel();
        
        priceLabel = new JLabel();
        BG_Panel3 = new JPanel();  
        BG_Panel2 = new JPanel();
        orderListScroll = new JScrollPane();
        orderList = new JTable();
        BG_Panel1 = new JPanel();
        orderTitle = new JLabel();
        tableLabel = new JLabel();
        orderBG = new JLabel();
        background = new JLabel();
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalPriceLabel.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
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

        tableLabel.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        tableLabel.setText("Table No. ");
        getContentPane().add(tableLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 20));

        orderBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/Order.png"))); // NOI18N
        getContentPane().add(orderBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/BG.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }
    
    public JLabel getTableLabel(){
        return tableLabel;
    }
    
    public void setTableLabel(String in){
        tableLabel.setText(in);
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
    private JButton frenchFried;
    private JLabel background;
    private JLabel tableLabel;
    private JLabel orderBG;
    private JLabel priceLabel;
    private JPanel BG_Panel1;
    private JPanel BG_Panel2;
    private JPanel BG_Panel3;
    private JButton latte;
    private JButton milkShake;
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
    ArrayList<JButton> myFood;

}
