package ru.mirea2.pr19;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(){
        super("Student not found");
    }
}