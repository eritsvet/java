package ru.mirea2.pr3.formoutputstr;

public class Employee
{
    String fullname;
    double salary;

    public Employee(String fullname, double salary)
    {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname()
    {
        return fullname;
    }

    public double getSalary()
    {
        return salary;
    }
}
