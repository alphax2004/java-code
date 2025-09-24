/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication19;

/**
 *
 * @author ASUS
 */
public class problem1 {
    
    public static void insert(String s,int n)
    {
        StringBuilder sb=new StringBuilder();
        
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i));
            count++;
            
            if(count==n&i!=s.length()-1)
            {
                sb.append("-");
            }
        }
        System.out.println(sb);
    }
    
}
