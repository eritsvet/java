package ru.mirea2.pr11.ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDeveloper {

    public static void main(String[] args) throws ParseException {
        Developer d = new Developer("Иванов", (new SimpleDateFormat("dd.MM.yyyy")).parse("21.04.2020"),(new SimpleDateFormat("hh.mm")).parse("11.00"));
        d.setEndDate(new Date());
        d.setEndTime(new Date());
        System.out.println(d);
    }
}
