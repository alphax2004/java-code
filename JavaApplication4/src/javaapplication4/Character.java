/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author ASUS
 */
public abstract class Character {
    
    private double damage;
    private double health;

    public Character(double damage, double health) {
        this.damage = damage;
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    public abstract double attack();
    
    public void takeDamage(Character c)
    {
        this.health-=c.attack();
    }
    
    
}
