package ru.mirea2.pr10;

public class Student implements Comparable <Student>{
    private String name, surname, specialty;
    private int course, group, GPA, compareMethod;

    public Student(String name, String surname, String specialty, int course, int group, int GPA, int compareMethod){
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        this.compareMethod = compareMethod;
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
    public String toString(){
        return "Student: " +
                name +" "+
                surname + ", specialization: " +
                specialty + ", course: " +
                course + ", group:" +
                group + ", GPA: " +
                GPA;
    }
}
