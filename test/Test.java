/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        String n=sc.nextLine();
        double x=sc.nextDouble();
        Train t=new Train(p,n,x);
        double res=t.discount();
        System.out.print("discount is="+res);
    }
}
