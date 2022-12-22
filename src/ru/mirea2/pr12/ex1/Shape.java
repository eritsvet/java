package ru.mirea2.pr12.ex1;

public class Shape {

    RGBColor color;
    Point center;

    public Shape(int red, int green, int blue, int x, int y){
        this.color = new RGBColor(red, green, blue);
        this.center = new Point(x, y);
    }

}
