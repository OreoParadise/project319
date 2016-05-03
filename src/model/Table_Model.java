/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author m
 */
public class Table_Model {
        private int tableNo;
        private boolean isEmpty;

    public Table_Model(int tableNo, boolean isEmpty) {
        this.tableNo = tableNo;
        this.isEmpty = isEmpty;
    }

    public int getTableNo() {
        return tableNo;
    }

    public boolean isIsEmpty() {
        return isEmpty;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
        
        
        
}
