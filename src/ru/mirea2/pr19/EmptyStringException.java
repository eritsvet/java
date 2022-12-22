package ru.mirea2.pr19;

public class EmptyStringException extends IllegalArgumentException{
    public EmptyStringException(){
        super("Empty string not allowed");
    }

}