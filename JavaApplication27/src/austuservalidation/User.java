/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package austuservalidation;

/**
 *
 * @author ASUS
 */
public class User {
    
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) throws InvalidNameException {
        
        if(name==null&&name.trim().isEmpty())
        {
            throw new InvalidNameException(name);
        }
        String[]parts=name.trim().split(" ");
        for(int i=0;i<parts.length;i++)
        {
            String j=parts[i];
            if(!Character.isUpperCase(j.charAt(0)))
            {
                throw new InvalidNameException(name);
            }
        }
        this.name = name;
    }

    public void setId(int id) throws InvalididException {
        
        String idstr=Integer.toString(id);
        
        if(!idstr.matches("\\d+")&&!idstr.startsWith("73"))
        {
             throw new InvalididException(id);
            
        } 
        this.id = id;
    }
    
    
    
}
