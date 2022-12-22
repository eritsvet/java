package ru.mirea2.pr8;

import java.util.Scanner;
//Количество единиц
public class Ex11 {
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
