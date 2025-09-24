/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author ASUS
 */
import aust.uservalidation.*;

public class Mavenproject2 {

    public static void main(String[] args) {

        try {
            User u = new User("John Smith", 7345678);
            System.out.println(u.getUsername() + " " + u.getId());
        } catch (InvalidNameException | InvalidIdException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            User u = new User("john Smith", 7545678);
            System.out.println(u.getUsername() + " " + u.getId());
        } catch (InvalidNameException | InvalidIdException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            User u = new User("John smith", 8345678);
            System.out.println(u.getUsername() + " " + u.getId());
        } catch (InvalidNameException | InvalidIdException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
