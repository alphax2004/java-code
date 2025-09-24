/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;


public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        Customer c1=new Customer("john",1200);
        Product p1=new Electronics("laptop",1000,2);
        Product p2=new Electronics("headphone",100, 1);
        Product p3=new Cloth("jacket", 100, "l");
        
        Store.addproduct(p1);
        Store.addproduct(p2);
        Store.addproduct(p3);
        Store.buyproduct(c1, 0);
        Store.buyproduct(c1, 1);
        
        
    }
    
}
