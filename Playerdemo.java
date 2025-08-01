/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.playerdemo;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Playerdemo {

    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
         String p=sc.nextLine();
         double t=sc.nextDouble();
         double m=sc.nextDouble();
         Player d=new Player(p,t,m);
         double res=d.calculateFinalScore();
         
         System.out.print(res);
        
        
        
        
        
        
        
        
    }
}
