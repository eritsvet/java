package ru.mirea2.pr29;

public class OrderAlreadyException extends Exception{
    public OrderAlreadyException(String adress){
        super("The order for " + adress + " is added!");
    }
}
