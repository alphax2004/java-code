/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicaldemo;

/**
 *
 * @author HP
 */
public class Patient {
    String pname;
    double t;
    int s;
    Patient()
    {
        
    }
    Patient(String n,double temp,int time)
    {
        pname=n;
        t=temp;
        s=time;
    }
    String diagnose()
    {
        if(t>103&&s>7)
        {
            return "Dengue";
        }
        else if(t>=100&&s>7)
        {
            return "Common Fever";
        }
        else
        {
            return "Nothing";
        }
    }
}
