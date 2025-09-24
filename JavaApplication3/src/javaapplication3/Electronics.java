/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author ASUS
 */
public class Electronics extends Product {
    
    private int warrantyname;

    public Electronics(String productname, double price,int warrantyname ) {
        super(productname, price);
        this.warrantyname = warrantyname;
    }

    public int getWarrantyname() {
        return warrantyname;
    }

    public void setWarrantyname(int warrantyname) {
        this.warrantyname = warrantyname;
    }
    
    @Override
    public double calculatediscount(Customer c)
    {
        if(c.getBalance()>1000)
        {
            
            return getPrice()*0.9;
        }
        else
        {
            return getPrice();
        }
    }
    
}
