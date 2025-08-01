/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.realestate;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Realestate {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String p=sc.nextLine();
        double a=sc.nextDouble();
        double d=sc.nextDouble();
        sc.nextLine();
        String l=sc.nextLine();
        Property s=new Property(p,a,d,l);
        
        
        System.out.print(s.calculateTotalPrice());
        
        
    
        
    }
}
