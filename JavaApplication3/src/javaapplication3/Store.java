/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Store {
    
    private static ArrayList<Product>product=new ArrayList<>();
    
    public static void addproduct(Product p)
    {
        product.add(p);
        System.out.println(p.getProductname()+"  added to the store  ");
        
    }
    
    public static void buyproduct(Customer c,int idx)
    {
        if(idx>=0&&idx<=product.size())
        {
            Product p=product.get(idx);
            double price=p.calculatediscount(c);
            
            if(c.getBalance()>=price)
            {
                c.setBalance(c.getBalance()-price);
                System.out.println("purchased "+" "+p.getProductname()+"  "+price);
                product.remove(idx);
            }
            else
            {
                System.out.println("  invalid  ");
            }
        }
    }
    
    
}
