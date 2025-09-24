/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aust.uservalidation;

/**
 *
 * @author ASUS
 */
public class Invalidnameexception extends Exception {

    public Invalidnameexception() {
        
        super("invalid name ");
    }
    public Invalidnameexception(String username)
    {
        super("invalid name = "+username);
    }
    
}
