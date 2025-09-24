/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author ASUS
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player p=new Player(10,100);
        Villain v=new Villain(10,100);
        
        while(true)
        {
            p.takeDamage(v);
            v.takeDamage(p);
            
            System.out.println("player health = "+p.getHealth()+","+" villian health = "+v.getHealth());
            
            if(p.getHealth()<=0)
            {
                System.out.println("player lost");
                break;
            }
            if(v.getHealth()<=0)
            {
                System.out.println("villian lost");
                break;
            }
        }
    }
    
}
