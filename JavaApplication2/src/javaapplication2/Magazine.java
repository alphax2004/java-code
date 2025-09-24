/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ASUS
 */
public class Magazine extends Media {
    
    private double optimallevel;

    public Magazine(double optimallevel, String title, double basescore) {
        super(title, basescore);
        this.optimallevel = optimallevel;
    }

    public double getOptimallevel() {
        return optimallevel;
    }

    public void setOptimallevel(double optimallevel) {
        this.optimallevel = optimallevel;
    }
    @Override
    public double getsuitability(Member m)
    {
         double ans = super.getBasescore() - Math.abs(m.getReadinglevel() - this.optimallevel);
         return ans;
    }
    
}
