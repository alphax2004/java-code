/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author ASUS
 */
public class Blender extends Creativesuite{
    
    @Override
    public void renderfile(String filename,String quality)
    {
        System.out.println("rendering file : "+filename+" at quality : "+quality);
    }
    @Override
    public void exportproject(String projectname,String target)
    {
        System.out.println("exporting project : "+projectname+" to format : "+target);
    }
    @Override
    public void createimage(String imagefile)
    {
        System.out.println("drawing image : "+imagefile);
    }

    /**
     *
     * @param filename
     */
    @Override
    public void savefile(String filename)
    {
        System.out.println("saving file : "+filename);
    }
    @Override
    public void createmodel(String modelname)
    {
        System.out.println("creating 3d model : "+modelname);
    }
    @Override
    public void applytexture(String texturename,String modelname)
    {
        System.out.println("apply texture : "+texturename+" to model : "+modelname);
    }
    public void renderanimation(String animationname,String framerate)
    {
        System.out.println("render animation : "+ animationname+" at frame rate "+framerate);
    }
}
