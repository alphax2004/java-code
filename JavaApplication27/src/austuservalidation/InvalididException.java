/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package austuservalidation;

/**
 *
 * @author ASUS
 */
public class InvalididException extends Exception{
    
    public InvalididException(int id)
    {
        super("invalid id");
    }
     public InvalididException(int id) {
        super("Invalid id: " + id);
    }
    
}
