/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import view.Backlog;
import view.MainMenu;

/**
 *
 * @author Oriopun Jaja
 */
import model.Customer_Model;
public class Backlog_Controller extends JFrame{
    
    private Backlog backlog;
    
   private Customer_Model backlogData;
    
    public Backlog_Controller(){
        backlog = new Backlog();
        backlog.setClickedDone(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                doneButtonActionPerformed(e);
            }
        });
        
        
        backlog.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new Backlog_Controller();
    }    

    private void doneButtonActionPerformed(MouseEvent e) {
        dispose();
        //Backlog_Controller bc = new Backlog_Controller();
    }
    
}
