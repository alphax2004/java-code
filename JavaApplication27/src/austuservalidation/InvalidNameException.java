/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package austuservalidation;

/**
 *
 * @author ASUS
 */
public class InvalidNameException extends Exception {
    
    public InvalidNameException()
    {
        super("invalid name");
    }
    public InvalidNameException(String name)
    {
        super(name);
    }
    
    
}
