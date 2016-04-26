/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JamesP
 */
public class Food_Model {
    private int foodID;
    private String foodName;
    private int foodTypeID;
    private double price;
    
    public Food_Model(int id, String name, int type, double price){
        this.foodID = id;
        this.foodName = name;
        this.foodTypeID = type;
        this.price = price;
    }
    
    public int getFoodID(){
        return foodID;
    }
    
    public void setFoodID(int id){
        this.foodID = id;
    }
    
    public String getFoodName(){
        return foodName;
    }
    
    public void setFoodName(String name){
        this.foodName = name;
    }
    
    public int getFoodTypeID(){
        return foodTypeID;
    }
    
    public void setFoodTypeID(int typeID){
        this.foodTypeID = typeID;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
}
