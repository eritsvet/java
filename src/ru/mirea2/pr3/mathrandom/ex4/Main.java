package ru.mirea2.pr3.mathrandom.ex4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = -1;
        int length = 0;
        Scanner s = new Scanner(System.in);

        Random rand = new Random();

        while (n < 0){
            System.out.println("Введите размер массива: ");
            n = s.nextInt();
        }

        int[] arr = new int[n];

        for (int  i = 0; i < n; i++){
            arr[i] = (rand).nextInt(n+1);
            if (arr[i] % 2 == 0) length++;
        }
        System.out.println("Массив: " + Arrays.toString(arr));

        if (length == 0) return;

        int[] arr2 = new int[length];
        length = 0;
        for(int i = 0; i < n; i++) if (arr[i] % 2 == 0) arr2[length++] = arr[i];

        System.out.println("Массив из четных элементов первого: " + Arrays.toString(arr2));
    }
}
