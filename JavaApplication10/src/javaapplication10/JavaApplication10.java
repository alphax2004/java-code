/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author ASUS
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Whatsapp w=new Whatsapp();
        
        System.out.println("for whatsapp class");
        
        w.sendtext("abcd", "ahan", "ahani");
        w.receivetext("abcd", "ahan");
        w.sendcall("ahani");
        w.receivecall("ahan");
        w.sendphoto("ahani", "dog.png");
        w.receivephoto("ahan", "cat.png");
        w.status("deslivered");
        
        System.out.println();
        System.out.println("for default message class");
        
        
        Defaultmessage d=new Defaultmessage();
        d.sendtext("abcd", "ahan", "ahani");
        d.receivetext("abcd", "ahan");
    }
    
}
