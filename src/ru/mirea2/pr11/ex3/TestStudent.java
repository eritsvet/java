package ru.mirea2.pr11.ex3;

import java.text.ParseException;
import java.util.Random;

public class TestStudent {
    public static void main(String[] args) throws ParseException {
        Student student1 = new Student("TMP Name", "TMP surname", "TMP speciality", 1, 2, 83, 1,"02.12.2005", 2);
        System.out.println(student1);
    }
}
