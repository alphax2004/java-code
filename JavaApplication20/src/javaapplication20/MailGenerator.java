/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication20;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MailGenerator {
    
    public static void generateMail(ArrayList<Student>studentList)
    {
        for(int i=0;i<studentList.size();i++)
        {
            Student ss=studentList.get(i);
            
            String name=ss.getName().replaceAll(" ", " ");
            
            String first=name.substring(0, 3).toLowerCase();
            String last=name.substring(ss.getName().length()-3).toLowerCase();
            
            String year=ss.getDateofbirth().substring(6);
            
            String v=ss.getVersity().toLowerCase();
            System.out.println(first+"."+last+"."+year+"@"+v+".edu");
        }
    }
    
}
