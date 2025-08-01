/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author HP
 */
public class Developer {
    
    private int project;
    private int mon;
    
    Developer(int project,int mon)
    {
        this.project=project;
        this.mon=mon;
    }
    public int getprojects()
    {
        return project;
    }
    public void setproject(int project)
    {
        this.project=project;
    }
    public int getmon()
    {
        return mon;
    }
    public void setmon(int mon)
    {
        this.mon=mon;
    }
}
