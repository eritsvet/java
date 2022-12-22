package ru.mirea2.pr7.ex4;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double x, double pow) {

        int tmp = 1;
        for (int i = 1; i < pow; i++) tmp *= x;
        return tmp;
    }

    @Override
    public double complexModule(double x, double y) {
        return Math.sqrt(pow(x, 2d) + pow(y, 2d));
    }

    public double calcCircleLen(Double radius) {
        return MathCalculable.PI * 2 * radius;
    }
}
