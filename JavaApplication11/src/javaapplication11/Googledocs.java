/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS
 */
public class Googledocs extends Officesuite{
    
    
    @Override
    public void editdoc(String d)
    {
        System.out.println("editing document = "+d);
    }
    @Override
    public void savedoc(String d)
    {
        System.out.println("saving document = "+d);
    }
    @Override
    public void editsheet(String s)
    {
        System.out.println("edit spreadsheet = "+s);
    }
    
    @Override
    public  void formula(String f,String s)
    {
        System.out.println("applying formula = "+f+" to spreadsheet "+s);
    }
    @Override
    public void convertf(String f,String t)
    {
        System.out.println("converting file "+f+" to format "+t);
    }
    @Override
    public void printf(String f)
    {
        System.out.println("printing file "+f);
    }
    public void realtime(String d,String u)
    {
        System.out.println("collaborating on document = "+d+" user "+u);
    }
}
