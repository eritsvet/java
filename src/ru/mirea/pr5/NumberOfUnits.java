package ru.mirea.pr5;

import java.util.Scanner;
//Вариант 11
public class NumberOfUnits
{
    public static int count(int n, int k)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a==0 && n==1) return k;
        if (a!=0 && a!=1) return count(0,k);
        if (a==1)
        {
            k++;
            return count(0,k);
        }
        if (a==0) return count(1,k);
        return 0;
    }
    public static void main(String[] args)
    {
        System.out.println("Количество единиц: " + count(0,0));
    }
}
