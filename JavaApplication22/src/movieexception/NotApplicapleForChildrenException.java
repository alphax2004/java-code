/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieexception;

/**
 *
 * @author ASUS
 */
public class NotApplicapleForChildrenException extends Exception{
    
    public NotApplicapleForChildrenException(String message)
    {
        super(message);
        System.out.println(message);
    }
    
}
