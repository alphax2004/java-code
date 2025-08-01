/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieticket;

/**
 *
 * @author HP
 */
public class Customer {
    String studentname;
    int age;
    boolean isStudent;
   Customer()
    {
        
    }
   Customer(String studentname,int age,boolean isStudent)
    {
        this.studentname=studentname;
        this.age=age;
        this.isStudent=isStudent;
    }
    
    public double calculate(double price)
    {
        double tk=price;
        if(age<=12&&isStudent==true)
        {
            return 0.8*tk;
        }
        else if(age>12&&isStudent==true)
        {
            return 1.1*tk;
        }
        else
        {
            return tk+0.15*tk;
        }
    }
    
}
