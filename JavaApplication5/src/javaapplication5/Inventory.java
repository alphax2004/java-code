/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Inventory {
    
    
    private static ArrayList<Potion>potionlist=new ArrayList<>();
    
    public static void addPotion(Potion p)
    {
        potionlist.add(p);
        System.out.println("number of total potion = "+potionlist.size());
    }
    public static void activatepotion(int idx)
    {
        if(idx>=0&&idx<=potionlist.size())
        {
            potionlist.get(idx).addpotion();
            
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
