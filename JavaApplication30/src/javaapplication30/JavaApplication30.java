/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication30;

import movieexception.Cardnotworkingexception;
import movieexception.Notapplicableforchildren;

/**
 *
 * @author ASUS
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Bookticket b = new Bookticket();
        try {
            b.checkage(63, "r");
            b.addcard("999  995");
        } catch (Notapplicableforchildren | Cardnotworkingexception e) {
            System.out.println(e.getMessage());
        }
    }

}
