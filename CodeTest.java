/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codetest;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class CodeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        CodeFactory cf=new CodeFactory();
        
        int methods=sc.nextInt();
        
        Code c1=cf.createCode(methods);
        System.out.println(c1.getLinesOfCode());
        methods=sc.nextInt();
        int linesPerMethods=sc.nextInt();
        
        Code c2=cf.createCode(methods, linesPerMethods);
        System.out.println(c2.getLinesOfCode());
        methods=sc.nextInt();
        linesPerMethods=sc.nextInt();
        int reductantLinePerMethod=sc.nextInt();
        
        Code c3=cf.createCode(methods, linesPerMethods, reductantLinePerMethod);
        
        
        
        System.out.println(c3.getLinesOfCode());
    }
    
}
