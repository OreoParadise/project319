/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import restaurantprojectg6.Billing1;
import restaurantprojectg6.Queue1;
import view.MainMenu;

/**
 *
 * @author JamesP
 */
public class MainMenu_Controller extends JFrame{
    private MainMenu menu;
    
    public MainMenu_Controller(){
        menu = new MainMenu();
        menu.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MainMenu_Controller();
    }
}

