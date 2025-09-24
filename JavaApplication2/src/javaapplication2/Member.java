/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author ASUS
 */
public class Member {
    
    private String name;
    private int readinglevel;

    public Member(String name, int readinglevel) {
        this.name = name;
        this.readinglevel = readinglevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReadinglevel() {
        return readinglevel;
    }

    public void setReadinglevel(int readinglevel) {
        this.readinglevel = readinglevel;
    }
    
    
}
