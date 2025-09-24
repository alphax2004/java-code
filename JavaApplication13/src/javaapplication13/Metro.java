/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author ASUS
 */
public class Metro extends Transport {
    
    /**
     *
     * @param v
     * @param n
     */
    @Override
    public void register(String v,String n)
    {
        System.out.println("register "+v+" number "+n);
    }
    @Override
    public void remove(String v,String n)
    {
       System.out.println("remove "+v+" number "+n);
    }
    
    @Override
    public void createroute(String r,String s,String d)
    {
        System.out.println("route "+r+" from "+s+" to "+d);
    }
    
    @Override
    public void deleteroute(String r)
    {
        System.out.println("delete "+r);
    }
    @Override
    public void allocateDriver(String dr,String v)
    {
        System.out.println("driver "+dr+" vehivle "+v);
    }
    
    @Override
    public void schedule(String sch,String r,String v)
    {
        System.out.println("schedule "+sch+" route "+r+" vehicle "+v);
    }
    public void add(String st,String r)
    {
        System.out.println("station "+st+" route "+r);
    }
    public void remivest(String st,String r)
    {
        System.out.println("remove "+st+" route "+r);
    }
}
