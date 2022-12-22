package ru.mirea.pr5;

import java.util.Scanner;

//Вариант 12
public class OddNumbers
{
    public static void printOddNum()
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a%2!=0) System.out.println(a);
        if (a!=0) printOddNum();
    }
    public static void main(String[] args)
    {
        printOddNum();
    }
}
