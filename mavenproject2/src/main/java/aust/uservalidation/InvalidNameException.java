/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aust.uservalidation;

/**
 *
 * @author ASUS
 */
public class InvalidNameException extends Exception {
    
    public InvalidNameException()
    {
        super("invalid name");
    }
    public InvalidNameException(String username)
    {
        super("name="+username);
    }
    
}
