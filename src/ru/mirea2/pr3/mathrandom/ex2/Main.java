package ru.mirea2.pr3.mathrandom.ex2;

public class Main {
    public static void main(String[] args) {

        Tester testCircles = new Tester(10);

        System.out.println("Массив объектов Circle: " + testCircles.toString());
        System.out.println("Наименьшая окружность: R = " + testCircles.minCircle().getRadius());
        System.out.println("Наибольшая окружность: R = " + testCircles.maxCircle().getRadius());
        testCircles.sortCircles();
        System.out.println("Упорядоченный массив: " + testCircles.toString());
        System.out.println("\n\n");

    }
}
