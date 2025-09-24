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

    public User(String username,int id) throws InvalidNameException, InvalidIdException {
        setUsername(username);
        setId(id);
    }
    
    

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) throws InvalidNameException {

        if (username == null && username.trim().isEmpty()) {
            throw new InvalidNameException(username);
        }
        String[] part = username.trim().split(" ");

        for (String i : part) {
            if (!Character.isUpperCase(i.charAt(0))) {
                throw new InvalidNameException(username);
            }
        }

        this.username = username;
    }

    public void setId(int id) throws InvalidIdException {

        String idstr = Integer.toString(id);

        if (!idstr.matches("\\d+") && !idstr.startsWith("73")) {
            throw new InvalidIdException(id);
        }

        this.id = id;
    }

}
