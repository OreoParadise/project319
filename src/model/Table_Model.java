/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import static model.ConnectDB.db;

/*1*
 *
 * @author m
 */
public class Table_Model {

    private int tableNo;
    private boolean isEmpty;
    
    public Table_Model(){
        super();
    }
    
    public Table_Model(int tableNo, boolean isEmpty) {
        this.tableNo = tableNo;
        this.isEmpty = isEmpty;
    }
    
    public void setTableNo(int tableNo){
        this.tableNo = tableNo;
    }

    public int getTableNo() {
        String sql = "SELECT TABLENO FROM OREO_TABLE WHERE TABLENO = " + tableNo;
        HashMap table = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(table.get("TABLENO")));
    }
    public int getStatus(int tableNo){
        String sql = "SELECT STATUS FROM OREO_TABLE WHERE TABLENO = " + tableNo;
        HashMap status = db.queryRow(sql);
        return Integer.parseInt(String.valueOf(status.get("STATUS")));
    }
    
    public void updateFreeTable(int tableNo){
        String sql = "UPDATE OREO_TABLE SET STATUS = " + 0 + " WHERE TABLENO = " + tableNo;
        db.executeQuery(sql);
    }
    
    public void updateReservedTable(int tableNo){
        String sql = "UPDATE OREO_TABLE SET STATUS = " + 1 + " WHERE TABLENO = " + tableNo;
        db.executeQuery(sql);
    }
    
}
