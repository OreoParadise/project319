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
public class Order_Model {
    

            
    public void insertOrderHistory(int tableNo,String foodID){    
        String sql = "INSERT INTO OREO_ORDER ( TABLENO, FOODID) VALUES("+tableNo+","+foodID+")";
        db.executeQuery(sql);
            
    } 
    
  
    
}
