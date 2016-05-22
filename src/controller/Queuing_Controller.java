/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import view.Queuing;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.ConnectDB;
import model.Customer_Model;

/**
 *
 * @author JamesP
 */
public class Queuing_Controller extends JFrame{
    private final Queuing q;
    private final ConnectDB db;
    private final Customer_Model customerDAO;
    private int customerID;
    private String customerName, phoneNumber, queuingDate, queuingTime;
    public static int tableNo;
    
    public Queuing_Controller(){
        q = new Queuing();
        db = new ConnectDB();
        customerDAO = new Customer_Model();
        q.setClickedQueuing(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                callChooseTable(evt);
            }
        });
        tableNo = ReserveTable_Controller.getCurrentTable();
        System.out.println("Table No. = " + tableNo);
        q.setDoneListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                insertToDB(evt);
                Order_Controller order = new Order_Controller();
            }
        });
        q.setVisible(true);
    }
    
    public void insertToDB(MouseEvent evt){
        db.connect();
        customerName = q.getCustomerName();
        phoneNumber = q.getPhoneNumber();
        queuingDate = q.getQueuingDate();
        queuingTime = q.getQueuingTime();
        customerDAO.insertCustomerInfo(customerName, phoneNumber);
        customerID = customerDAO.getCustomerID(customerName);
        System.out.println("Customer ID = " + customerID);
        customerDAO.insertReserveInfo(tableNo, customerID, queuingDate, queuingTime);
        db.disconnect();
    }
    
    public void callChooseTable(MouseEvent evt){
        ReserveTable_Controller b = new ReserveTable_Controller();
    }
}
