/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MailGenerator {
    
    public static void generateMailAdress(ArrayList<Employee>employeeLlist)
    {
        for(int i=0;i<employeeLlist.size();i++)
        {
            Employee ee=employeeLlist.get(i);
            
            String name=ee.getName().replaceAll(" ", " ");
            
            String first=name.substring(0, 4).toLowerCase();
            
            String[]parts=ee.getArea().split(",");
            
            String d=parts[1].toLowerCase();
            
            String c=ee.getCompany();
            
            System.out.println(first+"."+d+"@"+c+".co");
        }
    }
    
}
