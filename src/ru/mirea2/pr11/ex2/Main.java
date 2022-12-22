package ru.mirea2.pr11.ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Введите время:");
        Scanner s = new Scanner(System.in);
        String userDate = s.nextLine();

        Date dateUser = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").parse(userDate);

        Date dateProgram = new Date();

        if (dateUser.compareTo(dateProgram) == 0){
            System.out.println("Пользовательское время равно текущему");
        }
        else if(dateUser.compareTo(dateProgram) == 1){
            System.out.println("Пользовательское время больше текущего");
        }
        else{
            System.out.println("Пользовательское время меньше текущего");
        }
    }
}
