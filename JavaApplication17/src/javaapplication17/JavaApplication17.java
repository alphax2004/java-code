/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author ASUS
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher tt=new Teacher("abid hossain","econimics","cantonment");
        
        TeacherCollection.addTeacher(tt);
        
        MailGenerator.generateMailAddress(TeacherCollection.getTeacherList());
    }
    
}
