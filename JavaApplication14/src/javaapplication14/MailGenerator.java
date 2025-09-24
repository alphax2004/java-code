/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MailGenerator {
    
    
   
    public static void generateMailAdress(ArrayList<Employee>employeeList)
    {
        for(int i=0;i<employeeList.size();i++)
        {
            Employee ee=employeeList.get(i);
            String name=ee.getName().replaceAll(" ","");
            String first4=name.substring(0, 4).toLowerCase();
            
            String[]parts=ee.getArea().split(",");
            
            String district=parts[1].toLowerCase();
            String email=first4+"."+district+"@"+ee.getCompany().toLowerCase()+".co";
            System.out.println(email);
            
            
        }
    }
    
    
}
