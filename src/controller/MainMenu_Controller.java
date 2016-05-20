/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import restaurantprojectg6.Billing1;
import restaurantprojectg6.Queue1;
import view.MainMenu;

/**
 *
 * @author JamesP
 */
public class MainMenu_Controller extends JFrame{
    private MainMenu menu;
    
    public MainMenu_Controller(){
        menu = new MainMenu();
        menu.setClickedBacklog(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                backlogButtonActionPerformed(evt);                
            }
        });
        menu.setClickedBilling(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                billingButtonActionPerformed(evt);                
            }
        });
        menu.setClickedQueuing(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                queuingButtonActionPerformed(evt);                
            }
        });
        menu.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MainMenu_Controller();
    }
    
    private void billingButtonActionPerformed(MouseEvent evt) {
        dispose();
        BillTable_Controller billtable = new BillTable_Controller();
    }
    
    private void backlogButtonActionPerformed(MouseEvent evt) {
    dispose();
    Backlog_Controller backlog = new Backlog_Controller();
    
    }
    private void queuingButtonActionPerformed(MouseEvent evt) {
        dispose();
        Queuing_Controller queuing = new Queuing_Controller();
    }
}
    

