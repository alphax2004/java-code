/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author ASUS
 */
public class problem2 {
    
    public static void valid(String e)
    {
        int i=e.indexOf("@");
        int j=e.lastIndexOf(".");
        
        if(i>0&&j>i+1&&j<e.length()-1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
            
    
    
}
