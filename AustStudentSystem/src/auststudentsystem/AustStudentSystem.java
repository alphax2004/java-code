/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auststudentsystem;

import aust.studentmanagement.*;

/**
 *
 * @author ASUS
 */
public class AustStudentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            Student s=new Student("alfa abc","007123456");
            System.out.println(s.getName()+" "+s.getId());
        }catch(InvalidNameException|InvalidIdException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
