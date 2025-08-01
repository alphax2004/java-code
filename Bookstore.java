/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookstore;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Bookstore {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String g=sc.nextLine();
        int p=sc.nextInt();
        Book b=new Book(n,g,p);
        System.out.print(b.time());
    }
}
