/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Library {
    
    private static ArrayList<Media>availablemedia=new ArrayList<>();
    
    public static void addmedia(Media m)
    {
        availablemedia.add(m);
    }
    public static  Media recommendmedia(Member m)
    {
        Media highestscore=availablemedia.get(0);
        
        int highestscoreidx=0;
        
        for(int j=0;j<availablemedia.size();j++)
        {
            if(availablemedia.get(j).getsuitability(m)>highestscore.getsuitability(m))
            {
                highestscore=availablemedia.get(j);
                highestscoreidx=j;
            }
            
            
        }
        availablemedia.remove(highestscoreidx);
        return highestscore;
    }
    
}
