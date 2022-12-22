package ru.mirea.pr5;

import java.util.Scanner;

//Вариант 13
public class OddIndex
{
    public static void printOddInd()
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a!=0)
        {
            System.out.println(a);
            int b = s.nextInt();
            if (b!=0) printOddInd();
        }
    }
    public static void main(String[] args)
    {
        printOddInd();
    }
}
