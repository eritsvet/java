package ru.mirea2.pr7.ex4;

public class TestMathCalculate {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println(mc1.pow(3,4));
        System.out.println(mc1.complexModule(3,4));
        System.out.println(new MathFunc().calcCircleLen(10d));
    }
}
