/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cinemademo;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class CinemaDemo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String m=sc.nextLine();
        String s=sc.nextLine();
        double b=sc.nextDouble();
        
        Ticket t=new Ticket(m,s,b);
        double res=t.getFinalTicketPrice();
        System.out.print(res);
        
        
        
        
        
        
        
        
        
        
    }
}
