/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Msword m=new Msword();
        m.editdoc("abcd");
        m.savedoc("apple");
        
        Googledocs g=new Googledocs();
        g.editdoc("cat");
        g.savedoc("dog");
        g.editsheet("cow");
        g.convertf("add", "hen");
        g.printf("crow");
        g.formula("add", "horse");
        g.realtime("sheep", "donkey");
        
        
    }
    
}
