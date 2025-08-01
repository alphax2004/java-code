/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structuretest;

/**
 *
 * @author HP
 */
public class Structure {
    
    
    private double structureVolume;
    
    Structure(double structureVolume)
    {
        if(structureVolume<0)
        {
            this.structureVolume=structureVolume*(-1);
        }
        else
        {
            this.structureVolume=structureVolume;
        }
    }
    public void setStructureVolume(double structureVolume)
    {
        this.structureVolume=structureVolume;
    }
    public double getstructureVolume()
    {
        return structureVolume;
    }
    
    
    
    
    
    
    
    
    
    
}
