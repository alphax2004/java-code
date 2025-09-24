/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

import static java.lang.constant.ConstantDescs.NULL;

/**
 *
 * @author ASUS
 */
public class Word {
    public void open(String filename)
    {
        if(filename==NULL)
        {
            throw new SecurityException("file not found");
        }
        String s=filename.toLowerCase();
        if(s.endsWith(".doc")||s.endsWith(".docx"))
        {
            System.out.println("microsoft has opened "+filename);
        }
        else
        {
            throw new SecurityException("cannot open the file "+filename);
        }
    }
    
}
