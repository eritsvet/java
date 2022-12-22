package ru.mirea.pr2;
import ru.mirea.pr1.Ball;

import java.lang.*;
public class TestAuthor
{
    public static void main(String[] args)
    {
        Author a1 = new Author("Ivan Popov","ivpopov@mail.ru", 'M');
        Author a2 = new Author("Anna Ivanova","anivanova@somewhere.com",'F');
        a2.setEmail("anivanova@mail.ru");
        System.out.println(a1);
        System.out.println(a2);
    }
}
