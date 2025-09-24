/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author ASUS
 */
public class Cloth extends Product {
    
    private String size;

    public Cloth( String productname,double price, String size) {
        super(productname, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

   
    @Override
    public double calculatediscount(Customer c)
    {
        if(c.getBalance()>500)
        {
            
            return getPrice()*0.95;
        }
        else
        {
            return getPrice();
        }
    }
    
}
