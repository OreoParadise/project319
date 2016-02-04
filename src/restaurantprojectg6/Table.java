/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantprojectg6;

import java.awt.Image;
import javax.swing.ImageIcon;
import edu.sit.cs.db.CSDbDelegate;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author pim
 */
public class Table extends javax.swing.JFrame {

    /**
     * Creates new form Table
     */
    public static int currentTable;
    
    public Table() {
        initComponents();
        updateTable();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    boolean isEmpty;
    String[] tableE = new String[12];
    int tableNo;
    
    static CSDbDelegate db = new CSDbDelegate("cs14sitkmutt.me","3306","CSC105_G6","CSC105_G6","CSC105_G6");
    
    public void updateTable(){
        db.connect();
        String checkT = "SELECT isEmpty FROM RESTAURANT_Table";
        ArrayList<HashMap> table = db.queryRows(checkT);
        int i = 0;
        for(HashMap x: table){
            tableE[i] = (String)(x.get("isEmpty"));
            i++;
        }
        if(tableE[0].equals("true")){
            Table1.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table1.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[1].equals("true")){
            Table2.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table2.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[2].equals("true")){
            Table3.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table3.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        
        if(tableE[3].equals("true")){
            Table4.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table4.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        
        if(tableE[4].equals("true")){
            Table5.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table5.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[5].equals("true")){
            Table6.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table6.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[6].equals("true")){
            Table7.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table7.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        
        if(tableE[7].equals("true")){
            Table8.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table8.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[8].equals("true")){
            Table9.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table9.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[9].equals("true")){
            Table10.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table10.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[10].equals("true")){
            Table11.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table11.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        
        if(tableE[11].equals("true")){
            Table12.setIcon(new ImageIcon(this.getClass().getResource("Check.png")));
        }else{
            Table12.setIcon(new ImageIcon(this.getClass().getResource("Error.png")));
        }
        db.disconnect();
    }
    
    public int getCurrentTable(){
        return currentTable;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Table3 = new javax.swing.JToggleButton();
        Table2 = new javax.swing.JToggleButton();
        Table5 = new javax.swing.JToggleButton();
        Table1 = new javax.swing.JToggleButton();
        Table12 = new javax.swing.JToggleButton();
        Table4 = new javax.swing.JToggleButton();
        Table6 = new javax.swing.JToggleButton();
        Table7 = new javax.swing.JToggleButton();
        Table8 = new javax.swing.JToggleButton();
        Table9 = new javax.swing.JToggleButton();
        Table10 = new javax.swing.JToggleButton();
        Table11 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Table3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table3MouseClicked(evt);
            }
        });
        jPanel1.add(Table3);
        Table3.setBounds(100, 320, 30, 30);

        Table2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jPanel1.add(Table2);
        Table2.setBounds(100, 260, 30, 30);

        Table5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table5MouseClicked(evt);
            }
        });
        jPanel1.add(Table5);
        Table5.setBounds(180, 300, 30, 30);

        Table1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Check.png"))); // NOI18N
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jPanel1.add(Table1);
        Table1.setBounds(100, 190, 30, 30);

        Table12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table12MouseClicked(evt);
            }
        });
        jPanel1.add(Table12);
        Table12.setBounds(480, 270, 30, 30);

        Table4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table4MouseClicked(evt);
            }
        });
        jPanel1.add(Table4);
        Table4.setBounds(180, 230, 30, 30);

        Table6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table6MouseClicked(evt);
            }
        });
        jPanel1.add(Table6);
        Table6.setBounds(260, 220, 30, 30);

        Table7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table7MouseClicked(evt);
            }
        });
        jPanel1.add(Table7);
        Table7.setBounds(260, 290, 30, 30);

        Table8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table8MouseClicked(evt);
            }
        });
        jPanel1.add(Table8);
        Table8.setBounds(260, 380, 30, 30);

        Table9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table9MouseClicked(evt);
            }
        });
        jPanel1.add(Table9);
        Table9.setBounds(370, 220, 30, 30);

        Table10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table10MouseClicked(evt);
            }
        });
        jPanel1.add(Table10);
        Table10.setBounds(370, 290, 30, 30);

        Table11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Check.png"))); // NOI18N
        Table11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table11MouseClicked(evt);
            }
        });
        jPanel1.add(Table11);
        Table11.setBounds(370, 360, 30, 30);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/Picture/Girl.png"))); // NOI18N
        jButton1.setText("DONE");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 440, 150, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurantprojectg6/R.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 610, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void Table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table3MouseClicked
        System.out.println(db.connect());
        currentTable = tableNo = 3;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table3.isSelected()){
            Table3.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table3.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.connect());
    }//GEN-LAST:event_Table3MouseClicked

    private void Table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table5MouseClicked

        System.out.println(db.connect());
        currentTable = tableNo = 5;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table5.isSelected()){
            Table5.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table5.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table5MouseClicked

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 2;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table2.isSelected()){
            Table2.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table2.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table2MouseClicked

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 1;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table1.isSelected()){
            Table1.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table1.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table1MouseClicked

    private void Table12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table12MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 12;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table12.isSelected()){
            Table12.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table12.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table12MouseClicked

    private void Table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table4MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 4;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table4.isSelected()){
            Table4.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table4.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        } 
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table4MouseClicked

    private void Table6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table6MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 6;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table6.isSelected()){
            Table6.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table6.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table6MouseClicked

    private void Table7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table7MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 7;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table7.isSelected()){
            Table7.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table7.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table7MouseClicked

    private void Table8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table8MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 8;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table8.isSelected()){
            Table8.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table8.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table8MouseClicked

    private void Table9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table9MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 9;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table9.isSelected()){
            Table9.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table9.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table9MouseClicked

    private void Table10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table10MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 10;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table10.isSelected()){
            Table10.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table10.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table10MouseClicked

    private void Table11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table11MouseClicked
        // TODO add your handling code here:
        System.out.println(db.connect());
        currentTable = tableNo = 11;
        String setFalse = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + false + "' WHERE RESTAURANT_Table.No = " + tableNo;
        String setTrue = "UPDATE `RESTAURANT_Table`" + "SET isEmpty = '" + true + "' WHERE RESTAURANT_Table.No = " + tableNo ;
        Image imgoff = new ImageIcon(this.getClass().getResource("Error.png")).getImage();
        Image imgon = new ImageIcon(this.getClass().getResource("Check.png")).getImage();
        
        if(Table11.isSelected()){
            Table11.setIcon(new ImageIcon(imgoff));
            isEmpty = false;
            db.executeQuery(setFalse);
            JOptionPane.showMessageDialog(null, "Table selected");
        }else{
            Table11.setIcon(new ImageIcon(imgon));
            isEmpty = true;
            db.executeQuery(setTrue);
            JOptionPane.showMessageDialog(null, "Table deselected");
        }
        System.out.println(db.disconnect());
    }//GEN-LAST:event_Table11MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Table1;
    private javax.swing.JToggleButton Table10;
    private javax.swing.JToggleButton Table11;
    private javax.swing.JToggleButton Table12;
    private javax.swing.JToggleButton Table2;
    private javax.swing.JToggleButton Table3;
    private javax.swing.JToggleButton Table4;
    private javax.swing.JToggleButton Table5;
    private javax.swing.JToggleButton Table6;
    private javax.swing.JToggleButton Table7;
    private javax.swing.JToggleButton Table8;
    private javax.swing.JToggleButton Table9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
