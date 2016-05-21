/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Button;
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
    private int foodNumber = 1;
    private int totalPrice = 0;
    private String foodName = "";
    JTable tableOrder;
    JLabel price;
    
    public Order_Controller() {
        order = new Order();
        tableOrder = order.getOrderList();
        price = order.getPriceLabel();
        order.setFoodListener(new MouseAction());
        order.setClearListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                clearTablePerformed(evt);
            }
        });
        order.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Order_Controller();
    }
    
    
    private void buttonActionPerformed(MouseEvent evt){
        Object[] row = {foodNumber, foodName,20};
        DefaultTableModel myTable = (DefaultTableModel) tableOrder.getModel();
        myTable.addRow(row);
        foodNumber++;
        order.setPriceLabel("Total Price: " + (totalPrice += 20));
    }
    
    private void clearTablePerformed(MouseEvent evt){
        DefaultTableModel model = (DefaultTableModel) tableOrder.getModel();
        model.setRowCount(0);
        order.setPriceLabel("Total Price: " + 0);
    }
    
    private void doneActionPerformed(MouseEvent evt){
        //Use the data in table and add them into the database
        order.dispose();
    }
    
    private class MouseAction extends MouseAdapter{
        public void mouseClicked(MouseEvent evt){
            buttonActionPerformed(evt);
        }   
    }
    
    
}
