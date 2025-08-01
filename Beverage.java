/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafedemo;

/**
 *
 * @author HP
 */
public class Beverage {
    
    String beverageName;
    String size;
    double basePrice;
    Beverage()
    {
        
    }
    Beverage(String b,String s,double d)
    {
        beverageName=b;
        size=s;
        basePrice=d;
    }
    double calculateTotalPrice()
    {
        if(size.equals("small"))
        {
            return basePrice+0;
        }
        else if(size.equals("medium"))
        {
            return basePrice+20;
        }
        else if(size.equals("large"))
        {
            return basePrice+40;
        }
        return 0;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
