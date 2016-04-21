/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import view.BillTable;

/**
 *
 * @author m
 */
public class BillTable_Controller extends JFrame {
    
    private BillTable billtable;
    
    public BillTable_Controller() {
        billtable = new BillTable();
        billtable.setVisible(true);
    }
    
    public static void main(String[] args) {
        new BillTable_Controller();
    }
    
}
