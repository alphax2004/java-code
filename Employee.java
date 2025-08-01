/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Employee {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int project=sc.nextInt();
        int mon=sc.nextInt();
        
        Developer dev=new Developer(project,mon);
        
        Hrofficer h=new Hrofficer();
        
        h.check(dev);
        
        
        
        
        
    }
}
