/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication30;

import movieexception.Cardnotworkingexception;

/**
 *
 * @author ASUS
 */
public class Bookticket extends Eligibility {
    
    public void addcard(String cardno) throws Cardnotworkingexception
    {
        if(cardno.length()<16||cardno.contains(" "))
        {
            throw new Cardnotworkingexception("invalid card ");
        }
        else
        {
            System.out.println("card is valid");
        }
    }
    
    
}
