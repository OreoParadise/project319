/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Oriopun Jaja
 */
public class ReserveTable_Model {

    private int reserveID;
    private int tableNo;
    private int customerID;
    private String date;

    public ReserveTable_Model(int reserveID, int tableNo, int customerID, String date) {
        this.reserveID = reserveID;
        this.tableNo = tableNo;
        this.customerID = customerID;
        this.date = date;
    }

    public int getReserveID() {
        return reserveID;
    }

    public int getTableNo() {
        return tableNo;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getDate() {
        return date;
    }

    public void setReserveID(int reserveID) {
        this.reserveID = reserveID;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

}
