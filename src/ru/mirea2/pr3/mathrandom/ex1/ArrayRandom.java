package ru.mirea2.pr3.mathrandom.ex1;

import java.util.ArrayList;
import java.util.Random;

public class ArrayRandom
{
    public static void main(String[] args)
    {
        ArrayList <Double> First = new ArrayList<>();
        ArrayList <Double> Second = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10 ; i ++)
        {
            First.add(Math.random()*1000);
            Second.add(rand.nextDouble(1000));
        }
        System.out.println("First " + First.toString());
        System.out.println("Second " + Second.toString());
        First.sort(Double::compareTo);
        Second.sort(Double::compareTo);
        System.out.println("First " + First.toString());
        System.out.println("Second " + Second.toString());
    }
}
