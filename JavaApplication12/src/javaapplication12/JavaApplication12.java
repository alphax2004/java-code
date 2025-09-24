/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author ASUS
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Google g=new Google();
        g.door("ppp");
        g.energy("ooo");
        g.lightoff("lll", "opo");
        g.lighton("iii", "lll");
        g.thermostatoff("kkk");
        g.thermostaton("iii", "mmm");
        g.voice("kkk");
        
        
        
        Basiclight b=new Basiclight();
        b.lightoff("nmo", "opo");
        b.lighton("lpl", "plp");
        
    }
    
}
