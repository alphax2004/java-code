/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author ASUS
 */
public class Defaultmessage extends Messenger {
    
   
    
    @Override
    public void sendtext(String M,String S,String R)
    {
        System.out.println("sending message = "+M+"from "+S+" to "+R);
    }
    @Override
    public void receivetext(String M,String S)
    {
        System.out.println("receiving message = "+M+" from "+S);
    }
    
    
    
    
}
