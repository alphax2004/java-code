/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author ASUS
 */
public class Whatsapp extends Modernmessenger{
    
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

    /**
     *
     * @param R
     */
    @Override
    public void sendcall(String R)
    {
        System.out.println("calling = "+R);
    }
    @Override
    public void receivecall(String C)
    {
        System.out.println(C+ " is calling you");
    }
    @Override
    public void sendphoto(String R,String I)
    {
        System.out.println("sending "+R+" the image "+I);
    }
    @Override
    public void receivephoto(String S,String I)
    {
        System.out.println(S+" snet you the image "+I);
    }
    
    public void status(String T)
    {
        System.out.println("message is "+T);
    }

    
}
