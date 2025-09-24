/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author ASUS
 */
public class Google extends Smarthome {
    
    @Override
    public void lighton(String l,String b)
    {
        System.out.println("trun on light "+l+" brightness "+b);
    }
    @Override
    public void lightoff(String l,String b)
    {
         System.out.println("trun off light "+l+" brightness "+b);
    }
    @Override
    public void thermostaton(String t,String r)
    {
        System.out.println("set temp to "+t+" c at room"+r);
    }

    /**
     *
     * @param r
     */
    @Override
    public void thermostatoff(String r)
    {
         System.out.println("thermostst off at room"+r);
    }
    @Override
    public void door(String d)
    {
        System.out.println("lock door "+d);
    }
    @Override
    public void energy(String u)
    {
        System.out.println("energy "+u);
    }
    public void voice(String c)
            {
                System.out.println("voice command "+c);
            }

   

   
    
    
}
