/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import austuservalidation.*;

/**
 *
 * @author ASUS
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            User u1 = new User("john smith", 851234);
            System.out.println(u1.getName() + " " + u1.getId());
        } catch (InvalidNameException|InvalidIdException  e) {
            System.out.println(e.getMessage());
        } 

        try {
            User u1 = new User("John Smith", 531234);
            System.out.println(u1.getName() + " " + u1.getId());
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidIdException e) {
            System.out.println(e.getMessage());
        }
    }

}
