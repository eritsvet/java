package ru.mirea2.pr3.mathrandom.ex3;

import java.util.Arrays;
import java.util.Random;

public class IncSequence
{
    public static void main(String[] args){
        int[]arr = new int [4];
        for(int i = 0; i < 4; i++){
            arr[i] = new Random().nextInt(10,100);
        }
        System.out.print("Массив: ");
        for(int i = 0; i < 4; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n" + ifIncreasing(arr));
    }

    public static boolean ifIncreasing(int[]arr){
        for(int i = 1; i < 4; i++){
            if (arr[i] <= arr[i-1]) return false;
        }
        return true;
    }
}
