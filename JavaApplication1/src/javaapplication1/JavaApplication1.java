/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        Weapon w1=new Weapon();
        Weapon w2=new Weapon();
        Sword s1=new Sword();
        Sword s2=new Sword();
        
        Armony.addweapon(w1);
        Armony.addweapon(w2);
        Armony.addweapon(s1);
        Armony.addweapon(s2);
        for(int j=0;j<2;j++)
        {
            int i=sc.nextInt();
            
            Armony.upgradeweapon(i);
                    
        }
        sc.close();
    }
    
}
