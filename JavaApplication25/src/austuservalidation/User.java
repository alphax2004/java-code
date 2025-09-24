/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package austuservalidation;

/**
 *
 * @author ASUS
 */
public final class User {

    private String name;
    private int id;

    public User() {
    }

    public User(String name, int id) throws InvalidNameException, InvalidIdException {
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) throws InvalidNameException {

        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException(name);
        }
        String[] parts = name.trim().split(" ");

        for (String part : parts) {
            if (part.isEmpty() || !Character.isUpperCase(part.charAt(0))) {
                throw new InvalidNameException(name);
            }
        }

        this.name = name;
    }

    public void setId(int id) throws InvalidIdException {

        String idstr = Integer.toString(id);

        if (!idstr.matches("\\d+") || !idstr.startsWith("73")) {
            throw new InvalidIdException(id);
        }

        this.id = id;
    }

}
