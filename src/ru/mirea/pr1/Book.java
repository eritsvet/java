package ru.mirea.pr1;
import java.lang.*;
public class Book
{
    private String title;
    private int pages;

    public Book(String t, int p)
    {
        title = t;
        pages = p;
    }
    public Book(String t)
    {
        title = t;
        pages = 0;
    }
    public Book()
    {
        title = "Book";
        pages = 0;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPages()
    {
        return pages;
    }
    public String toString()
    {
        return "<<" + this.title + ">>, " + this.pages + " pages";
    }
    public void findTheReadingTime()
    {
        double t = pages/50.0;
        String formattedDouble = String.format("%.2f",t);
        System.out.println("<<" + title +">> can be read in "+ formattedDouble +" hours");
    }
}
