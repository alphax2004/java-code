/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
public class Sword extends Weapon{
    
    @Override
    public void upgrade()
    {
        level+=2;
        System.out.print(level);
    }
}
