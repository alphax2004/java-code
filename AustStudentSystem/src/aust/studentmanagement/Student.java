/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aust.studentmanagement;



/**
 *
 * @author ASUS
 */
public class Student {

    private String name;
    private String id;

    public Student(String name, String id) throws InvalidNameException, InvalidIdException {

        char[] a = name.toCharArray();
        
        String[] c=name.split(" ");
    
        if(name.matches("A-Z"))
        {
            throw new InvalidNameException(name);
        }

        if (!name.contains("-") || !name.contains("\"")) {
            throw new InvalidNameException(name);
        }

        if (!id.matches("\\d+") || !id.startsWith("007")) {
            throw new InvalidIdException(id);
        }
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    public void setName(String name) {

        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

}
