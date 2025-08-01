/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafedemo;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class CafeDemo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        String b=sc.nextLine();
        String s=sc.nextLine();
        double d=sc.nextDouble();
        Beverage p=new Beverage(b,s,d);
        double res=p.calculateTotalPrice();
        System.out.print(res);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
