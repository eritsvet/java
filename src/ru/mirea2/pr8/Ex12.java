package ru.mirea2.pr8;

import java.util.Scanner;
//Вывести нечетные числа пооследовательности
public class Ex12 {
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
