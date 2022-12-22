package ru.mirea2.pr3.mathrandom.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

class Tester {
    Circle[] arr;
    int n;


    public Tester(int n) {
        Random random = new Random();
        this.n = n;
        arr = new Circle[n];

        for (int i = 0; i < this.n; i++)
            arr[i] = new Circle(random.nextInt(25), random.nextInt(25),
                    random.nextInt(100));
    }

    public Circle minCircle() {
        Circle minCircle = arr[0];

        for (Circle circle : arr) {
            if (circle.getRadius() < minCircle.getRadius())
                minCircle = circle;
        }
        return minCircle;
    }

    public Circle maxCircle() {
        Circle maxCircle = arr[0];

        for (Circle circle : arr) {
            if (circle.getRadius() > maxCircle.getRadius())
                maxCircle = circle;
        }

        return maxCircle;
    }

    public void sortCircles() {
        Arrays.sort(arr, Comparator.comparingInt(Circle::getRadius));
    }

    public String toString() {
        String returnString = "";

        for (Circle circle : arr) {
            returnString += "R = " +circle.getRadius() + "; ";
        }

        returnString = returnString.substring(0, returnString.length() - 2);

        return returnString;
    }
}