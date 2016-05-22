/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.Order;
import model.ConnectDB;
import model.Food_Model;
import model.Order_Model;

/**
 *
 * @author m
 */
public class Order_Controller extends JFrame {
    
    private final Order order;
    private ConnectDB connectDB;
    private Food_Model foodDAO;
    private int foodNumber = 1;
    private double totalPrice = 0;
    private double foodPrice;
    public static int tableNo;
    private String foodName = "";
    private String foodID;
    private Order_Model orderDAO;
    private final ArrayList<String> orderHistory;
    JTable tableOrder;
    JLabel price;
    
    public Order_Controller() {
        order = new Order();
        foodDAO = new Food_Model();
        orderDAO = new Order_Model();
        orderHistory = new ArrayList<String>();
        tableOrder = order.getOrderList();
        price = order.getPriceLabel();
        tableNo = Queuing_Controller.tableNo;
        order.setTableLabel("Table No. " + tableNo);
        order.setFoodListener(new MouseAction());
        order.setClearListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                clearTablePerformed(evt);
            }
        });
        order.setDoneListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt){
                doneActionPerformed(evt);
            }
        });
        order.setVisible(true);
    }
    
    
    private void buttonActionPerformed(MouseEvent evt){
        JButton btn = (JButton)evt.getSource();
        connectDB.connect();
        foodID = btn.getText();
        orderHistory.add(foodID);
        //Now compare foodID with database to get foodName
        foodName = foodDAO.getFoodName(Integer.parseInt(foodID));
        foodPrice = foodDAO.getFoodPrice(Integer.parseInt(foodID));
        Object[] row = {foodNumber, foodName, foodPrice};
        DefaultTableModel myTable = (DefaultTableModel) tableOrder.getModel();
        myTable.addRow(row);
        foodNumber++;
        order.setPriceLabel("Total Price: " + (totalPrice += foodPrice));
        connectDB.disconnect();
    }
    
    private void clearTablePerformed(MouseEvent evt){
        DefaultTableModel model = (DefaultTableModel) tableOrder.getModel();
        model.setRowCount(0);
        order.setPriceLabel("Total Price: " + 0);
        orderHistory.clear();
        totalPrice = 0;
        foodNumber = 1;
    }
    
    private void doneActionPerformed(MouseEvent evt){
        //Use the data in table and add them into the database
        connectDB.connect();
        for(String id: orderHistory){
            System.out.println( "TableNo = " + tableNo + " ID = " + id);
            orderDAO.insertOrderHistory(tableNo, id);
        }
        connectDB.disconnect();
        JOptionPane.showMessageDialog(null, "Order Successfully! :)");
        order.dispose();
    }
    
    private class MouseAction extends MouseAdapter{
        public void mouseClicked(MouseEvent evt){
            buttonActionPerformed(evt);
        }   
    }
    
    
}
