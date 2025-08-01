/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package structuretest;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class StructureTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc=new Scanner(System.in);
        
        DevelopStructure ds=new DevelopStructure();
        
        double r=sc.nextDouble();
        
        Structure s1=ds.produceStructure(r);
        System.out.println(s1.getstructureVolume());
        
        r=sc.nextDouble();
        double height=sc.nextDouble();
        
        Structure s2=ds.produceStructure(r, height);
        System.out.println(s2.getstructureVolume());
        
        
        double b=sc.nextDouble();
        height=sc.nextDouble();
        double length=sc.nextDouble();
        Structure s3=ds.produceStructure(b, height,length);
        System.out.println(s3.getstructureVolume());
        
        
    }
    
}
