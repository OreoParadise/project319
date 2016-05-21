/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.ConnectDB;
import view.Backlog;
import view.MainMenu;

/**
 *
 * @author Oriopun Jaja
 */
import model.Customer_Model;
import model.Food_Model;
public class Backlog_Controller extends JFrame{
    
    private Backlog backlog;
    private Food_Model foodModel;
    private Customer_Model custModel;
    private ConnectDB connectDB;
    
    
    private Customer_Model backlogData;
    
    public Backlog_Controller(){
        backlog = new Backlog();
        connectDB = new ConnectDB();
        foodModel = new Food_Model();
        custModel = new Customer_Model();
        connectDB.connect();
        showNumberOfCust();
        showPopFood();
        showRevenue();
        connectDB.disconnect();
        backlog.setClickedDone(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                doneButtonActionPerformed(e);
            }
        });
        
        
        backlog.setVisible(true);
    }
    
    public void showNumberOfCust(){
        JLabel noOfCusLabel = backlog.getCustomerNumberLabel();
        noOfCusLabel.setText(custModel.getNemberOfCust()+"");
    }
    public void showPopFood(){
        JLabel popFoodLabel = backlog.getPopFoodLabel();
        popFoodLabel.setText(foodModel.getPopFood()+"");
    }
    public void showRevenue(){
        JLabel revenueLabel = backlog.getRevenueLabel();
        //revenueLabel.setText("Hungry Man 9889");
    }
    
    
    public static void main(String[] args) {
        new Backlog_Controller();
    }    

    private void doneButtonActionPerformed(MouseEvent e) {
        dispose();
        //Backlog_Controller bc = new Backlog_Controller();
    }
    
}
