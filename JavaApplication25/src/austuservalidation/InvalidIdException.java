/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package austuservalidation;

/**
 *
 * @author ASUS
 */
public class InvalidIdException extends Exception{

   public InvalidIdException() {
        super("Invalid id provided.");
    }
    public InvalidIdException(int id) {
        super("Invalid id: " + id);
    }
   
    
}
