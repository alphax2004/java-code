/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ASUS
 */
public abstract class Media {
    private String title;
    private double basescore;

    public Media(String title, double basescore) {
        this.title = title;
        this.basescore = basescore;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasescore() {
        return basescore;
    }

    public void setBasescore(double basescore) {
        this.basescore = basescore;
    }
    public abstract double getsuitability(Member m);
}
