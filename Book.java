
package com.mycompany.bookstore;
public class Book {
    String title;
    String genre;
    int page;
    Book()
    {
        
    }
    Book(String n,String g,int p)
    {
        title=n;
        genre=g;
        page=p;
    }
    String time()
    {
        double speed;
        if(genre.equals("Fiction"))
        {
            speed=1.5;
        }
        else if(genre.equals("Nonfiction"))
        {
            speed=2.0;
        }
        else if(genre.equals("Comics"))
        {
            speed=0.5;
        }
        else
        {
            speed=1.8;
        }
        double t=(page*speed)/60.0;
        
        return "the estimated time reading for "+title+"is "+t+"hours";
    }
}
