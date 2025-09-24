/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlineexception;

/**
 *
 * @author ASUS
 */
public class Ticket {
    
     public void giveDiscount(int age,double price) throws NotApplicableForDiscountException
    {
        if(age>=60)
        {
            System.out.println("giving discount 6%");
            double tk=price-(price*0.06);
            System.out.println(tk);
        }
        else if(age<=10)
        {
            System.out.println("giving discount 5%");
            double tk=price-(price*0.05);
            System.out.println(tk);
            
        }
        else
        {
            throw new NotApplicableForDiscountException("age group not included");
        }
    }
    
}
