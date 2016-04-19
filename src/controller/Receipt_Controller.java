/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import view.Receipt;

/**
 *
 * @author Oriopun Jaja
 */
public class Receipt_Controller extends JFrame{
    private Receipt receipt;
    
    public Receipt_Controller(){
        receipt = new Receipt();
        receipt.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Receipt_Controller();
    }
}
