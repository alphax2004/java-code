/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication15;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Mailgenerator {
    
    public static void generateMailAdress(ArrayList<Student>studentList)
    {
        for(int i=0;i<studentList.size();i++)
        {
            Student s=studentList.get(i);
            
            String name=s.getName().replaceAll(" ", " ");
            
            String first4=name.substring(0, 3).toLowerCase();
            String last3=name.substring(name.length()-3).toLowerCase();
            
            String date=s.getDateOfBirth().substring(6);
            String v=s.getVersity().toLowerCase();
            String email=first4+"."+last3+"."+date+"@"+v+".edu";
            System.out.println(email);
            
        }
    }
    
}
