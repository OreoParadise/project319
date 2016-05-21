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
    private int receiptNo;
            
    public ReceiptCalculator(){
        super();
    }
    
    public double getTotalPrice(int tableNo,int date){
        String sql = "SELECT SUM(PRICE) FROM OREO_FOOD,OREO_ORDER WHERE TABLENO ="+tableNo+" AND DATE="+date+"AND OREO_FOOD.FOODID = OREO_ORDER.FOODID";
        HashMap totalPrice = db.queryRow(sql);
        return Double.parseDouble(String.valueOf(totalPrice));
        
    }   
        
    public double getTotalRevenue(){ 
         String sql = "SELECT sum(COST) sumcost FROM OREO_BILLING WHERE ISCHECKED =1";
        HashMap totalRevenue = db.queryRow(sql);
        return Double.parseDouble(String.valueOf(totalRevenue.get("sumcost")));
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }
    
    
    
    
   
   
    

}
