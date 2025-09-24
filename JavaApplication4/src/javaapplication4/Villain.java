/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author ASUS
 */
public class Villain extends Character{

    public Villain(double damage, double health) {
        super(damage, health);
    }
    @Override
    public double  attack()
    {
        return getDamage()*MultiplerUtils.getRandomNerf();
    }
}
