/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import view.checkBill;

/**
 *
 * @author JamesP
 */
public class checkBill_Controller extends JFrame {
    private checkBill cb;
    
    public checkBill_Controller(){
        cb = new checkBill();
        cb.setVisible(true);
    }
    
    public static void main(String args[]){
        new checkBill_Controller();
    }
}
