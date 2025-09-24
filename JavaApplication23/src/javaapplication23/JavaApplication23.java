/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author ASUS
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Word w=new Word();
        Powerpoint p=new Powerpoint();
        
        try
        {
            w.open("online8.doc");
        }catch(SecurityException se){
            System.out.println(se.getMessage());
        }
        try{
            p.open("online8.ppt");
        }catch(FileNotFoundException fe){
           System.out.println(fe.getMessage());
        }
        try{
            w.open("online8.xlsx");
        }catch(SecurityException se){
            System.out.println(se.getMessage());
        }
    }
    
}
