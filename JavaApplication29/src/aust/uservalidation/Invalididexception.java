/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aust.uservalidation;

/**
 *
 * @author ASUS
 */
public class Invalididexception extends Exception {

    public Invalididexception() {

        System.out.println("invalid id");
    }

    /**
     *
     * @param id
     */
    public Invalididexception(String id) {
        super("invalid id = " + id);
    }

}
