/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;

/**
 *
 * @author ASUS
 */
public class even extends Thread{
    
    @Override
    public void run()
    {
        count();
    }

    public void count()  {
        try {
            for (int i = 1; i < 500; i += 2) {
                System.out.println("odd " + i);
                Thread.sleep(10);
            }
        } catch (Exception ex) {
        }
    }

}


