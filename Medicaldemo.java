/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medicaldemo;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Medicaldemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        double temp=sc.nextDouble();
        int time=sc.nextInt();
        Patient p=new Patient(n,temp,time);
        
        String res=p.diagnose();
        System.out.print(n+" has "+res);
        
    }
}
