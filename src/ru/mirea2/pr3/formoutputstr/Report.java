package ru.mirea2.pr3.formoutputstr;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Report
{

    public Report(int iLength, ArrayList<Employee> alEmployee)
    {
        for(int i =0; i < iLength; i++)
        {
            int n=i+1;
            String s = "Сотрудник " + n;
            alEmployee.add(new Employee(s, (i+1)*10000 ));
        }
    }

    public static void generateReport(ArrayList<Employee> listOfEmployees)
    {
        Formatter formatter = new Formatter();

        for (Employee employee : listOfEmployees)
        {
            formatter.format("%-30s %30.2f \n", employee.getFullname(), employee.getSalary());
        }
        System.out.println(formatter);
    }

    public static void main(String[] args)
    {
        ArrayList<Employee> alEmployee = new ArrayList<>();
        Report report =  new Report(10, alEmployee);
        report.generateReport(alEmployee);
    }
}
