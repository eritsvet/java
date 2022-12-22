package ru.mirea2.pr11.ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Student implements Comparable <Student> {
    private String name, surname, specialty;
    private int course, group, GPA, compareMethod;
    private Date dateOfBirth;
    private SimpleDateFormat dateFormatter;

    public Student(String name, String surname, String specialty, int course, int group, int GPA, int compareMethod, String dateOfBirth, int dateForm) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        this.compareMethod = compareMethod;
        this.dateOfBirth = new SimpleDateFormat("dd.MM.yyyy").parse(dateOfBirth);
        switch(dateForm){
            case 1: dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z"); break;
            case 2: dateFormatter = new SimpleDateFormat("EEEE, d MMMM, yyyy"); break;
            case 3: dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); break;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public int getGPA() {
        return GPA;
    }

    public int getCompareMethod() {
        return compareMethod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setCompareMethod(int compareMethod) {
        this.compareMethod = compareMethod;
    }

    @Override
    public int compareTo(Student second){
        if (compareMethod == 1){
            return this.GPA - second.GPA;
        }
        if (compareMethod == 2){
            return this.course - second.course;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Student: " +
                name + " " +
                surname + ", specialization: " +
                specialty + ", course: " +
                course + ", group:" +
                group + ", GPA: " +
                GPA+ ", date of birth: " +
                dateFormatter.format(dateOfBirth);
    }
}
