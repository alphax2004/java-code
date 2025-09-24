/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author ASUS
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Paint p=new Paint();
        p.createimage("img.png");
        p.savefile("paint.txt");
        
        System.out.println();
        
        Blender b=new Blender();
        b.createimage("abc.png");
        b.createmodel("abc");
        b.applytexture("def", "efg");
        b.exportproject("igh", "mno");
        b.renderanimation("ing", "opl");
        b.renderfile("qwrs", "good");
        b.savefile("file.txt");
     
       
        
    }
    
}
