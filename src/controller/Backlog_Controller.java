/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import view.Backlog;
import view.MainMenu;

/**
 *
 * @author Oriopun Jaja
 */
public class Backlog_Controller extends JFrame{
    
    
    private Backlog backlog;
    
    public Backlog_Controller(){
        backlog = new Backlog();
        backlog.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Backlog_Controller();
    }
    

}
