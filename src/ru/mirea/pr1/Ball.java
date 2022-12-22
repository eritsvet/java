package ru.mirea.pr1;
import java.lang.*;
public class Ball {
    private String sportType;
    private int circleLength;
    public Ball(String s, int l)
    {
        sportType = s;
        circleLength = l;
    }
    public Ball(String s)
    {
        sportType = s;
        circleLength = 0;
    }
    public Ball()
    {
        sportType = "Ball game";
        circleLength = 0;
    }
    public void setCircleLength(int circleLength)
    {
        this.circleLength = circleLength;
    }
    public void setSportType(String sportType)
    {
        this.sportType=sportType;
    }
    public String getSportType()
    {
        return sportType;
    }
    public int getCircleLength()
    {
        return circleLength;
    }
    public String toString()
    {
        return this.sportType + " ball, circle length is " + this.circleLength + " cm";
    }
    public void findTheVolume()
    {
        double V;
        V = (circleLength*circleLength*circleLength)/(6*3.14*3.14);
        String formattedDouble = String.format("%.2f",V);
        System.out.println("The volume of a "+sportType+" ball is " + formattedDouble + " cubic centimetres");
    }
}
