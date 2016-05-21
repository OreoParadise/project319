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

/**
 *
 * @author JamesP
 */
public class Queuing_Controller extends JFrame{
    private Queuing q;
    private String customerName, phoneNumber, queuingDate, queuingTime;
    public static int tableNo;
    
    public Queuing_Controller(){
        q = new Queuing();
        q.setClickedQueuing(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                callChooseTable(evt);
            }
        });
        q.setVisible(true);
    }
    
    public static void main(String args[]){
        new Queuing_Controller();
        System.out.println("Table No. = " + tableNo);
    }
    
    public void insertToDB(){
        customerName = q.getCustomerName();
        phoneNumber = q.getPhoneNumber();
        queuingDate = q.getQueuingDate();
        queuingTime = q.getQueuingTime();
    }
    
    public void callChooseTable(MouseEvent evt){
        ReserveTable_Controller b = new ReserveTable_Controller();
    }
}
