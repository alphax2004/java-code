/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author HP
 */
public class Train {
    double price;
    String d;
    double s;
    Train()
    {
        
    }
    Train(double p,String n,double x)
    {
        price=p;
        d=n;
        s=x;
        
    }
    double discount()
    {
        if(s>=6000)
        {
            return 0.25*price;
        }
        else
        {
            return 0;
        }
    }
}
