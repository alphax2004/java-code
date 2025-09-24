/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Inventory {
    
    private static ArrayList<Potion>p=new ArrayList<>();
    
    public static void addpotion(Potion pp)
    {
        p.add(pp);
        System.out.print(p.size());
    }
    public static void activatepotion(int i)
    {
        if(i>=0&&i<=p.size())
        {
            p.get(i).addEffect();
        }
        else
        {
            System.out.println("invalid");
        }
    }
    
}
