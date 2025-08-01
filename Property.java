/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.realestate;

/**
 *
 * @author HP
 */
public class Property {
    
    String propertyType;
    double area;
    double pricePerSquareMeter;
    String location;
    Property()
    {
        
    }
    Property(String p,double a,double d,String l)
    {
        propertyType=p;
        area=a;
        pricePerSquareMeter=d;
        location=l;
    }
    double calculateTotalPrice()
    {
        double totalprice=area*pricePerSquareMeter;
        if(location.equalsIgnoreCase("city center"))
        {
            return totalprice+totalprice*0.2;
        }
        else if(location.equalsIgnoreCase("suburbs"))
        {
            return totalprice+totalprice*0.1;
        }
        else
        {
            return totalprice+totalprice*0.05;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
