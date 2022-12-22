package ru.mirea2.pr3.shells;

public class Main {
    public static void main(String[] args){
        Double d1 = Double.valueOf(1.0);
        Double d2 = Double.valueOf(2.0765);
        Double d3 = Double.parseDouble("0.5");
        Double d4 = Double.parseDouble("7.4");
        int id1 = d1.intValue();
        short sd1 = d1.shortValue();
        byte bd1 = d1.byteValue();
        long ld1 = d1.longValue();
        float fd1 = d1.floatValue();
        double dd1 = d1.doubleValue();

        System.out.println(Double.toString(d1));
        System.out.println(d2.toString());
        System.out.println(String.valueOf(3.14));
        System.out.println(Integer.toString(id1));
    }
}
