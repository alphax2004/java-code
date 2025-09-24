/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

/**
 *
 * @author ASUS
 */
import aust.uservalidation.*;

public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            User u = new User("John Smith", "734566", 876);
            System.out.println(u.getUsername() + " " + u.getId() + " " + u.getSalary());
        } catch (Invalidnameexception | Invalididexception | Invalidsalaryexception e) {
            System.out.println(e.getMessage());
        }
        try {
            User u = new User("john Smith", "765433", 876);
            System.out.println(u.getUsername() + " " + u.getId() + " " + u.getSalary());
        } catch (Invalidnameexception | Invalididexception | Invalidsalaryexception e) {
            System.out.println(e.getMessage());
        }
        try {
            User u = new User("John smith", "87653", 0);
            System.out.println(u.getUsername() + " " + u.getId() + " " + u.getSalary());
        } catch (Invalidnameexception | Invalididexception | Invalidsalaryexception e) {
            System.out.println(e.getMessage());
        }
    }

}
