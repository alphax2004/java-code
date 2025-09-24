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
public class StudentCollection {
    
    private static ArrayList<Student>studentList=new ArrayList<>();
    
    
    public static void addStudent(Student s)
    {
        studentList.add(s);
    }

    public static ArrayList<Student> getStudentList() {
        return studentList;
    }
    
}
