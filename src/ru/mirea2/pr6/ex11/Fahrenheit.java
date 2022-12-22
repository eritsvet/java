package ru.mirea2.pr6.ex11;

public class Fahrenheit implements Convertable{
    @Override
    public double convert(double x) {
        return 1.8*x + 32;
    }
}