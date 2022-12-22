package ru.mirea2.pr22.ex2;

public class DoubleParseException extends Exception{
    public DoubleParseException(){
        super("Wrong value! Try another expression");
    }
}