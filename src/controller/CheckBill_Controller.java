/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import view.CheckBill;

/**
 *
 * @author JamesP
 */
public class CheckBill_Controller extends JFrame {
    private CheckBill cb;
    
    public CheckBill_Controller(){
        cb = new CheckBill();
        cb.setVisible(true);
    }
    
    public static void main(String args[]){
        new CheckBill_Controller();
    }
}
