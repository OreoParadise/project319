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
public class ReserveTable_Model {

    private int reserveID;
    private int tableNo;
    private int customerID;
    private String date;
    private ConnectDB connectDB;


    public void setReserveID(int reserveID) {
        this.reserveID = reserveID;
    }
    
    public String getDate(int reserveID){
        String sql = "SELECT DATE FROM OREO_RESERVE WHERE RESERVEID = " +reserveID;
        HashMap date = db.queryRow(sql);
        //System.out.println(String.valueOf(date.get("CUSTOMERNAME")));
        return String.valueOf(date.get("CUSTOMERNAME"));
           
    }
     
    
    public String getDate() {
        
        String sql = "SELECT DATE FROM OREO_RESERVE WHERE RESERVEID " + reserveID;
        HashMap getDate= db.queryRow(sql);
        return String.valueOf(getDate.get("DATE"));
        
    }
    
    public String getTime() {
        
        String sql = "SELECT TIME FROM OREO_RESERVE WHERE RESERVEID " + reserveID;
        HashMap getTime= db.queryRow(sql);
        return String.valueOf(getTime.get("TIME"));
        
    }
    
    
    /* public void insertQueuing( int tableNO, int customerID, String date, String time){
    String sql = "INSERT INTO RESTAURANT_CustomerInfo "
    + "VALUES ('" + reserveID + "','"
    +  + "','"
    + phone + "','"
    + table + "','"         //Get the data from class table
    + date + "') ";         //YYYY-MM-DD HH:MI:SS
    }*/
    
     

}
