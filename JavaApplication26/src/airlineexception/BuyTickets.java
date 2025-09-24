/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlineexception;

/**
 *
 * @author ASUS
 */
public class BuyTickets extends Ticket {

    public void checkid(String type, String ID) throws IDNumberInvalidException {
        if (type.equals("passport") && ID.length() != 9) {
            throw new IDNumberInvalidException("passport no invalid");
        } else if (type.equals("nid") && ID.length() != 10) {
            throw new IDNumberInvalidException("nid is invalid");
        } else {
            System.out.println("id is valid");
        }
    }
}
