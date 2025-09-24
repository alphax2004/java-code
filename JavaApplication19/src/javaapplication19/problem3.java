/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author ASUS
 */
public class problem3 {
    
    public static void seperate(String o)
    {
        String[]parts=o.split(" ");
        
        StringBuilder sb2=new StringBuilder();
        
        for(int i=0;i<parts.length;i++)
        {
            if((i+1)%2==0)
            {
                sb2.append(parts[i].toLowerCase());
               
            }
            else
            {
                sb2.append(parts[i].toUpperCase());
            }
             
        }
        System.out.println(sb2.toString());
    }
    
}
