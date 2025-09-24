/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author ASUS
 */
public abstract class Transport extends Vehicle implements Routemanager {
    
    
    public abstract void allocateDriver(String dr,String v);
    
    public abstract void schedule(String sch,String r,String v);
    
    
}
