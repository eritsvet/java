package ru.mirea2.pr22.ex2;

public class EmptyStackException extends Exception{
    public EmptyStackException(){
        super("Stack is empty! Retry with another expression");
    }
}
