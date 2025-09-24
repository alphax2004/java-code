/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        Health h1=new Health();
        Health h2=new Health();
        
        Stamina s1=new Stamina();
        Stamina s2=new Stamina();
        
        Inventory.addPotion(h1);
        Inventory.addPotion(h2);
        Inventory.addPotion(s1);
        Inventory.addPotion(s2);
        
        System.out.print("potion to activate = ");
        int idx1=sc.nextInt();
        
        Inventory.activatePotion(idx1);
        
        System.out.print("potion to activate = ");
        
        int idx2=sc.nextInt();
        
        Inventory.activatePotion(idx2);
        
        
        
    }
    
}
