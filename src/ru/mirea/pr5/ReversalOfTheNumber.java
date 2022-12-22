package ru.mirea.pr5;

import java.util.Scanner;
//Вариант 10
public class ReversalOfTheNumber
{
    public static int reverse(int a, int x)
    {
        if (a<=0) return x;
        x=x*10;
        x=x+a%10;
        a=a/10;
        return reverse(a,x);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = s.nextInt();
        System.out.println("Разворот числа: " + reverse(a,0));
    }
}
