package ru.mirea2.pr19;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> alStudents = new ArrayList<>();
        alStudents.add(new Student("Aleksey", "Alekseev", "Designer",3, "IIII-21-21",4));
        alStudents.add(new Student("Ivan", "Ivanov", "Drawer", 4, "IIII-20-22", 5));
        new LabClassUI(alStudents);
    }
}