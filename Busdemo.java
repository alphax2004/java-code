/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busdemo;

import java.util.Scanner;
public class Busdemo {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      double x=sc.nextDouble();
      boolean member=sc.nextBoolean();
      Passenger p=new Passenger(s,x,member);
      double res=p.calculate();
      System.out.print(s+" fare is "+res+" tk");
    }
}
