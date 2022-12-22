package ru.mirea.pr2;
import java.lang.*;
public class Author {
    public String name;
    public String email;
    public char gender;
    public Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender = g;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public char getGender()
    {
        return gender;
    }
    public String toString()
    {
        String s;
        if (gender=='M')
            s="m";
        else
            if (gender =='F')
                s="ms";
            else
                s="gender is not specified";
        return this.name + " (" +s+") at " + this.email;
    }
}
