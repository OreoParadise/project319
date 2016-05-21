/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import view.BillTable;

/**
 *
 * @author m
 */
public class BillTable_Controller extends JFrame {
    
    private BillTable billtable;
    Image imgoff;
    Image imgon;
    
    public BillTable_Controller() {
        billtable = new BillTable();
        imgoff = new ImageIcon(this.getClass().getResource("/view/Icon/Error.png")).getImage();
        imgon = new ImageIcon(this.getClass().getResource("/view/Icon/Check.png")).getImage();
        billtable.setClickedTable1(new MouseAction());
        billtable.setClickedTable2(new MouseAction());
        billtable.setClickedTable3(new MouseAction());
        billtable.setClickedTable4(new MouseAction());
        billtable.setClickedTable5(new MouseAction());
        billtable.setClickedTable6(new MouseAction());
        billtable.setClickedTable7(new MouseAction());
        billtable.setVisible(true);
    }
    
    public static void main(String[] args) {
        new BillTable_Controller();
    }
    
    //methods for declaring what to do when each table button is clicked
    private void TableMouseClicked(MouseEvent evt) {
        JToggleButton tableButton = (JToggleButton)evt.getSource();
        if(tableButton.isSelected()){
            tableButton.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            tableButton.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    
    private class MouseAction extends MouseAdapter {
        public void mouseClicked(MouseEvent evt){
            TableMouseClicked(evt);
        }
    }
   
}
