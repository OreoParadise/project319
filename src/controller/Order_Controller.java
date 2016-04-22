/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import view.Order;

/**
 *
 * @author m
 */
public class Order_Controller extends JFrame {
    
    private Order order;
    
    public Order_Controller() {
        order = new Order();
        order.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Order_Controller();
    }
    
}
