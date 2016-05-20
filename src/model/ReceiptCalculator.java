/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import static model.ConnectDB.db;

/**
 *
 * @author Oriopun Jaja
 */
public class ReceiptCalculator {
    
    private double totalPrice;
            
    public ReceiptCalculator(){
        super();
    }
    
    public double getTotalPrice(int tableNo,int date, int time){
        String sql = "SELECT TOTAL FROM OREO_TABLE WHERE TABLENO = " + tableNo;
        HashMap totalPrice = db.queryRow(sql);
        return Double.parseDouble(String.valueOf(totalPrice));
        
    }   
        
    public double getTotalRevenue(){
        return 1;
    }
   
   
    

}
