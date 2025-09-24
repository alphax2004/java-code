/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aust.studentmanagement;

/**
 *
 * @author ASUS
 */
public class InvalidNameException extends Exception {

    public InvalidNameException() {
        
        super("invalid name");
    }
    
    public InvalidNameException(String name)
    {
        super("invalid name= "+name);
    }
    
}
