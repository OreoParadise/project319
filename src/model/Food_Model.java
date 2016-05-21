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
 * @author JamesP
 */
public class Food_Model {
    
    private int foodID;
    private String foodName;
    private int foodTypeID;
    private double price;
    
    public Food_Model(){
        super();
    }

    public int getFoodID() {
        
        String sql = "SELECT FOODID FROM OREO_FOOD WHERE FOODID = " + foodID;
        HashMap foodID = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(foodID.get("FOODID")));
        
    }
   
    public String getPopFood(){    
        String sql = "SELECT FOODNAME FROM OREO_ORDER,OREO_FOOD WHERE OREO_ORDER.FOODID = OREO_FOOD.FOODID GROUP BY OREO_FOOD.FOODID ORDER BY COUNT(OREO_FOOD.FOODID) DESC LIMIT 1";
        HashMap popFood = db.queryRow(sql);
        return String.valueOf(popFood.get("FOODNAME"));
          
    } 

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }
    
    
    
  
}
