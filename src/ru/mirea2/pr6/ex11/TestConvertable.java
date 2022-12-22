package ru.mirea2.pr6.ex11;

import java.util.Scanner;

public class TestConvertable {
    public static void main(String[] args) {
        double temperature;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите температуру:");
        temperature = s.nextDouble();
        System.out.println("Температура по Цельсию: " + temperature);
        System.out.println("Температура по Кельвину: " + new Kelvin().convert(temperature));
        System.out.printf("Температура по Фаренгейту: %.2f" , new Fahrenheit().convert(temperature));
    }
}
