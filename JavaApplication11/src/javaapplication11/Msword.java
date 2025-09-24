/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS
 */
public class Msword extends Documenteditor{
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
}
