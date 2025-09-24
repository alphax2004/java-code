/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;

/**
 *
 * @author ASUS
 */
public class odd extends Thread {
    
    @Override
    public void run()
    {
        count();
    }

    public void count() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("even" + i);
                 Thread.sleep(10);
            }
        } catch (Exception e) {

        }

    }

}
