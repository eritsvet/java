package ru.mirea.pr1;
import java.lang.*;
public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("Volleyball",65);
        Ball b2 = new Ball("Football",70);
        Ball b3 = new Ball("Tennis");
        b3.setCircleLength(20);
        System.out.println(b1);
        b1.findTheVolume();
        b2.findTheVolume();
        b3.findTheVolume();
    }
}