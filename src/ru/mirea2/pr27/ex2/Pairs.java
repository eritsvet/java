package ru.mirea2.pr27.ex2;

public class Pairs {


    public static void main(String[] args) {
        WorkWithMap work = new WorkWithMap();

        work.addValues("Erica","Tsvetkova");
        work.addValues("Julia","Soldatenkova");
        work.addValues("Julia","Shutko");
        work.addValues("Egor","Shutko");

        System.out.println(work.getSameFirstNameCount());
        System.out.println(work.getSameLastNameCount());

    }
}