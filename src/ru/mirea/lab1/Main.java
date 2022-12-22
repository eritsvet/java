package ru.mirea.lab1;
import java.util.Scanner;
//Вариант 1
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        final int N = 10;
        int sum=0, i;
        int[]Arr = new int [N];
        System.out.println("Введите элементы массива:");
        for (i = 0; i < N; i++)
            Arr[i]=s.nextInt();
        System.out.println("Каким способом осуществить сложение элементов массива?");
        System.out.println("1 - с помощью цикла for");
        System.out.println("2 - с помощью цикла while");
        System.out.println("3 - с помощью цикла do while");
        int x = s.nextInt();
        i=0;
        switch (x)
        {
            case 1:
                for (i = 0; i < N; i++)
                    sum=sum+Arr[i];
                break;
            case 2:
                while(i<N)
                {
                    sum=sum+Arr[i];
                    i++;
                }
                break;
            case 3:
                do
                {
                    sum=sum+Arr[i];
                    i++;
                } while (i<N);
                break;
        }
        System.out.println("Сумма чисел массива = "+sum);
    }
}
