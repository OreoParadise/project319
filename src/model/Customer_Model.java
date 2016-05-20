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

    public Customer_Model(int customerID, String customerName, String phoneNumber) {
        super();
        this.customerID = customerID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID(int customerID) {
        
        String sql = "SELECT CUSTOMERID FROM OREO_CUSTOMER WHERE CUSTOMERID = " + customerID;
        HashMap custID = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(custID.get("CUSTOMERID")));
        
    }

    public String getNemberOfCust(){    
        String sql = "SELECT COUNT(CUSTOMERID) FROM OREO_CUSTOMER";
        HashMap noOfCust = db.queryRow(sql);
        return String.valueOf(noOfCust.get("FOODNAME"));
    
    }
    public String getCustomerName(){
        String sql = "SELECT CUSTOMERNAME FROM OREO_CUSTOMER WHERE CUSTOMERID = " +customerID;
        HashMap custName = db.queryRow(sql);
        return String.valueOf(custName.get("CUSTOMERNAME"));
    }
    
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    
   
    
    
}
