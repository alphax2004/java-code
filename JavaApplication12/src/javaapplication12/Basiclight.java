/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author ASUS
 */
public class Basiclight extends Lightcontroll {
    
     @Override
    public void lighton(String l,String b)
    {
        System.out.println("trun on light "+l+" brightness "+b);
    }
    @Override
    public void lightoff(String l,String b)
    {
         System.out.println("trun off light "+l+" brightness "+b);
    }
    
}
