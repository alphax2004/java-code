/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ASUS
 */
public class Book extends Media {
    
    double requiredlevel;

    public Book(double requiredlevel, String title, double basescore) {
        super(title, basescore);
        this.requiredlevel = requiredlevel;
    }

    @Override
   public double getsuitability(Member m)
   {
       if(m.getReadinglevel()<requiredlevel)
       {
           return 0.0;
       }
       else
       {
           return super.getBasescore();
       }
   }
    
}
