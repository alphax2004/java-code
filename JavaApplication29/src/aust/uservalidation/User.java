/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aust.uservalidation;

/**
 *
 * @author ASUS
 */
public final class User {

    private String username;
    private String id;
    private double salary;

    public String getUsername() {
        return username;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public User(String username, String id, double salary) throws Invalidnameexception, Invalididexception, Invalidsalaryexception {
        setUsername(username);
        setId(id);
        setSalary(salary);
    }

    public void setUsername(String username) throws Invalidnameexception {

        if (username == null && username.isEmpty()) {
            throw new Invalidnameexception(username);
        }
        String[] parts = username.split(" ");
        for (String j : parts) {
            if (!Character.isUpperCase(j.charAt(0))) {
                throw new Invalidnameexception(username);
            }
        }
        this.username = username;
    }

    public void setId(String id) throws Invalididexception {

        String idstr = id;

        if (!idstr.matches("\\d+") ||!idstr.startsWith("73")) {
            throw new Invalididexception(id);
        }
        if (idstr.equals("0")) {
            throw new Invalididexception(id);
        }
        this.id = id;
    }

    public void setSalary(double salary) throws Invalidsalaryexception {

        if (salary < 0) {
            throw new Invalidsalaryexception(salary);
        }
        this.salary = salary;
    }

}
