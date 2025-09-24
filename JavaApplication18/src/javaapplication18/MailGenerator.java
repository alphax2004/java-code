/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MailGenerator {
    
    public static void generateMail(ArrayList<Employee>employeeList)
    {
       for(int i=0;i<employeeList.size();i++)
       {
          Employee e=employeeList.get(i);
          
          String name=e.getName().replaceAll(" ", " ");
          String first=name.substring(0, 4).toLowerCase();
          
          String[]parts=e.getArea().split(",");
          String area=parts[1].toLowerCase();
          
          String com=e.getCompany().toLowerCase();
          
          String s1=e.getName().concat(com).concat(area);
          
          String s2=e.getArea().replace("e", "t");
          String s3=e.getArea().substring(e.getArea().length()-3);
          String s4=e.getName().toUpperCase();
          int s5=e.getName().lastIndexOf("3");
          char s6=e.getArea().charAt(3);
          
          System.out.println(first+"."+area+"@"+e.getCompany()+".co");
          
          System.out.println(s1+"     "+s2+"    "+s3+"     "+s4+"    "+s5+"    "+s6);
          
          StringBuilder sb=new StringBuilder(e.getName());
          
          sb.append("a");
          
          System.out.println(sb);
          sb.append("b");
          
          System.out.println(sb);
          
          
       }
    }
    
}
