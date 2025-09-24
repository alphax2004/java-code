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
public class TeacherCollection {
    
    private static ArrayList<Teacher>teacherList=new ArrayList<>();
    
    
    public static void addTeacher(Teacher t)
    {
        teacherList.add(t);
    }

    public static ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }
    
    
}
