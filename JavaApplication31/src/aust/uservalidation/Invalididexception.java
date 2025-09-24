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
        
        super("invalid id");
    }
    public Invalididexception(int id)
    {
        super("invalid id ="+id);
    }
    
    
    
}
