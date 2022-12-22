package ru.mirea2.pr29;


public class IllegalAdress extends Error{
    public IllegalAdress(String adress){
        super("There is no such adress " + adress + "");
    }
}
