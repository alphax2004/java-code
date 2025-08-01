/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codetest;

/**
 *
 * @author HP
 */
public class CodeFactory {
    
    public Code createCode(int methods)
    {
        double linesofCode=methods*20;
        return new Code(linesofCode);
    }
   public Code createCode(int methods,int linesPerMethods)
   {
       double linesofCode=methods*linesPerMethods;
       return new Code(linesofCode);
   }
   public Code createCode(int methods,int linesPerMethods,int reductantLinePerMethod)
   {
       double linesofCode=(methods*linesPerMethods)/(double)reductantLinePerMethod;
       return new Code(linesofCode);
   }
    
    
    
    
    
    
    
    
    
    
    
}
