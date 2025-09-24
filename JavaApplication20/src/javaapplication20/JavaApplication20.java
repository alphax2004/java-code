/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<2;i++)
        {
            String name=sc.nextLine();
            String dateofbirth=sc.nextLine();
            String versity=sc.nextLine();
            
            Student s=new Student(name,dateofbirth,versity);
            StudentCollection.addStudent(s);
        }
        MailGenerator.generateMail(StudentCollection.getStudentList());
    }
    
}
