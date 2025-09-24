/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Member m1=new Member("alice",8);
        
        Member m2=new Member("bob",10);
        
        Media a1=new Book(3,"Cosmos",30);
        Media a2=new Book(4,"Advanced calculuc",50);
        
        Media a3=new Magazine(5,"Science fiction",60);
        
        Library.addmedia(a1);
        Library.addmedia(a2);
        Library.addmedia(a3);
        
        Media r1=Library.recommendmedia(m1);
        Media r2=Library.recommendmedia(m2);
        
        System.out.println(r1.getTitle()+" is recommended for "+m1.getName());
        System.out.println(r2.getTitle()+" is recommended for "+m2.getName());
        
        
        
    }
    
}
