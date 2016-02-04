/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantprojectg6;

/**
 *
 * @author JamesP
 */
public class Food {
    private String foodName;
    private int foodCost;
    
    public Food(){
        foodName = null;
        foodCost = 0;
    }
    
    public Food(String n, int c){
        foodName = n;
        foodCost = c;
    }
    
    public String getName(){
        return foodName;
    }
    
    public int getCost(){
        return foodCost;
    }
}
