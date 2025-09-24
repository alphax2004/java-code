/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
       Potion p1=new Health();
       Potion p2=new Health();
       Potion h1=new Stamina();
       Potion h2=new Stamina();
       
       Inventory.addpotion(p1);
        Inventory.addpotion(p2);
         Inventory.addpotion(h1);
          Inventory.addpotion(h2);
          
          Scanner sc=new Scanner(System.in);
          for(int j=0;j<2;j++)
          {
              int i=sc.nextInt();
              Inventory.activatepotion(i);
              
          }
          sc.close();
    }
}
