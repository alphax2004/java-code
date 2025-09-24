/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aust.uservalidation;

/**
 *
 * @author ASUS
 */
public class User {

    private String username;
    private int id;

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public User(String username, int id) throws Invalidnameexception, Invalididexception {

        if (username == null && username.isEmpty()) {
            throw new Invalidnameexception(username);
        }

        String[] parts = username.split(" ");

        for (String i : parts) {
            if (!Character.isUpperCase(i.charAt(0))) {
                throw new Invalidnameexception(username);
            }
        }
        String idstr = Integer.toString(id);
        if (!idstr.matches("\\d+") || !idstr.startsWith("73")) {
            throw new Invalididexception(id);
        }

        this.username = username;
        this.id = id;
    }

}
