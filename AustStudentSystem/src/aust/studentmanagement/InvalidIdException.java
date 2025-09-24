/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aust.studentmanagement;

/**
 *
 * @author ASUS
 */
public class InvalidIdException extends Exception {

    public InvalidIdException() {
        super("invalid id ");
        
    }

    public InvalidIdException(String id)
    {
        super("invalid id "+id);
    }
    
    
    
    
    
    
    
}
