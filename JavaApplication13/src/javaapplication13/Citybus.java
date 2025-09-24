/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author ASUS
 */
public class Citybus extends Vehicle{
    
     @Override
    public void register(String v,String n)
    {
        System.out.println("register "+v+" number "+n);
    }
    @Override
    public void remove(String v,String n)
    {
       System.out.println("remove "+v+" number "+n);
    }
    
    
}
