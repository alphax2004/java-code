/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author ASUS
 */
public class Paint extends Graphicsoftware {
    
    @Override
    public void createimage(String imagefile)
    {
        System.out.println("Drawing image : "+imagefile);
    }
    @Override
    public void savefile(String filename)
    {
        System.out.println("saving file : "+filename);
    }
}
