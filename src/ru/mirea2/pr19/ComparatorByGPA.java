package ru.mirea2.pr19;

import java.util.Comparator;

public class ComparatorByGPA implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second){
        return first.getGPAScore() - second.getGPAScore();
    }
}