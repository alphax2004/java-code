/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codetest;

/**
 *
 * @author HP
 */
public class Code {
    
    private double linesofCode;
    
    Code(double linesofCode)
    {
        if(linesofCode<=200)
        {
            this.linesofCode=250;
        }
        else
        {
            this.linesofCode=linesofCode;
        }
    }
    public void setLinesOfCode(double linesofCode)
    {
        this.linesofCode=linesofCode;
    }
    public double getLinesOfCode()
    {
        return linesofCode;
    }
    
    
    
    
    
    
    
    
    
    
    
}
