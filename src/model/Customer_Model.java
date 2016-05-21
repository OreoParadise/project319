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
public class Customer_Model {
    
    private int customerID;
    private String customerName;
    private String phoneNumber;
             
    public Customer_Model(){
        super();
    }


    public void setCustomerID(int customerID) {
        this.customerID = customerID;
        
    }
   
    public int getCustomerID(String customerName) {
        
        String sql = "SELECT CUSTOMERID FROM OREO_CUSTOMER WHERE CUSTOMERNAME = '" + customerName + "'";
        HashMap custID = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(custID.get("CUSTOMERID")));
        
    }

    public String getNemberOfCust(){    
        String sql = "SELECT COUNT(CUSTOMERID) FROM OREO_CUSTOMER";
        HashMap noOfCust = db.queryRow(sql);
        return String.valueOf(noOfCust.get("FOODNAME"));
    
    }
    public String getCustomerName(int customerID){
        String sql = "SELECT CUSTOMERNAME FROM OREO_CUSTOMER WHERE CUSTOMERID = " +customerID;
        HashMap custName = db.queryRow(sql);
        return String.valueOf(custName.get("CUSTOMERNAME"));
    }
    
    public String getPhoneNumber(int customerID){
        String sql = "SELECT PHONENUMBER FROM OREO_CUSTOMER WHERE CUSTOMERID = " +customerID;
        HashMap phoneNumber = db.queryRow(sql);
        return String.valueOf(phoneNumber.get("PHONENUMBER"));
    }
    
    public void insertCustomerInfo(String customerName, String phoneNumber){
        String sql = "INSERT INTO OREO_CUSTOMER(CUSTOMERNAME,PHONENUMBER) VALUES('"+ customerName + "','"+ phoneNumber +"')";
        db.executeQuery(sql);
    }
    
    public void insertReserveInfo(int tableNo, int customerID, String date, String time){
        String sql = "INSERT INTO OREO_RESERVE(TABLENO, CUSTOMERID, DATE, TIME) VALUES("+ tableNo +"," + customerID + ",'" + date + "','" + time +"')";
        db.executeQuery(sql);
    }
    
    
    
   
    
    
    
    
}
