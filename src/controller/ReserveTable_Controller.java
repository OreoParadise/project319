/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author JamesP
 */
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import view.BillTable;
public class ReserveTable_Controller extends JFrame{
    private BillTable table;
    private Image imgoff;
    private Image imgon;
    public static int currentTable;
    
    public ReserveTable_Controller(){
        table = new BillTable();
        imgoff = new ImageIcon(this.getClass().getResource("/view/Icon/Error.png")).getImage();
        imgon = new ImageIcon(this.getClass().getResource("/view/Icon/Check.png")).getImage();
        table.setClickedTable1(new MouseAction());
        table.setClickedTable2(new MouseAction());
        table.setClickedTable3(new MouseAction());
        table.setClickedTable4(new MouseAction());
        table.setClickedTable5(new MouseAction());
        table.setClickedTable6(new MouseAction());
        table.setClickedTable7(new MouseAction());
        table.setDoneListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                doneActionPerformed(evt);
            }
        });
        table.setVisible(true);
    }
    
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
    
    private void doneActionPerformed(MouseEvent evt){
        dispose();
        Order_Controller order = new Order_Controller();
    }
    
    
    
    private class MouseAction extends MouseAdapter {
        public void mouseClicked(MouseEvent evt){
            TableMouseClicked(evt);
        }
    }
    
}
