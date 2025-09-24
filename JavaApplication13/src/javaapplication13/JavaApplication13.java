/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author ASUS
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metro m=new Metro();
        m.add("c", "c");
        m.createroute("m", "m", "m");
        m.allocateDriver("m", "m");
        m.deleteroute("m");
        m.register("m", "m");
        m.remivest("m", "m");
        m.remove("m", "m");
        m.schedule("m", "m", "m");
        
        Citybus c=new Citybus();
        c.register("ac", "m");
        c.remove("c", "c");
        
        
    }
    
}
