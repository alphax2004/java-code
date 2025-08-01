/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemademo;

/**
 *
 * @author HP
 */
public class Ticket {
    
    String movieName;
    String seatType;
    double basePrice;
    Ticket()
    {
        
    }
    Ticket(String m,String s,double b)
    {
        movieName=m;
        seatType=s;
        basePrice=b;
    }
    double getFinalTicketPrice()
    {
        if(seatType.equals("VIP"))
        {
            return basePrice+100;
        }
        else if(seatType.equals("regular"))
        {
            return basePrice;
        }
        else if(seatType.equals("balcony"))
        {
            return basePrice+50;
        }
        return 0;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
