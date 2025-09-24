/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;

import airlineexception.BuyTickets;
import airlineexception.IDNumberInvalidException;
import airlineexception.NotApplicableForDiscountException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BuyTickets b = new BuyTickets();
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            double price = sc.nextDouble();
            
            String type = sc.nextLine();
            String id = sc.nextLine();
            b.giveDiscount(age, price);
            b.checkid(type,id);

        } catch (NotApplicableForDiscountException | IDNumberInvalidException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }

    
}
