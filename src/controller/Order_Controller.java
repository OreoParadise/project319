/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.Order;

/**
 *
 * @author m
 */
public class Order_Controller extends JFrame {
    
    private Order order;
    private int foodNumber = 0;
    private int totalPrice = 0;
    private String foodName = "";
    JTable tableOrder;
    JLabel price;
    
    public Order_Controller() {
        order = new Order();
        tableOrder = order.getOrderList();
        price = order.getPriceLabel();
        order.setFoodListener(new mouseAction());
        order.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Order_Controller();
    }
    
    private void findFoodName(){
        
    }
    
    private void buttonActionPerformed(MouseEvent evt){
        foodName = ""; // !!! 
        Object[] row = {foodNumber, foodName,20};
        DefaultTableModel myTable = (DefaultTableModel) tableOrder.getModel();
        myTable.addRow(row);
        foodNumber++;
        order.setPriceLabel("Total Price: " + (totalPrice += 20));
    }
    
    private class mouseAction extends MouseAdapter{
        public void mouseClicked(MouseEvent evt){
            buttonActionPerformed(evt);
        }   
    }
    
    
}
