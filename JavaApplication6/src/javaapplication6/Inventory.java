/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Inventory {
    
    
    
    private static ArrayList<Potion>potionList=new ArrayList<>();
    
    public static void addPotion(Potion p)
    {
        potionList.add(p);
        
        System.out.println("number of total potion in the inventory = "+potionList.size());
    }
    
    public static void activatePotion(int idx)
            
    {
        if(idx>=0&&idx<=potionList.size())
        {
            potionList.get(idx).addEffect();
        }
        else
        {
            System.out.println("invalid");
        }
    }
    
    
    
    
    
}
