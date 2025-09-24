/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aust.uservalidation;

/**
 *
 * @author ASUS
 */
public class Invalidsalaryexception extends Exception {

    public Invalidsalaryexception() {
        
        System.out.println("invalid salary ");
    }

    public Invalidsalaryexception(double salary) {
        super("invalid salary = "+salary);
    }
    
    
    
}
