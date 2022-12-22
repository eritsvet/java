package ru.mirea2.pr11.ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Developer {
    private String surname;
    private Date startDate;
    private  Date endDate;

    private Date startTime;
    private Date endTime;

    public Developer(String stDeveloperName, Date startDate, Date startTime) {
        this.surname = stDeveloperName;
        this.startDate = startDate;
        this.startTime = startTime;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String stDeveloperName) {
        this.surname = stDeveloperName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString(){
        return "Разработчик: "
                + surname
                + "\nДата получения задания: "+ new SimpleDateFormat("E dd.MM.yyyy" ).format(startDate)
                + " время: "+ new SimpleDateFormat("hh:mm" ).format(startTime)
                + "\nДата сдачи задания: "+ new SimpleDateFormat("E dd.MM.yyyy" ).format(endDate)
                + " время: " + new SimpleDateFormat("hh:mm" ).format(endTime);
    }
}
