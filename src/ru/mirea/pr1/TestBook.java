package ru.mirea.pr1;
import java.lang.*;
public class TestBook
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Romeo and Juliet",272);
        Book b2 = new Book("War and Piece",1300);
        Book b3 = new Book();
        b3.setTitle("Pride and Prejudice");
        b3.setPages(416);
        System.out.println(b1);
        b1.findTheReadingTime();
        b2.findTheReadingTime();
        b3.findTheReadingTime();
    }
}