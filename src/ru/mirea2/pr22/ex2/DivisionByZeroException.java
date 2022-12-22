package ru.mirea2.pr22.ex2;


public class DivisionByZeroException extends Exception {

    public DivisionByZeroException(){
        super("Division by zero! Retry with another expression");
    }
}
