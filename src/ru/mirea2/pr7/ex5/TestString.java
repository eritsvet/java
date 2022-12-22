package ru.mirea2.pr7.ex5;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        System.out.println("Введите стоку:");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        ProcessString str = new ProcessString(s);
        System.out.println(str.getLen());
        System.out.println(str.getOddChar());
        System.out.println(str.reverse());
    }
}
