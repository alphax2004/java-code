/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication30;
import movieexception.*;

/**
 *
 * @author ASUS
 */
public class Eligibility {
    
    public void checkage(int age,String rating) throws Notapplicableforchildren
    {
        if(age<18&&rating.equals("r"))
        {
            throw new Notapplicableforchildren("not applicable for people 18");
        }
        if(age<15&&rating.equals("m"))
        {
            throw new Notapplicableforchildren("not applicable for people 15");
        }
        if(age<18&&rating.equals("g"))
        {
            System.out.println("applicable for kids");
        }
    }
    
}
