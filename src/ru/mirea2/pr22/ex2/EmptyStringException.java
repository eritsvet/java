package ru.mirea2.pr22.ex2;

public class EmptyStringException extends Exception{
    public EmptyStringException(){
        super("Empty string not allowed");
    }
}