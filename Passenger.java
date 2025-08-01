/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.busdemo;

/**
 *
 * @author HP
 */
public class Passenger {
    
    String pname;
    double d;
    boolean isMember;
    Passenger()
    {
        
    }
    Passenger(String s,double x,boolean member)
    {
        pname=s;
        d=x;
        isMember=member;
    }
    double calculate()
    {
        if(d>=15&&isMember==true)
        {
            return (d*9)-10;
        }
        else if(d<15&&isMember==true)
        {
            return (d*10)-9;
        }
        else
        {
            return d*11;
        }
    }
}
