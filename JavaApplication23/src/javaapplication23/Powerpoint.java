/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication23;

import java.io.FileNotFoundException;
import static java.lang.constant.ConstantDescs.NULL;

/**
 *
 * @author ASUS
 */
public class Powerpoint {
    
    public void open(String filename) throws FileNotFoundException
    {
        if(filename==NULL)
        {
            throw new FileNotFoundException("not found");
        }
        String r=filename.toLowerCase();
        if(r.endsWith(".ppt")||r.endsWith(".pps"))
            
        {
            System.out.println("microsoft powerpoint has opened "+filename);
        }
        else
        {
            throw new FileNotFoundException("not found");
        }
    }
    
}
