package ru.mirea2.pr8;

import java.util.Scanner;
//Вывести члены последовательности с нечетными номерами
public class Ex13 {
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
