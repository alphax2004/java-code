/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MailGenerator {
    
    public static void generateMailAddress(ArrayList<Teacher>teacherList)
    {
        for(int i=0;i<teacherList.size();i++)
        {
            Teacher t=teacherList.get(i);
            
            String name=t.getName().replaceAll(" ", " ");
            String first2=name.substring(0, 2);
            System.out.println("first2 "+first2);
            String last2=name.substring(name.length()-2);
            
            System.out.println("last2 "+last2);
            String sub2=t.getSubject().concat("+").concat(last2);
            
            System.out.println("concate "+sub2);
            char sub3=t.getSchool().replace("e", "r").charAt(2);
            
            System.out.println("sub3 "+sub3);
            char sub4=t.getName().charAt(3);
            
            System.out.println("sub4 "+sub4);
            String sub5=t.getName().replace("a", "*").replace("e", "+");
            
            System.out.println("sub5 "+sub5);
            
            char sub6=t.getSchool().charAt(t.getSchool().length()-1);
            
            System.out.println("sub6 "+sub6);
            
            StringBuilder sb=new StringBuilder(t.getSubject());
            
            sb.append("city");
             System.out.println(sb+" ");
             StringBuilder sb2=new StringBuilder(t.getSubject());
            sb2.insert(2, "e");
             System.out.println(sb2+" ");
             StringBuilder sb3=new StringBuilder(t.getSubject());
            sb3.insert(1, "oop");
             
             System.out.println(sb3+" ");
             StringBuilder sb4=new StringBuilder(t.getSubject());
            sb4.insert(6, 3);
             System.out.println(sb4+" ");
             StringBuilder sb5=new StringBuilder(t.getSubject());
            sb5.reverse();
             System.out.println(sb5+" ");
             StringBuilder sb6=new StringBuilder(t.getSubject());
            sb6.delete(3, 4);
            
            System.out.println(sb6+" ");
            
            
            
            
            
            
            
            
        }
    }
    
}
