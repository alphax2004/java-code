/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structuretest;

/**
 *
 * @author HP
 */
public class DevelopStructure {

    private int base;
    
    public Structure produceStructure(double radius)
    {
        double structureVolume=(4.0/3.0)*Math.PI*radius*radius*radius;
        return new Structure(structureVolume);
    }
    
    public Structure produceStructure(double radius,double height)
    {
        double structureVolume=(1.0/3.0)*Math.PI*radius*radius*height;
        return new Structure(structureVolume);
    }
    public Structure produceStructure(double radius,double height,double length)
    {
        double structureVolume=0.5*(base*height)*length;
        return new Structure(structureVolume);
    }
    
    
    
    
    
    
    
    
    
    
    
}
