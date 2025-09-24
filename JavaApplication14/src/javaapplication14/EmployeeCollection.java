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
public class EmployeeCollection {
    
    private static ArrayList<Employee>employeeList=new ArrayList();
    
    public static void addEmployee(Employee e)
    {
        employeeList.add(e);
    }

    public static ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    
}
