/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
        receipt.setClickedButton(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                checkBillButtonActionPerformed(e);
            }
        });
        receipt.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Receipt_Controller();
    }
    
    private void checkBillButtonActionPerformed(MouseEvent e) {
        dispose();
        Receipt_Controller rc = new Receipt_Controller();
    }
}
