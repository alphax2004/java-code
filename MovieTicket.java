/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movieticket;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class MovieTicket {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String studentname=sc.nextLine();
        int age=sc.nextInt();
        
        
        boolean isStudent=sc.nextBoolean();
        double price=sc.nextDouble();
        Customer c=new Customer(studentname,age,isStudent);
        double res=c.calculate(price);
        System.out.print(studentname+"ticket price"+res+"tk");
    }
}
