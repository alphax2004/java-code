/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author HP
 */
public class Hrofficer {
    
    int cutof;
    Hrofficer()
    {
        int cutof=150;
    }
    void check(Developer d)
    {
        int res=d.getprojects()+(10*d.getmon());
        System.out.println(res);
        if(res>=cutof)
        {
            System.out.println("promoted");
        }
        else
        {
            System.out.println("not promoted");
        }
    }
    
    
    
    
    
    
    
    
}
