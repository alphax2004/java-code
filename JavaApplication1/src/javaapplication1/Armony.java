/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Armony {
    
    private static ArrayList<Weapon>weaponlist=new ArrayList<>();
    
    public static void addweapon(Weapon w)
    {
        weaponlist.add(w);
        
        System.out.print(weaponlist.size());
    }
    
    public static void upgradeweapon(int i)
    {
        if(i>=0&&i<=weaponlist.size())
        {
            weaponlist.get(i).upgrade();
        }
        else
        {
            System.out.println("none");
        }
    }
    
    
}
