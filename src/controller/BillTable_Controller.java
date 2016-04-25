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
    Image imgoff = new ImageIcon(this.getClass().getResource("/restaurantprojectg6/Picture/Error.png")).getImage();
    Image imgon = new ImageIcon(this.getClass().getResource("/restaurantprojectg6/Picture/Check.png")).getImage();
    
    public BillTable_Controller() {
        billtable = new BillTable();
        billtable.setClickedTable1(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        billtable.setClickedTable2(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        billtable.setClickedTable3(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table3MouseClicked(evt);
            }
        });
        billtable.setClickedTable4(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table4MouseClicked(evt);
            }
        });
        billtable.setClickedTable5(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table5MouseClicked(evt);
            }
        });
        billtable.setClickedTable6(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table6MouseClicked(evt);
            }
        });
        billtable.setClickedTable7(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table7MouseClicked(evt);
            }
        });
        billtable.setClickedTable8(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table8MouseClicked(evt);
            }
        });
        billtable.setClickedTable9(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table9MouseClicked(evt);
            }
        });
        billtable.setClickedTable10(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table10MouseClicked(evt);
            }
        });
        billtable.setClickedTable11(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table11MouseClicked(evt);
            }
        });
        billtable.setClickedTable12(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt) {
                Table12MouseClicked(evt);
            }
        });
        billtable.setVisible(true);
    }
    
    public static void main(String[] args) {
        new BillTable_Controller();
    }
    
    //methods for declaring what to do when each table button is clicked
    private void Table1MouseClicked(MouseEvent evt) {                                    
        JToggleButton table1 = billtable.getTable1();
        if(table1.isSelected()){
            table1.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table1.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table2MouseClicked(MouseEvent evt) {                                    
        JToggleButton table2 = billtable.getTable2();
        if(table2.isSelected()){
            table2.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table2.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table3MouseClicked(MouseEvent evt) {                                    
        JToggleButton table3 = billtable.getTable3();
        if(table3.isSelected()){
            table3.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table3.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table4MouseClicked(MouseEvent evt) {                                    
        JToggleButton table4 = billtable.getTable4();
        if(table4.isSelected()){
            table4.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table4.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table5MouseClicked(MouseEvent evt) {                                    
        JToggleButton table5 = billtable.getTable5();
        if(table5.isSelected()){
            table5.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table5.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table6MouseClicked(MouseEvent evt) {                                    
        JToggleButton table6 = billtable.getTable6();
        if(table6.isSelected()){
            table6.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table6.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table7MouseClicked(MouseEvent evt) {                                    
        JToggleButton table7 = billtable.getTable7();
        if(table7.isSelected()){
            table7.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table7.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table8MouseClicked(MouseEvent evt) {                                    
        JToggleButton table8 = billtable.getTable8();
        if(table8.isSelected()){
            table8.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table8.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table9MouseClicked(MouseEvent evt){
        JToggleButton table9 = billtable.getTable9();
        if(table9.isSelected()){
            table9.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table9.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table10MouseClicked(MouseEvent evt){
        JToggleButton table10 = billtable.getTable10();
        if(table10.isSelected()){
            table10.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table10.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table11MouseClicked(MouseEvent evt){
        JToggleButton table11 = billtable.getTable11();
        if(table11.isSelected()){
            table11.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table11.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
    private void Table12MouseClicked(MouseEvent evt){
        JToggleButton table12 = billtable.getTable12();
        if(table12.isSelected()){
            table12.setIcon(new ImageIcon(imgoff));
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            table12.setIcon(new ImageIcon(imgon));
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
    }
   
}
