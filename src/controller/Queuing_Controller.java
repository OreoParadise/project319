/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import view.Queuing;

/**
 *
 * @author JamesP
 */
public class Queuing_Controller extends JFrame{
    private Queuing q;
    
    public Queuing_Controller(){
        q = new Queuing();
        q.setVisible(true);
    }
    
    public static void main(String args[]){
        new Queuing_Controller();
    }
}
