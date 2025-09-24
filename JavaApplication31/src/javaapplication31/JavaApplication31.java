/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;

import aust.uservalidation.*;

/**
 *
 * @author ASUS
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            User u = new User("john smith", 7345678);
            System.out.println(u.getUsername() + " " + u.getId());
        } catch (Invalidnameexception | Invalididexception e) {
            System.out.println(e.getMessage());
        }
        try {
            User u = new User("John Smith", 8345678);
            System.out.println(u.getUsername() + " " + u.getId());
        } catch (Invalidnameexception | Invalididexception e) {
            System.out.println(e.getMessage());
        }
    }

}
